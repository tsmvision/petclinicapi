package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.SpecialtyJson;
import com.project.petclinicapi.model.Specialty;
import com.project.petclinicapi.model.Vet;
import com.project.petclinicapi.repositories.SpecialtyRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {

    SpecialtyRepository specialtyRepository;

    public SpecialtyServiceImpl(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Specialty findById(Integer id) {
        Optional<Specialty> specialty = specialtyRepository.findById(id);
        return specialty.orElseGet(Specialty::new);
    }

    @Override
    public SpecialtyJson findByIdWithVetIds(Integer id) {
        Specialty specialty = findById(id);
        return convertSpecialtyIntoSpecialtyJson(specialty);
    }

    @Override
    public List<Specialty> findAll() {
        Iterable<Specialty> specialties = specialtyRepository.findAll();
        List<Specialty> result = new ArrayList<>();

        for (Specialty specialty: specialties) {
            result.add(specialty);
        }

        return result;
    }

    @Override
    public Set<SpecialtyJson> findAllWithVetIds() {
        Iterable<Specialty> specialties = specialtyRepository.findAll();
        Set<SpecialtyJson> result = new HashSet<>();

        for (Specialty specialty: specialties) {
            result.add(convertSpecialtyIntoSpecialtyJson(specialty));
        }

        return result;
    }

    @Override
    public void save(Specialty specialty) {
        specialtyRepository.save(specialty);
    }

    @Override
    public SpecialtyJson convertSpecialtyIntoSpecialtyJson(Specialty specialty) {
        SpecialtyJson specialtyJson = new SpecialtyJson();
        if (specialty != null) {
            specialtyJson.setId(specialty.getId());
            specialtyJson.setName(specialty.getName());

            Set<Vet> vets = specialty.getVets();
            if (vets.size() > 0) {
                for (Vet vet : vets) {
                    specialtyJson.addVet(vet.getId());
                }
            }
        }
        return specialtyJson;
    }
}
