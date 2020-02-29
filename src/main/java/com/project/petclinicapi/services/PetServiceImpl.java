package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Pet;
import com.project.petclinicapi.repositories.PetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {

    PetRepository petRepository;

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(Integer id) {
        Optional<Pet> pet = petRepository.findById(id);
        return pet.orElse(null);
    }

    @Override
    public List<Pet> findAll() {
        Iterable<Pet> pets = petRepository.findAll();
        List<Pet> result = new ArrayList<>();
        for (Pet pet: pets) {
            result.add(pet);
        }
        return result;
    }

    @Override
    public void save(Pet pet) {
        petRepository.save(pet);
    }
}
