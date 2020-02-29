package com.project.petclinicapi.controllers;

import com.project.petclinicapi.controllerResultJson.VisitJson;
import com.project.petclinicapi.model.Visit;
import com.project.petclinicapi.services.VisitService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/visits")
public class VisitController {

    VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @GetMapping({"", "/"})
    public Set<VisitJson> findAll() {
        return visitService.findAllWithPetIds();
    }

    @GetMapping({"/{id}"})
    public VisitJson findById(@PathVariable Integer id) {
        return visitService.findByIdWithPetId(id);
    }

    @PostMapping({"", "/"})
    public void save(@RequestBody Visit visit) {
        visitService.save(visit);
    }
}
