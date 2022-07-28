package com.cabas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class MoveCitizenRequestDTO {
    private Integer PersonId;
    private Integer fromCityId;
    private Integer toCityId;
}
