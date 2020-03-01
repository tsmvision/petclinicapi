package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.Owner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.Set;

public interface OwnerRepository extends CrudRepository<Owner, Integer> {

    @Query("SELECT owner FROM Owner owner WHERE owner.lastName = :lastName")
    Iterable<Owner> findByLastName(String lastName);
}
