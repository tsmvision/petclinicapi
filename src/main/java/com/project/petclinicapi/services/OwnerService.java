package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Owner;
import java.util.List;

public interface OwnerService {
    Owner findById(Integer id);
    List<Owner> findAll();
    void save(Owner owner);
}
