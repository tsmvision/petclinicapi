package com.project.petclinicapi.dto.visit;

import com.project.petclinicapi.dto.common.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class VisitDto extends BaseDto {

    private LocalDate visitDate;
    private String description;
    private Integer petId;
}
