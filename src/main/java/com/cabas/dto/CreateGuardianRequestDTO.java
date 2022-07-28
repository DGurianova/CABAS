package com.cabas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CreateGuardianRequestDTO {
    private String firstName;
    private String Lastname;
    private String email;
    private String dateOfBirth;
    private String phoneNumber;
}
