package com.project.petclinicapi.controllerResultJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NamedJson extends BaseJson {

    private String name;

    public String toString() {
        return this.getName();
    }
}
