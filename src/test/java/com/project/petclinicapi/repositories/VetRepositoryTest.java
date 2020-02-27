package com.project.petclinicapi.repositories;

import com.project.petclinicapi.model.Specialty;
import com.project.petclinicapi.model.Vet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VetRepositoryTest {

    VetRepository vetRepository;
    SpecialtyRepository specialtyRepository;

    @Autowired
    public VetRepositoryTest(VetRepository vetRepository, SpecialtyRepository specialtyRepository) {
        this.vetRepository = vetRepository;
        this.specialtyRepository = specialtyRepository;
    }

//    @Test
//    @Transactional
//    public void create() {
//        Vet vet = new Vet();
//        vetRepository.save(vet);
//    }

//    @Test
////    @Transactional
//    public void createWithSpecialties() {
////        Vet vet = new Vet();
////        vet.setFirstName("Luke");
////        vet.setLastName("Lee");
////        vetRepository.save(vet);
//
////        Specialty specialty1 = new Specialty();
////        specialty1.setName("specialty1");
////        specialtyRepository.save(specialty1);
////
////        Specialty specialty2 = new Specialty();
////        specialty2.setName("specialty2");
////        specialtyRepository.save(specialty2);
//
//        Optional<Specialty> specialty1 = specialtyRepository.findById(35);
//        Optional<Specialty> specialty2 = specialtyRepository.findById(36);
//        Optional<Vet> vet = vetRepository.findById(22);
//
//        if (specialty1.isPresent() && specialty2.isPresent() && vet.isPresent()) {
//            Set<Specialty> specialties = new HashSet<>();
//            specialties.add(specialty1.get());
//            specialties.add(specialty2.get());
//            vet.get().setSpecialties(specialties);
//            vetRepository.save(vet.get());
//        }
//    }
}