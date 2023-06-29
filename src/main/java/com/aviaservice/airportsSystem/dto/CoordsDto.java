package com.aviaservice.airportsSystem.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CoordsDto {

    private BigDecimal lon;

    private BigDecimal lat;
}
