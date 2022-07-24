package gud.template.service;

import gud.template.dto.CityRequestDTO;
import gud.template.dto.CityResponseDTO;
import gud.template.persistance.entity.Area;
import gud.template.persistance.entity.City;

import java.util.List;

public interface CityService {
    City createCity(CityRequestDTO request);

    CityResponseDTO getCityByName(String name);

    CityResponseDTO getCityById(Integer cityId);

    List<CityResponseDTO> getAllCities();


}
