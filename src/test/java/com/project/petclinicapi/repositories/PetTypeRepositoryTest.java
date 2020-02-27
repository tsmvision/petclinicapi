package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.PetType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PetTypeRepositoryTest {

    @Autowired
    PetTypeRepository petTypeRepository;

    @Test
    @Transactional
    public void create() {
        PetType petType = new PetType();
        petType.setName("pet type01");
        petTypeRepository.save(petType);
    }
}