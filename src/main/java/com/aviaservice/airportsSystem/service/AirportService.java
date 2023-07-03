package com.aviaservice.airportsSystem.service;

import com.aviaservice.airportsSystem.entity.Airport;
import com.aviaservice.airportsSystem.repository.IAirportRepository;
import com.aviaservice.airportsSystem.repository.IBaseRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class AirportService extends CrudService<Airport> implements IAirportService{

    @Autowired
    IAirportRepository airportRepository;

    String accessGeopifyKey;

    public AirportService(IAirportRepository airportRepository, @Value("${geopify.api.key}") String geopifyKey) {
        this.airportRepository = airportRepository;
        this.accessGeopifyKey = geopifyKey;
    }

    @Override
    public IBaseRepository<Airport> getRepository() {
        return airportRepository;
    }

    @Override
    protected void validate(Airport entity) {
        // todo
    }

    @Override
    public Airport save(Airport entity){

        String url = "https://api.geoapify.com/v1/geocode/search?" +
                "text=аэропорт "+ entity.getName() + " " + entity.getAirportCode() +
                "&name=" + entity.getName() +
                "&city=" + entity.getCity() +
                "&limit=1" +
                "&lang=ru" +
                "&format=json" +
                "&apiKey=" + accessGeopifyKey;

        RestTemplate restTemplate = new RestTemplate();
        String responseJson = restTemplate.getForObject(url, String.class);

        ObjectMapper objectMapper = new ObjectMapper();

        try{
            Map<String, List<Map<String, Object>>> map = objectMapper.readValue(responseJson, Map.class);

            entity.setLat((double) map.get("results").get(0).get("lat"));
            entity.setLon((double) map.get("results").get(0).get("lon"));

        } catch (JsonProcessingException exception){
            log.error("Ошибка в конвертации json geopify API");
        }

        return super.save(entity);
    }
}
