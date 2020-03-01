package com.project.petclinicapi.services;

import com.project.petclinicapi.dto.pet.PetDto;
import com.project.petclinicapi.dto.pet.PetOwnerDto;
import com.project.petclinicapi.dto.pet.PetPetTypeDto;
import com.project.petclinicapi.dto.pet.PetVisitDto;
import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.model.Pet;
import com.project.petclinicapi.model.PetType;
import com.project.petclinicapi.model.Visit;

import java.util.List;
import java.util.Set;

public interface PetService {
    Pet findById(Integer id);
    PetDto findByIdWithVisitIds(Integer id);
    List<Pet> findAll();
    Set<PetDto> findAllWithIds();
    void save(Pet pet);
    PetDto convertPetIntoPetJson(Pet Pet);
    PetPetTypeDto convertPetTypeToPetJsonPetType(PetType petType);
    PetVisitDto convertVisitToPetJsonVisit(Visit visit);
    PetOwnerDto convertOwnerToPetJsonOwner(Owner owner);
}
