package gud.template.service;

import gud.template.persistance.entity.Citizen;

public interface CitizenService {
    Citizen createCitizen(CitizenRequestDTO request);

    CitizenResponseDTO getCitizenById(Integer id);

    Citizen createGuardians(Integer id);

    Citizen fromGuardian(Integer citizenId, Integer guardianId);

    Citizen toGuardian(Integer citizenId, Integer guardianId);

    CitizenResponseDTO getCitizenByEmail(String email);

    Citizen editCitizen(Integer citizenId);

    Citizen moveCitizen(Integer citizenId, Integer fromCityId, Integer toCityId);

}

