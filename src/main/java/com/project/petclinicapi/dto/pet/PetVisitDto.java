package com.project.petclinicapi.dto.pet;

import com.project.petclinicapi.dto.common.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PetVisitDto extends BaseDto {
    private LocalDate visitDate;
    private String description;
}
