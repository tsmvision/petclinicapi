package com.project.petclinicapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToMany
    private List<Vet> vets = new ArrayList<>();
}
