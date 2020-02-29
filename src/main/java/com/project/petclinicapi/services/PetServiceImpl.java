package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.PetJson;
import com.project.petclinicapi.controllerResultJson.PetJsonVisit;
import com.project.petclinicapi.model.Pet;
import com.project.petclinicapi.model.Visit;
import com.project.petclinicapi.repositories.PetRepository;
import org.springframework.stereotype.Service;
import java.util.*;

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
    public PetJson findByIdWithVisitIds(Integer id) {
        Pet pet = findById(id);
        return convertPetIntoPetJson(pet);
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
    public Set<PetJson> findAllWithIds() {
        Iterable<Pet> pets = petRepository.findAll();
        Set<PetJson> result = new HashSet<>();

        for (Pet pet: pets) {
            result.add(convertPetIntoPetJson(pet));
        }

        return result;
    }

    @Override
    public PetJson convertPetIntoPetJson(Pet pet) {
        PetJson petJson = new PetJson();
        if (pet != null) {
            petJson.setId(pet.getId());
            petJson.setName(pet.getName());
            petJson.setBirthDate(pet.getBirthDate());
            petJson.setOwnerId(pet.getOwner().getId());
            petJson.setTypeId(pet.getType().getId());

            Set<Visit> visits = pet.getVisits();
            if (visits.size() > 0) {
                for (Visit visit: visits) {
                    petJson.addVisit(convertVisitToPetJsonVisit(visit));
                }
            }
        }
        return petJson;
    }

    @Override
    public PetJsonVisit convertVisitToPetJsonVisit(Visit visit) {
        PetJsonVisit petJsonVisit = new PetJsonVisit();
        if (visit != null) {
            petJsonVisit.setId(visit.getId());
            petJsonVisit.setVisitDate(visit.getVisitDate());
            petJsonVisit.setDescription(visit.getDescription());
        }
        return petJsonVisit;
    }

    @Override
    public void save(Pet pet) {
        petRepository.save(pet);
    }
}
