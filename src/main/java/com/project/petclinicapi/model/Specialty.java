package com.project.petclinicapi.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "specialties")
    private Set<Vet> vets;

}
