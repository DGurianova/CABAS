package com.cabas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Builder
public class CreateAreaRequestDTO {
    @NotNull
    private String areaName;
}

