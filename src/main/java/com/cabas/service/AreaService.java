package com.cabas.service;

import com.cabas.persistance.entity.Area;
import com.cabas.dto.CreateAreaRequestDTO;
import com.cabas.dto.AreaResponseDTO;

import java.util.List;

public interface AreaService {
    Area createArea(CreateAreaRequestDTO request);

    AreaResponseDTO getAreaByName(String name);

    List<AreaResponseDTO> getAllAreas();


}
