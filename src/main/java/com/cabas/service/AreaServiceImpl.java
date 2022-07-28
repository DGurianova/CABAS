package com.cabas.service;

import com.cabas.dto.AreaResponseDTO;
import com.cabas.dto.CreateAreaRequestDTO;
import com.cabas.persistance.entity.Area;
import com.cabas.persistance.entity.Severity;
import com.cabas.persistance.repository.AreaRepository;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaRepository areaRepository;


    @Override
    public Area createArea(CreateAreaRequestDTO request) {
        Area area = Area.builder()
                .areaName(request.getAreaName())
                .areaCode(AreaToAreaCodeService.convertToAreaCode(request.getAreaName()))
                .cityIds(null)
                .severity(Severity.GREEN)
                .build();
        return areaRepository.save(area);
    }

    @Override
    public AreaResponseDTO getAreaByName(String name) {
        Area area = areaRepository
                .findAreaByName(name)
                .get(0);
        if (area != null) {
            return this.convertToDTO(area);

        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public List<AreaResponseDTO> getAllAreas() {

        return areaRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private AreaResponseDTO convertToDTO(Area area) {
        return AreaResponseDTO.builder()
                .areaId(area.getAreaId())
                .areaName(area.getAreaName())
                .cityIds(area.getCityIds())
                .build();
    }
}
