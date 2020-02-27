package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Integer> {
}
