package com.cabas.service;

import com.cabas.persistance.entity.City;
import com.cabas.dto.CityRequestDTO;
import com.cabas.dto.CityResponseDTO;

import java.util.List;

public interface CityService {
    City createCity(CityRequestDTO request);

    CityResponseDTO getCityByName(String name);

    CityResponseDTO getCityById(Integer cityId);

    List<CityResponseDTO> getAllCities();


}
