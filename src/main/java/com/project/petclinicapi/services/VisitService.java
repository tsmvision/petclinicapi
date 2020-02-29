package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Visit;
import java.util.List;

public interface VisitService {
    Visit findById(Integer id);
    List<Visit> findAll();
    void save(Visit visit);
}
