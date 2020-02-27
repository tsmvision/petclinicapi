package com.project.petclinicapi.services;

import com.project.petclinicapi.model.Owner;

public interface OwnerService {
    Owner findById(Integer id);
    void save(Owner owner);
}
