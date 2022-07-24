package gud.template.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Builder
public class CreateAreaResponseDTO {
    @NotNull
    private String areaName;

    private Integer areaId;
}
