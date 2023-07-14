package com.aviaservice.airportsSystem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SearchFlightDto {

    @NotNull
    private String cityFrom;

    @NotNull
    private String cityTo;

    @NotNull
    private LocalDate departureDate;

    private LocalDate returnDate;

    private int passengersCount = 1;
}
