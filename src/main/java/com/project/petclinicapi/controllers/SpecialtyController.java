package com.project.petclinicapi.controllers;

import com.project.petclinicapi.dto.specialty.SpecialtyDto;
import com.project.petclinicapi.model.Specialty;
import com.project.petclinicapi.services.SpecialtyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/specialties")
public class SpecialtyController {

    SpecialtyService specialtyService;

    public SpecialtyController(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @GetMapping({"", "/"})
    public Set<SpecialtyDto> findAll() {
        return specialtyService.findAllWithVetIds();
    }

    @GetMapping("/{id}")
    public SpecialtyDto findById(@PathVariable Integer id) {
        log.info("id: {}", id);
        return specialtyService.findByIdWithVetIds(id);
    }

    @PostMapping({"", "/"})
    public void save(@RequestBody Specialty specialty) {
        specialtyService.save(specialty);
    }

}
