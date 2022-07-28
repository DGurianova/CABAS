package com.cabas.service;

import com.cabas.dto.CreateCitizenRequestDTO;
import com.cabas.persistance.entity.Citizen;
import com.cabas.dto.CreateCitizenResponseDTO;

public interface CitizenService {
    Citizen createCitizen(CreateCitizenRequestDTO request);

    CreateCitizenResponseDTO getCitizenById(Integer id);

    Citizen createGuardians(Integer id);

    Citizen fromGuardian(Integer citizenId, Integer guardianId);

    Citizen toGuardian(Integer citizenId, Integer guardianId);

    CreateCitizenResponseDTO getCitizenByEmail(String email);

    Citizen editCitizen(Integer citizenId);

    Citizen moveCitizen(Integer citizenId, Integer fromCityId, Integer toCityId);

}

