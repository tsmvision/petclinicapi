package com.project.petclinicapi.controllerResultJson;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class PetJson extends NamedJson {

    private LocalDate birthDate;
    private PetJsonPetType type;
    private PetJsonOwner owner;
    private Set<PetJsonVisit> visits = new HashSet<>();
    public void addVisit(PetJsonVisit petJsonVisit) {
        visits.add(petJsonVisit);
    }

}
