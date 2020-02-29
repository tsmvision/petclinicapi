package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.SpecialtyJson;
import com.project.petclinicapi.model.Specialty;
import java.util.List;
import java.util.Set;

public interface SpecialtyService {
    Specialty findById(Integer id);
    SpecialtyJson findByIdWithVetIds(Integer id);
    List<Specialty> findAll();
    Set<SpecialtyJson> findAllWithVetIds();
    void save(Specialty specialty);
    SpecialtyJson convertSpecialtyIntoSpecialtyJson(Specialty specialty);
}
