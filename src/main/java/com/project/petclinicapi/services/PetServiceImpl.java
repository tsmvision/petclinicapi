package com.project.petclinicapi.services;

import com.project.petclinicapi.dto.pet.PetDto;
import com.project.petclinicapi.dto.pet.PetOwnerDto;
import com.project.petclinicapi.dto.pet.PetPetTypeDto;
import com.project.petclinicapi.dto.pet.PetVisitDto;
import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.model.Pet;
import com.project.petclinicapi.model.PetType;
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
    public PetDto findByIdWithVisitIds(Integer id) {
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
    public Set<PetDto> findAllWithIds() {
        Iterable<Pet> pets = petRepository.findAll();
        Set<PetDto> result = new HashSet<>();

        for (Pet pet: pets) {
            result.add(convertPetIntoPetJson(pet));
        }

        return result;
    }

    @Override
    public PetDto convertPetIntoPetJson(Pet pet) {
        PetDto petJson = new PetDto();
        if (pet != null) {
            petJson.setId(pet.getId());
            petJson.setName(pet.getName());
            petJson.setBirthDate(pet.getBirthDate());

            petJson.setOwner(convertOwnerToPetJsonOwner(pet.getOwner()));
            petJson.setType(convertPetTypeToPetJsonPetType(pet.getType()));

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
    public PetOwnerDto convertOwnerToPetJsonOwner(Owner owner) {
        PetOwnerDto petJsonOwner = new PetOwnerDto();
        if (owner != null) {
            petJsonOwner.setId(owner.getId());
            petJsonOwner.setFirstName(owner.getFirstName());
            petJsonOwner.setLastName(owner.getLastName());
        }
        return petJsonOwner;
    }

    @Override
    public PetPetTypeDto convertPetTypeToPetJsonPetType(PetType petType) {
        PetPetTypeDto petJsonPetType = new PetPetTypeDto();
        if (petType != null) {
            petJsonPetType.setId(petType.getId());
            petJsonPetType.setName(petType.getName());
        }
        return petJsonPetType;
    }

    @Override
    public PetVisitDto convertVisitToPetJsonVisit(Visit visit) {
        PetVisitDto petJsonVisit = new PetVisitDto();
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
