package com.cabas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class EditCitizenGuardiansRequestDTO {
    private Integer fromGuardian;
    private Integer toGuardian;
    private List<Integer> childrenIds;
}
