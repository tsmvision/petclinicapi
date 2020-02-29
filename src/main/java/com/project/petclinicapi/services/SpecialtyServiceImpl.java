package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Specialty;
import com.project.petclinicapi.repositories.SpecialtyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public List<Specialty> findAll() {
        Iterable<Specialty> specialties = specialtyRepository.findAll();
        List<Specialty> result = new ArrayList<>();

        for (Specialty specialty: specialties) {
            result.add(specialty);
        }

        return result;
    }

    @Override
    public void save(Specialty specialty) {
        specialtyRepository.save(specialty);
    }
}
