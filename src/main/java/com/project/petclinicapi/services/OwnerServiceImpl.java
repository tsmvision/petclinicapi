package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.OwnerJson;
import com.project.petclinicapi.controllerResultJson.OwnerJsonPet;
import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.model.Pet;
import com.project.petclinicapi.repositories.OwnerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class OwnerServiceImpl implements OwnerService {

    OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public List<Owner> findAll() {
        Iterable<Owner> owners = ownerRepository.findAll();
        List<Owner> result = new ArrayList<>();

        for (Owner owner : owners) {
            result.add(owner);
        }
        return result;
    }

    @Override
    public Set<OwnerJson> findAllWithPet() {
        Iterable<Owner> owners = ownerRepository.findAll();
        Set<OwnerJson> result = new HashSet<>();

        for (Owner owner : owners) {
            result.add(convertOwnerToOwnerJson(owner));
        }

        return result;
    }

    @Override
    public Owner findById(Integer id) {
        Optional<Owner> owner = ownerRepository.findById(id);
        return owner.orElseGet(Owner::new);
    }

    @Override
    public OwnerJson findByIdWithPetId(Integer id) {
        Owner owner = findById(id);
        return convertOwnerToOwnerJson(owner);
    }

    @Override
    public Set<OwnerJson> findByLastNameWithPet(String lastName) {
        log.info("lastName: {}", lastName);
        Set<OwnerJson> result = new HashSet<>();
        Iterable<Owner> owners = ownerRepository.findByLastName(lastName);
        for (Owner owner: owners) {
            result.add(convertOwnerToOwnerJson(owner));
        }
        return result;
    }

    @Override
    public OwnerJson convertOwnerToOwnerJson(Owner owner) {
        OwnerJson ownerJson = new OwnerJson();
        if (owner != null) {
            ownerJson.setId(owner.getId());
            ownerJson.setFirstName(owner.getFirstName());
            ownerJson.setLastName(owner.getLastName());
            ownerJson.setAddress(owner.getAddress());
            ownerJson.setCity(owner.getCity());
            ownerJson.setTelephone(owner.getTelephone());

            if (owner.getPets().size() > 0) {
                for (Pet pet : owner.getPets()) {
                    ownerJson.addPet(convertPetToOwnerJsonPet(pet));
                }
            }
        }
        return ownerJson;
    }

    public OwnerJsonPet convertPetToOwnerJsonPet(Pet pet) {
        OwnerJsonPet ownerJsonPet = new OwnerJsonPet();
        if (pet != null) {
            ownerJsonPet.setId(pet.getId());
            ownerJsonPet.setName(pet.getName());
            ownerJsonPet.setBirthDate(pet.getBirthDate());
        }
        return ownerJsonPet;
    }

    @Override
    public void save(Owner owner) {
        ownerRepository.save(owner);
    }
}
