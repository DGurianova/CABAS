package gud.template.service;

import gud.template.dto.CreateAreaRequestDTO;
import gud.template.dto.GetAreaResponseDTO;
import gud.template.persistance.entity.Area;

import java.util.List;

public interface AreaService {
    Area createArea(CreateAreaRequestDTO request);

    GetAreaResponseDTO getAreaByName(String name);

    List<GetAreaResponseDTO> getAllAreas();


}
