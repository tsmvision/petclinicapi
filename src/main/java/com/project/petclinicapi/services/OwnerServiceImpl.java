package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.repositories.OwnerRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService {

    OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
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
