package gud.template.service;

import gud.template.dto.CreateCitizenRequestDTO;
import gud.template.dto.CreateCitizenResponseDTO;
import gud.template.persistance.entity.Citizen;

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

