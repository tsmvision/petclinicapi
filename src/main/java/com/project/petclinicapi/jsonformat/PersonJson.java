package com.project.petclinicapi.jsonformat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonJson extends BaseEntityJson {

    private String firstName;
    private String lastName;
}
