package com.project.petclinicapi.controllerResultJson;

import com.project.petclinicapi.model.Pet;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class VisitJson extends BaseJson {

    private LocalDate visitDate;
    private String description;
    private Integer petId;
}
