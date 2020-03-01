package com.project.petclinicapi.services;

import com.project.petclinicapi.dto.owner.OwnerDto;
import com.project.petclinicapi.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService {
    Owner findById(Integer id);
    Set<OwnerDto> findByLastNameWithPet(String lastName);
    OwnerDto findByIdWithPetId(Integer id);
    List<Owner> findAll();
    Set<OwnerDto> findAllWithPet();
    void save(Owner owner);
    OwnerDto convertOwnerToOwnerJson(Owner owner);
}
