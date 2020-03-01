package com.project.petclinicapi.services;

import com.project.petclinicapi.dto.specialty.SpecialtyDto;
import com.project.petclinicapi.model.Specialty;
import java.util.List;
import java.util.Set;

public interface SpecialtyService {
    Specialty findById(Integer id);
    SpecialtyDto findByIdWithVetIds(Integer id);
    List<Specialty> findAll();
    Set<SpecialtyDto> findAllWithVetIds();
    void save(Specialty specialty);
    SpecialtyDto convertSpecialtyIntoSpecialtyJson(Specialty specialty);
}
