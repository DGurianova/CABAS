package com.cabas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class EditCitizenByIdRequestDTO {
    private String firstName;
    private String Lastname;
    private String phoneNumber;
    private String email;
}
