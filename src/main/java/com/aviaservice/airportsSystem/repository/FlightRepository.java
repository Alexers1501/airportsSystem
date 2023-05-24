package com.aviaservice.airportsSystem.repository;

import com.aviaservice.airportsSystem.dto.Flight;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightRepository extends CrudRepository<Flight> implements IFlightRepository{


}
