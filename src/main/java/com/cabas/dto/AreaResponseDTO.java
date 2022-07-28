package com.cabas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class AreaResponseDTO {
    private String areaName;
    private Integer areaId;
    List<Integer> cityIds;
}
