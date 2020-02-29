package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Specialty;
import java.util.List;

public interface SpecialtyService {
    Specialty findById(Integer id);
    List<Specialty> findAll();
    void save(Specialty specialty);
}
