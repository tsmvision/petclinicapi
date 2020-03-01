package com.project.petclinicapi.dto.vet;

import com.project.petclinicapi.dto.common.PersonDto;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class VetDto extends PersonDto {
    private Set<VetSpecialtyDto> specialties = new HashSet<>();

    public void addSpecialtyId(VetSpecialtyDto vetJsonSpecialty) {
        specialties.add(vetJsonSpecialty);
    }
}
