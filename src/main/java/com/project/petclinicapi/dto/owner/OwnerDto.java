package com.project.petclinicapi.dto.owner;

import com.project.petclinicapi.dto.common.PersonDto;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class OwnerDto extends PersonDto {

    private String address;
    private String city;
    private String telephone;
    private Set<PetDto> pets = new HashSet<>();

    public void addPet(PetDto ownerJsonPet) {
        pets.add(ownerJsonPet);
    }

}
