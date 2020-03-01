package com.project.petclinicapi.services;

import com.project.petclinicapi.dto.visit.VisitDto;
import com.project.petclinicapi.model.Visit;
import java.util.List;
import java.util.Set;

public interface VisitService {
    Visit findById(Integer id);
    VisitDto findByIdWithPetId(Integer id);
    List<Visit> findAll();
    Set<VisitDto> findAllWithPetIds();
    void save(Visit visit);
    VisitDto convertVetIntoVetJson(Visit visit);
}
