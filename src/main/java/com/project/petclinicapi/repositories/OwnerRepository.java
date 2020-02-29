package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.Owner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface OwnerRepository extends CrudRepository<Owner, Integer> {

    @Query("SELECT owner FROM Owner owner WHERE owner.id = :id")
    Owner findByIdNoPets(@Param("id") Integer id);
}
