package com.aflores.rest.services;

import com.aflores.rest.entities.Person;

import java.util.List;

public interface PersonService {
    List<Person> getPersons();
    Person getById(Integer id);
}
