package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.PetJson;
import com.project.petclinicapi.controllerResultJson.PetJsonOwner;
import com.project.petclinicapi.controllerResultJson.PetJsonPetType;
import com.project.petclinicapi.controllerResultJson.PetJsonVisit;
import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.model.Pet;
import com.project.petclinicapi.model.PetType;
import com.project.petclinicapi.model.Visit;

import java.util.List;
import java.util.Set;

public interface PetService {
    Pet findById(Integer id);
    PetJson findByIdWithVisitIds(Integer id);
    List<Pet> findAll();
    Set<PetJson> findAllWithIds();
    void save(Pet pet);
    PetJson convertPetIntoPetJson(Pet Pet);
    PetJsonPetType convertPetTypeToPetJsonPetType(PetType petType);
    PetJsonVisit convertVisitToPetJsonVisit(Visit visit);
    PetJsonOwner convertOwnerToPetJsonOwner(Owner owner);
}
