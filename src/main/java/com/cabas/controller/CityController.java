package com.cabas.controller;

import com.cabas.dto.CityRequestDTO;
import com.cabas.dto.CityResponseDTO;
import com.cabas.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/api/cities")
    public void createCity(@RequestBody CityRequestDTO request) {
        cityService.createCity(request);
    }

    @GetMapping("/api/cities")
    public List<CityResponseDTO> getAllCities() {
        return cityService.getAllCities();
    }


    @GetMapping("/api/cities?q={name}")
    @ResponseStatus(HttpStatus.CREATED)
    public CityResponseDTO getCityByName(@PathVariable("name") String cityName) {
        return cityService.getCityByName(cityName);
    }

    @GetMapping("/api/cities/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public CityResponseDTO getCityById(@PathVariable("id") Integer id) {
        return cityService.getCityById(id);
    }
}

