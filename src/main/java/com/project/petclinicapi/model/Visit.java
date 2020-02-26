package com.project.petclinicapi.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Visit extends BaseEntity {

    private LocalDate visitDate;
    private String description;
    // pet - relationship
}
