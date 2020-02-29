package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Vet;
import java.util.List;

public interface VetService {
    Vet findById(Integer id);
    List<Vet> findAll();
    void save(Vet vet);
}
