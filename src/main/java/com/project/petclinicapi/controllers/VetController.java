package com.project.petclinicapi.controllers;

import com.project.petclinicapi.dto.vet.VetDto;
import com.project.petclinicapi.model.Vet;
import com.project.petclinicapi.services.VetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
    public Set<VetDto> findAll() {
        return vetService.findAllWithSpecialtyIds();
    }

    @GetMapping("/{id}")
    public VetDto findById(@PathVariable Integer id) {
        log.info("id: {}", id);
        return vetService.findByIdWithSpecialtyIds(id);
    }

    @PostMapping({"", "/"})
    public void save(@RequestBody Vet vet) {
        log.info("vet: {}", vet);
        vetService.save(vet);
    }
}
