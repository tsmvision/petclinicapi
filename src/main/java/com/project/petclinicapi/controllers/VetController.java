package com.project.petclinicapi.controllers;

import com.project.petclinicapi.model.Vet;
import com.project.petclinicapi.services.VetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/vets")
public class VetController {

    VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping("/")
    public List<Vet> findAll() {
        return vetService.findAll();
    }

    @GetMapping("/{id}")
    public Vet findById(@PathVariable Integer id) {
        log.info("id: {}", id);
        return vetService.findById(id);
    }
}
