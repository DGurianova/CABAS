package com.cabas.service;

import com.cabas.dto.CityRequestDTO;
import com.cabas.dto.CityResponseDTO;
import com.cabas.persistance.entity.City;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Override
    public City createCity(CityRequestDTO request) {
        return null;
    }

    @Override
    public CityResponseDTO getCityByName(String name) {
        return null;
    }

    @Override
    public CityResponseDTO getCityById(Integer cityId) {
        return null;
    }

    @Override
    public List<CityResponseDTO> getAllCities() {
        return null;
    }
}
