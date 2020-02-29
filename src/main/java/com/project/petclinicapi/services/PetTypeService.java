package com.project.petclinicapi.services;

import com.project.petclinicapi.model.PetType;
import java.util.List;

public interface PetTypeService {
    PetType findById(Integer id);
    List<PetType> findAll();
    void save(PetType petType);
}
