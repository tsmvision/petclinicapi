package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Integer> {
}
