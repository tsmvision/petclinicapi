package com.project.petclinicapi.services;

import com.project.petclinicapi.dto.vet.VetDto;
import com.project.petclinicapi.model.Vet;
import java.util.List;
import java.util.Set;

public interface VetService {
    Vet findById(Integer id);
    VetDto findByIdWithSpecialtyIds(Integer id);
    List<Vet> findAll();
    Set<VetDto> findAllWithSpecialtyIds();
    void save(Vet vet);
    VetDto convertVetIntoVetJson(Vet vet);
}
