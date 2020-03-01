package com.project.petclinicapi.services;

import com.project.petclinicapi.dto.vet.VetDto;
import com.project.petclinicapi.dto.vet.VetSpecialtyDto;
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
    public VetDto findByIdWithSpecialtyIds(Integer id) {
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
    public Set<VetDto> findAllWithSpecialtyIds() {
        Iterable<Vet> vets = vetRepository.findAll();
        Set<VetDto> result = new HashSet<>();
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
    public VetDto convertVetIntoVetJson(Vet vet) {
        VetDto vetJson = new VetDto();
        if (vet != null) {
            vetJson.setId(vet.getId());
            vetJson.setFirstName(vet.getFirstName());
            vetJson.setLastName(vet.getLastName());
            Set<Specialty> specialties  = vet.getSpecialties();
            if (specialties.size() > 0) {
                for (Specialty specialty : specialties) {
                    VetSpecialtyDto vetJsonSpecialty = new VetSpecialtyDto();
                    vetJsonSpecialty.setId(specialty.getId());
                    vetJsonSpecialty.setName(specialty.getName());
                    vetJson.addSpecialtyId(vetJsonSpecialty);
                }
            }
        }
        return vetJson;
    }
}
