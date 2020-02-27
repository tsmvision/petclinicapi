package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.Specialty;
import com.project.petclinicapi.model.Vet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpecialtyRepositoryTest {

    SpecialtyRepository specialtyRepository;

    @Autowired
    public SpecialtyRepositoryTest(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Test
    @Transactional
    public void create() {
        Specialty specialty = new Specialty();
        specialty.setName("luke");
        specialtyRepository.save(specialty);
    }

//    @Test
//    @Transactional
//    public void createWithVet() {
//        Specialty specialty = new Specialty();
//        specialty.setName("Luke");
//
//        Vet vet1 = new Vet();
//        vet1.setId(1);
//        Vet vet2 = new Vet();
//        vet2.setId(2);
//
//        specialty.addVet(vet1);
//        specialty.addVet(vet2);
//
//        specialtyRepository.save(specialty);
//    }
}