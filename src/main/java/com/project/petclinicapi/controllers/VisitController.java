package com.project.petclinicapi.controllers;

import com.project.petclinicapi.model.Visit;
import com.project.petclinicapi.services.VisitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visits")
public class VisitController {

    VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @GetMapping({"", "/"})
    public List<Visit> findAll() {
        return visitService.findAll();
    }

    @GetMapping({"/{id}"})
    public Visit findById(@PathVariable Integer id) {
        return visitService.findById(id);
    }

    @PostMapping({"", "/"})
    public void save(@RequestBody Visit visit) {
        visitService.save(visit);
    }
}
