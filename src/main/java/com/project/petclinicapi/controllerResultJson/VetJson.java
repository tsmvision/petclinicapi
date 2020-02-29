package com.project.petclinicapi.controllerResultJson;

import com.project.petclinicapi.model.Specialty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class VetJson extends PersonJson {
    private Set<VetJsonSpecialty> specialties = new HashSet<>();

    public void addSpecialtyId(VetJsonSpecialty vetJsonSpecialty) {
        specialties.add(vetJsonSpecialty);
    }
}
