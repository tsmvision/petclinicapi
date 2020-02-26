package com.project.petclinicapi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "pets")
public class Pet extends NamedEntity {

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private PetType type;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private Owner owner;

}
