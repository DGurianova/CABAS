package gud.template.dto;

import gud.template.persistance.entity.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class GetAreaResponseDTO {
    private String areaName;
    private Integer areaId;
    List<Integer> cityIds;
}
