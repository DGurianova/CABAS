package com.cabas.service;

import com.cabas.dto.CreateCitizenRequestDTO;
import com.cabas.dto.CreateCitizenResponseDTO;
import com.cabas.persistance.entity.Citizen;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CitizenServiceImpl implements CitizenService{
    @Override
    public Citizen createCitizen(CreateCitizenRequestDTO request) {
        return null;
    }

    @Override
    public CreateCitizenResponseDTO getCitizenById(Integer id) {
        return null;
    }

    @Override
    public Citizen createGuardians(Integer id) {
        return null;
    }

    @Override
    public Citizen fromGuardian(Integer citizenId, Integer guardianId) {
        return null;
    }

    @Override
    public Citizen toGuardian(Integer citizenId, Integer guardianId) {
        return null;
    }

    @Override
    public CreateCitizenResponseDTO getCitizenByEmail(String email) {
        return null;
    }

    @Override
    public Citizen editCitizen(Integer citizenId) {
        return null;
    }

    @Override
    public Citizen moveCitizen(Integer citizenId, Integer fromCityId, Integer toCityId) {
        return null;
    }
}
