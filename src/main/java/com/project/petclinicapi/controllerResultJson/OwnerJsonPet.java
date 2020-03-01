package com.project.petclinicapi.controllerResultJson;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OwnerJsonPet extends NamedJson{
    private LocalDate birthDate;
}
