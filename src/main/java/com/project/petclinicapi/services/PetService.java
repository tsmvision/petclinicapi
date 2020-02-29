package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.PetJson;
import com.project.petclinicapi.model.Pet;
import java.util.List;
import java.util.Set;

public interface PetService {
    Pet findById(Integer id);
    List<Pet> findAll();
    Set<PetJson> findAllWithIds();
    void save(Pet pet);
    PetJson convertPetIntoPetJson(Pet Pet);
}
