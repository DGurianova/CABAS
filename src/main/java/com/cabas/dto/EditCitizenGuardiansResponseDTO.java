package com.cabas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class EditCitizenGuardiansResponseDTO {
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
