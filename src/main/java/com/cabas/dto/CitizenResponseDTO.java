package com.cabas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CitizenResponseDTO {
    private String firstName;
    private String Lastname;
    private String email;
    private String dateOfBirth;
    private String phoneNumber;
    private GuardianResponseDTO guardian;
    private Integer cityId;
    private Integer areaId;
}
