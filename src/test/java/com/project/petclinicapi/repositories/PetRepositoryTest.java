package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.Owner;
import com.project.petclinicapi.model.Pet;
import com.project.petclinicapi.model.PetType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootTest
class PetRepositoryTest {

    PetRepository petRepositories;
    OwnerRepository ownerRepositories;
    PetTypeRepository petTypeRepository;

    @Autowired
    public PetRepositoryTest(PetRepository petRepositories,
                             OwnerRepository ownerRepositories,
                             PetTypeRepository petTypeRepository) {
        this.petRepositories = petRepositories;
        this.ownerRepositories = ownerRepositories;
        this.petTypeRepository = petTypeRepository;
    }

    @AfterEach
    public void afterEach() {

    }

//    @Test
//    @Transactional
//    public void create() throws Exception {
//
//        Optional<Owner> owner = ownerRepositories.findById(4);
//        Optional<PetType> type = petTypeRepository.findById(4);
//
//        if (owner.isPresent() && type.isPresent()) {
//            Pet pet = new Pet();
//            pet.setName("dog01");
//            LocalDate localDate = LocalDate.of(2010, 1, 1);
//            pet.setBirthDate(localDate);
//            pet.setOwner(owner.get());
//            pet.setType(type.get());
//
//            petRepositories.save(pet);
//        } else {
//            throw new Exception(" owner, type not existing");
//        }
//    }
}