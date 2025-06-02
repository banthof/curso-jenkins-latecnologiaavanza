package com.aflores.rest.services;

import com.aflores.rest.entities.Person;

import java.util.List;

public interface PersonService {
    /*Person createPerson(Person person);*/
    List<Person> getPersons();
    Person getById(Integer id);
}
