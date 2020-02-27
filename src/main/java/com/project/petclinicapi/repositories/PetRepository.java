package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Integer> {
}
