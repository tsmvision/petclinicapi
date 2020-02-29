package com.project.petclinicapi.controllers;

import com.project.petclinicapi.model.PetType;
import com.project.petclinicapi.services.PetTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/petTypes")
public class PetTypeController {

    PetTypeService petTypeService;

    public PetTypeController(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @GetMapping({"", "/"})
    public List<PetType> findAll() {
        return petTypeService.findAll();
    }

    @GetMapping("/{id}")
    public PetType findById(@PathVariable Integer id) {
        return petTypeService.findById(id);
    }

    @PostMapping({"", "/"})
    public void save(@RequestBody PetType petType) {
        petTypeService.save(petType);
    }
}
