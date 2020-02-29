package com.project.petclinicapi.services;

import com.project.petclinicapi.jsonformat.OwnerJson;
import com.project.petclinicapi.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService {
    Owner findById(Integer id);
    OwnerJson findByIdWithPetId(Integer id);
    List<Owner> findAll();
    Set<OwnerJson> findAllWithPetId();
    void save(Owner owner);
    OwnerJson convertOwnerIntoOwnerJson(Owner owner);
}
