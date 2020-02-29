package com.project.petclinicapi.controllers;

import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.services.OwnerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/owners")
public class OwnerController {

    OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/test")
    public Owner sayHello() {
        Owner owner = new Owner();
        owner.setId(1);
        owner.setFirstName("Luke");
        owner.setLastName("Lee");

        log.info("owner: {}", owner);
        return owner;
    }

    @GetMapping("/{id}")
    public Owner findById(@PathVariable Integer id) {
        log.info("id: {}", id);
        return ownerService.findById(id);
    }

    @PostMapping("/")
    public Owner addOwner(@RequestBody Owner owner) {
        // TODO: validate values using initbind ??
        log.info("owner: {}", owner);
        ownerService.save(owner);
        return owner;
    }
}
