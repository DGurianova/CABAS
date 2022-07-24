package gud.template.dto;

import gud.template.persistance.entity.Area;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Builder
public class CityRequestDTO {
    @NotNull
    private String cityName;
    private Integer cityId;
    private Integer areaId;
}
