package com.project.petclinicapi.controllers;

import com.project.petclinicapi.model.Pet;
import com.project.petclinicapi.services.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping({"", "/"})
    public List<Pet> findAll() {
        return petService.findAll();
    }

    @GetMapping("/{id}")
    public Pet findById(@PathVariable Integer id) {
        return petService.findById(id);
    }

    @PostMapping({"", "/"})
    public void save(@RequestBody Pet pet) {
        petService.save(pet);
    }
}
