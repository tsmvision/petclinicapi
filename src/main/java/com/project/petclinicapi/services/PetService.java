package com.project.petclinicapi.services;


import com.project.petclinicapi.model.Pet;
import java.util.List;

public interface PetService {
    Pet findById(Integer id);
    List<Pet> findAll();
    void save(Pet pet);
}
