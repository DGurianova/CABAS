package gud.template.controller;


import gud.template.persistance.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AreaController {

    @Autowired
    private AreaService areaService;

    @PostMapping("/api/areas")
    public void createCitizen(@RequestBody AreaRequestDTO request) {
        areaService.createArea(request);
    }

    @GetMapping("/api/areas")
    public List<AreaResponseDTO> getAllAreas() {
        return areaService.getAllAreas();
    }

    @GetMapping("/api/areas?q={name}")
    @ResponseStatus(HttpStatus.CREATED)
    public AreaResponseDTO getAreaByName(@PathVariable("name") String areaName) {
        return areaService.getAreaByName(areaName.compareToIgnoreCase(areaName));
    }


}
