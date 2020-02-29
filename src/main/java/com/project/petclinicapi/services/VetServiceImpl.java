package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Vet;
import com.project.petclinicapi.repositories.VetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VetServiceImpl implements VetService {

    VetRepository vetRepository;

    public VetServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findById(Integer id) {
        Optional<Vet> vet = vetRepository.findById(id);
        return vet.orElseGet(Vet::new);
    }

    @Override
    public List<Vet> findAll() {
        Iterable<Vet> vets = vetRepository.findAll();
        List<Vet> result = new ArrayList<>();
        for (Vet vet: vets) {
            result.add(vet);
        }
        return result;
    }

    @Override
    public void save(Vet vet) {

    }
}
