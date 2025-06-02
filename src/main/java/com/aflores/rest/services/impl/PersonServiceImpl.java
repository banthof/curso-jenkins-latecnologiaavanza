package com.aflores.rest.services.impl;

import com.aflores.rest.entities.Person;
import com.aflores.rest.repositories.PersonRepository;
import com.aflores.rest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private List<Person> persons = new ArrayList<>();

    public PersonServiceImpl() {
        persons.add(new Person(1, "Ana", "García", "ana@example.com"));
        persons.add(new Person(2, "Luis", "Martínez", "luis@example.com"));
        persons.add(new Person(3, "Sofía", "Rodríguez", "sofia@example.com"));
        persons.add(new Person(4, "Pedro", "Hernández", "pedro@example.com"));
        persons.add(new Person(5, "Laura", "Díaz", "laura@example.com"));
        persons.add(new Person(6, "Jorge", "Moreno", "jorge@example.com"));
        persons.add(new Person(7, "Elena", "Álvarez", "elena@example.com"));
        persons.add(new Person(8, "Miguel", "Romero", "miguel@example.com"));
        persons.add(new Person(9, "Isabel", "Navarro", "isabel@example.com"));
        persons.add(new Person(10, "David", "Torres", "david@example.com"));
        persons.add(new Person(11, "Mika", "Flores", "mikaflo@example.com"));
    }

    @Override
    public List<Person> getPersons() {
        return persons;
    }

    @Override
    public Person getById(Integer id) {
        return persons.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
