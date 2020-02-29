package com.project.petclinicapi.controllerResultJson;

import com.project.petclinicapi.model.Specialty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class VetJson extends PersonJson {
    private Set<Integer> specialties = new HashSet<>();

    public void addSpecialtyId(Integer id) {
        specialties.add(id);
    }
}
