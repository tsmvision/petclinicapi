package com.project.petclinicapi.controllers;

import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.services.OwnerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/hello")
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
}
