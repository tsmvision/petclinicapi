package com.project.petclinicapi.controllerResultJson;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class SpecialtyJson extends BaseJson {
    private String name;
    private Set<SpecialtyJsonVet> vets = new HashSet<>();

    public void addVet(SpecialtyJsonVet specialtyJsonVet) {
        vets.add(specialtyJsonVet);
    }
}
