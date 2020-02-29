package com.project.petclinicapi.controllerResultJson;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PetJsonVisit extends BaseJson {
    private LocalDate visitDate;
    private String description;
}
