package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.VetJson;
import com.project.petclinicapi.model.Specialty;
import com.project.petclinicapi.model.Vet;
import com.project.petclinicapi.repositories.VetRepository;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public VetJson findByIdWithSpecialtyIds(Integer id) {
        return convertVetIntoVetJson(findById(id));
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
    public Set<VetJson> findAllWithSpecialtyIds() {
        Iterable<Vet> vets = vetRepository.findAll();
        Set<VetJson> result = new HashSet<>();
        for (Vet vet: vets) {
            result.add(convertVetIntoVetJson(vet));
        }
        return result;
    }

    @Override
    public void save(Vet vet) {
        vetRepository.save(vet);
    }

    @Override
    public VetJson convertVetIntoVetJson(Vet vet) {
        VetJson vetJson = new VetJson();
        if (vet != null) {
            vetJson.setId(vet.getId());
            vetJson.setFirstName(vet.getFirstName());
            vetJson.setLastName(vet.getLastName());
            Set<Specialty> specialties  = vet.getSpecialties();
            if (specialties.size() > 0) {
                for (Specialty specialty : specialties) {
                    vetJson.addSpecialtyId(specialty.getId());
                }
            }
        }
        return vetJson;
    }
}
