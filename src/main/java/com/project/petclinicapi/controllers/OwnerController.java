package com.project.petclinicapi.controllers;

import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.services.OwnerService;
import org.springframework.web.bind.annotation.*;

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
        return owner;
    }

    @GetMapping("/{id}")
    public Owner findById(@PathVariable Integer id) {
            return ownerService.findById(id);
    }

    @PostMapping("/")
    public Owner addOwner(@RequestBody Owner owner) {
        // TODO: validate values using initbind ??
        ownerService.save(owner);
        return owner;
    }
}
