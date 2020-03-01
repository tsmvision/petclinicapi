package com.project.petclinicapi.dto.owner;

import com.project.petclinicapi.dto.common.NamedDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PetDto extends NamedDto {
    private LocalDate birthDate;
}
