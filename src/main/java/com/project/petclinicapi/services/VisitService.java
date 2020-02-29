package com.project.petclinicapi.services;

import com.project.petclinicapi.controllerResultJson.VisitJson;
import com.project.petclinicapi.model.Visit;
import java.util.List;
import java.util.Set;

public interface VisitService {
    Visit findById(Integer id);
    VisitJson findByIdWithPetId(Integer id);
    List<Visit> findAll();
    Set<VisitJson> findAllWithPetIds();
    void save(Visit visit);
    VisitJson convertVetIntoVetJson(Visit visit);
}
