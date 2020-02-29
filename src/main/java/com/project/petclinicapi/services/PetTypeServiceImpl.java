package com.project.petclinicapi.services;

import com.project.petclinicapi.model.PetType;
import com.project.petclinicapi.repositories.PetTypeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PetTypeServiceImpl implements PetTypeService {

    PetTypeRepository petTypeRepository;

    public PetTypeServiceImpl(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType findById(Integer id) {
        Optional<PetType> petType = petTypeRepository.findById(id);
        return petType.orElseGet(PetType::new);
    }

    @Override
    public List<PetType> findAll() {
        Iterable<PetType> petTypes = petTypeRepository.findAll();
        List<PetType> result = new ArrayList<>();

        for (PetType petType: petTypes) {
            result.add(petType);
        }
        return result;
    }

    @Override
    public void save(PetType petType) {
        petTypeRepository.save(petType);
    }
}
