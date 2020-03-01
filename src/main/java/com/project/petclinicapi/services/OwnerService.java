package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.OwnerJson;
import com.project.petclinicapi.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService {
    Owner findById(Integer id);
    Set<OwnerJson> findByLastNameWithPet(String lastName);
    OwnerJson findByIdWithPetId(Integer id);
    List<Owner> findAll();
    Set<OwnerJson> findAllWithPet();
    void save(Owner owner);
    OwnerJson convertOwnerToOwnerJson(Owner owner);
}
