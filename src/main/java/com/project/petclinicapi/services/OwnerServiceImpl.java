package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.repositories.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Owner findById(Integer id) {
        Optional<Owner> owner = ownerRepository.findById(id);
        return owner.orElseGet(Owner::new);
    }

    @Override
    public void save(Owner owner) {
        ownerRepository.save(owner);
    }
}
