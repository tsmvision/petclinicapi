package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Integer> {
}
