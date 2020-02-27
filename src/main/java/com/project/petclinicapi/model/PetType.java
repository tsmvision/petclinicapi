package com.project.petclinicapi.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "types")
public class PetType extends NamedEntity {
}
