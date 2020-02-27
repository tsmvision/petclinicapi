package com.project.petclinicapi.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "vet_specialties",
            joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id")
    )
    private List<Specialty> specialties = new ArrayList<>();

    public void addSpecialty(Specialty specialty) {
        for (Specialty spc: specialties) {
            if (spc.getId().equals(specialty.getId())) {
                return;
            }
        }
        specialties.add(specialty);
    }

}
