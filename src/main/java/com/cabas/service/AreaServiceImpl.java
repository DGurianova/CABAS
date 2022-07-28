package com.cabas.service;

import com.cabas.dto.AreaResponseDTO;
import com.cabas.dto.CreateAreaRequestDTO;
import com.cabas.persistance.entity.Area;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Override
    public Area createArea(CreateAreaRequestDTO request) {
        return null;
    }

    @Override
    public AreaResponseDTO getAreaByName(String name) {
        return null;
    }

    @Override
    public List<AreaResponseDTO> getAllAreas() {
        return null;
    }
}
