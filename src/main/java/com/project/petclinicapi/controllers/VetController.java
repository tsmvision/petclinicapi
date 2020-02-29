package com.project.petclinicapi.controllers;

import com.project.petclinicapi.controllerResultJson.VetJson;
import com.project.petclinicapi.model.Vet;
import com.project.petclinicapi.services.VetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/vets")
public class VetController {

    VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"", "/"})
    public Set<VetJson> findAll() {
        return vetService.findAllWithSpecialtyIds();
    }

    @GetMapping("/{id}")
    public VetJson findById(@PathVariable Integer id) {
        log.info("id: {}", id);
        return vetService.findByIdWithSpecialtyIds(id);
    }

    @PostMapping({"", "/"})
    public void save(@RequestBody Vet vet) {
        log.info("vet: {}", vet);
        vetService.save(vet);
    }
}
