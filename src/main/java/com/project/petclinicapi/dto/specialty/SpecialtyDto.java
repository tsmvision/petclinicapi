package com.project.petclinicapi.dto.specialty;

import com.project.petclinicapi.dto.common.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class SpecialtyDto extends BaseDto {
    private String name;
    private Set<SpecialtyVetDto> vets = new HashSet<>();

    public void addVet(SpecialtyVetDto specialtyJsonVet) {
        vets.add(specialtyJsonVet);
    }
}
