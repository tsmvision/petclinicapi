package com.project.petclinicapi.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDto extends BaseDto {

    private String firstName;
    private String lastName;
}
