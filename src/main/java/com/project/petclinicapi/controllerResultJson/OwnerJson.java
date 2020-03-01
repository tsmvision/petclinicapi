package com.project.petclinicapi.controllerResultJson;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class OwnerJson extends PersonJson {

    private String address;
    private String city;
    private String telephone;
    private Set<OwnerJsonPet> pets = new HashSet<>();

    public void addPet(OwnerJsonPet ownerJsonPet) {
        pets.add(ownerJsonPet);
    }

}
