package com.cabas.controller;

import com.cabas.dto.CreateCitizenRequestDTO;
import com.cabas.dto.CreateCitizenResponseDTO;
import com.cabas.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CitizenController {
    @Autowired
    private CitizenService citizenService;

    @PostMapping
    public void createCitizen(@RequestBody CreateCitizenRequestDTO request) {
        citizenService.createCitizen(request);
    }


    @PutMapping("/api/citizens/{id}")
    public void editCitizen(@PathVariable("id") Integer id) {
        citizenService.editCitizen(id);
    }

    @PostMapping("/api/citizens/{id}/guardians")
    public void createGuardians(@PathVariable("id") Integer id) {
        citizenService.createGuardians(id);

    }

    @GetMapping("/api/citizens/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCitizenResponseDTO getCitizenById(@PathVariable("id") Integer id) {
        return citizenService.getCitizenById(id);
    }

    @GetMapping("/api/citizens?email={email}")
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCitizenResponseDTO getCitizenByEmail(@PathVariable("email") String email) {
        return citizenService.getCitizenByEmail(email);
    }

//Duplicated mapping
//    @PatchMapping("/api/citizens/{id}/guargians")
//    public void getCitizenFromGuardian(@PathVariable("citizen_id") Integer citizenId, @PathVariable("guardian_id") Integer guardianId) {
//        citizenService.fromGuardian(citizenId, guardianId);
//    }

    @PatchMapping("/api/citizens/{id}/guargians")
    public void getCitizenToGuardian(@PathVariable("citizen_id") Integer citizenId, @PathVariable("guardian_id") Integer guardianId) {
        citizenService.toGuardian(citizenId, guardianId);
    }

    @PostMapping("/api/citizens/move")
    public void moveCitizen(@PathVariable("citizen_id") Integer citizenId, @PathVariable("city_id") Integer fromCityId, @PathVariable("city_id") Integer toCityId) {
        citizenService.moveCitizen(citizenId, fromCityId, toCityId);


    }
}
