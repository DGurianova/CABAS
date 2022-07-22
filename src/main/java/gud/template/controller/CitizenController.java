package gud.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CitizenController {
    @Autowired
    private CitizenService citizenService;

    @PostMapping
    public void createCitizen(@RequestBody CitizenRequestDTO request) {
        citizenService.createCitizen(request);
    }


    @PutMapping("/api/citizens/{id}")
    public void updateCitizen(@PathVariable("id") Integer id) {
        citizenService.save(id);
    }

    @PostMapping("/api/citizens/{id}/guardians")
    public void createGuardians(@PathVariable("id") Integer id) {
        citizenService.createGuardians(id);

    }


}
