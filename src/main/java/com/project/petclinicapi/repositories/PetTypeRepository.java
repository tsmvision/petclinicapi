package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Integer> {
}
