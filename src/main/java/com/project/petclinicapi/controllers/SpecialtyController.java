package com.project.petclinicapi.controllers;

import com.project.petclinicapi.model.Specialty;
import com.project.petclinicapi.services.SpecialtyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/specialties")
public class SpecialtyController {

    SpecialtyService specialtyService;

    public SpecialtyController(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @GetMapping({"", "/"})
    public List<Specialty> findAll() {
        return specialtyService.findAll();
    }

    @GetMapping("/{id}")
    public Specialty findById(@PathVariable Integer id) {
        log.info("id: {}", id);
        return specialtyService.findById(id);
    }

    @PostMapping({"", "/"})
    public void save(@RequestBody Specialty specialty) {
        specialtyService.save(specialty);
    }

}
