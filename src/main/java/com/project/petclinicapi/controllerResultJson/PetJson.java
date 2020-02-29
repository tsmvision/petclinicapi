package com.project.petclinicapi.controllerResultJson;

import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.model.PetType;
import com.project.petclinicapi.model.Visit;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class PetJson extends NamedJson {

    private LocalDate birthDate;
    private Integer typeId;
    private Integer ownerId;
    private Set<PetJsonVisit> visits = new HashSet<>();
    public void addVisit(PetJsonVisit petJsonVisit) {
        visits.add(petJsonVisit);
    }

}
