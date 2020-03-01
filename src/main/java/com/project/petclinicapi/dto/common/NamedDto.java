package com.project.petclinicapi.dto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NamedDto extends BaseDto {

    private String name;
    public String toString() {
        return this.getName();
    }
}
