package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.VetJson;
import com.project.petclinicapi.model.Vet;
import java.util.List;
import java.util.Set;

public interface VetService {
    Vet findById(Integer id);
    VetJson findByIdWithSpecialtyIds(Integer id);
    List<Vet> findAll();
    Set<VetJson> findAllWithSpecialtyIds();
    void save(Vet vet);
    VetJson convertVetIntoVetJson(Vet vet);
}
