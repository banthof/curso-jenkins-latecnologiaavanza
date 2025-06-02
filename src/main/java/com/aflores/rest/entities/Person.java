package com.aflores.rest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
}
