package com.project.petclinicapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void shouldEqualsIfObjectIsVet() {
        Vet vet1 = new Vet();
        vet1.setId(1);
        assertTrue(vet1.equals(vet1));

        Vet vet2 = new Vet();
        vet2.setId(1);
        assertTrue(vet1.equals(vet2));
    }

    @Test
    void addSpecialty() {
        // when no specialties
        Vet vet = new Vet();
        assertEquals(0, vet.getSpecialties().size());

        // when one speciaities
        Specialty specialty1 = new Specialty();
        specialty1.setId(1);
        vet.addSpecialty(specialty1);
        assertEquals(1, vet.getSpecialties().size());

        // when add specialties having same id multiple time.
        Specialty specialty2 = new Specialty();
        specialty2.setId(1);
        Specialty specialty3 = new Specialty();
        specialty3.setId(1);
        vet.addSpecialty(specialty2);
        vet.addSpecialty(specialty3);
        assertEquals(1, vet.getSpecialties().size());

        // when add two specialties with different id
        Specialty specialty4 = new Specialty();
        specialty4.setId(2);
        vet.addSpecialty(specialty4);
        assertEquals(2, vet.getSpecialties().size());
    }
}