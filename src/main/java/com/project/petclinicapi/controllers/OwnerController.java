package com.project.petclinicapi.controllers;

import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.services.OwnerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/owners")
public class OwnerController {

    OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"", "/"})
    public List<Owner> findAll() {
        return ownerService.findAll();
    }

    @GetMapping("/{id}")
    public Owner findById(@PathVariable Integer id) {
        log.info("id: {}", id);
        return ownerService.findById(id);
    }

    @PostMapping({"", "/"})
    public Owner addOwner(@RequestBody Owner owner) {
        // TODO: validate values using initbind ??
        log.info("owner: {}", owner);
        ownerService.save(owner);
        return owner;
    }
}
