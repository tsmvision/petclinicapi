package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.Owner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class OwnerRepositoryTest {

    @Autowired
    OwnerRepository ownerRepositories;

    @Test
//    @Transactional
    public void create() {
        Owner owner = new Owner();
        owner.setFirstName("Luke");
        owner.setLastName("Lee");
        owner.setAddress("1234 st");
        owner.setCity("freedom");
        owner.setTelephone("1234567890");
        ownerRepositories.save(owner);
    }
}