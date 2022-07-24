package gud.template.dto;

import gud.template.persistance.entity.Citizen;

import java.util.List;

public class CreateGuardianResponseDTO {
    private String firstName;
    private String Lastname;
    private String email;
    private String dateOfBirth;
    private String phoneNumber;
    private GuardianResponseDTO guardian;
    private List<CitizenResponseDTO> children;
    private Integer cityId;
    private Integer areaId;
}
