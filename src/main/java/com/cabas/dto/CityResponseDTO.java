package com.cabas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CityResponseDTO {
    private String cityName;
    private Integer cityId;
    private Integer areaId;
}
