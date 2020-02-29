package com.project.petclinicapi.services;

import com.project.petclinicapi.jsonformat.OwnerJson;
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

        for (Owner owner: owners) {
            result.add(owner);
        }
        return result;
    }

    @Override
    public Set<OwnerJson> findAllWithPetId() {
        Iterable<Owner> owners = ownerRepository.findAll();
        Set<OwnerJson> result = new HashSet<>();

        for (Owner owner: owners) {
            result.add(convertOwnerIntoOwnerJson(owner));
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
        OwnerJson ownerJson = new OwnerJson();
        Owner owner = ownerRepository.findByIdNoPets(id);
        if (ownerRepository.findByIdNoPets(id) != null) {
            ownerJson = convertOwnerIntoOwnerJson(owner);
        }
        return ownerJson;
    }

    @Override
    public OwnerJson convertOwnerIntoOwnerJson(Owner owner) {
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
                    ownerJson.addPet(pet.getId());
                }
            }
        }
            return ownerJson;
    }

    @Override
    public void save(Owner owner) {
        ownerRepository.save(owner);
    }
}
