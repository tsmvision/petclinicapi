package com.project.petclinicapi.jsonformat;

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
    private Set<Integer> pets = new HashSet<>();

    public void addPet(Integer id) {
        pets.add(id);
    }

}
