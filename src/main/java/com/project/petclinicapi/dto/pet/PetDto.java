package com.project.petclinicapi.dto.pet;

import com.project.petclinicapi.dto.common.NamedDto;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class PetDto extends NamedDto {

    private LocalDate birthDate;
    private PetPetTypeDto type;
    private PetOwnerDto owner;
    private Set<PetVisitDto> visits = new HashSet<>();
    public void addVisit(PetVisitDto petJsonVisit) {
        visits.add(petJsonVisit);
    }

}
