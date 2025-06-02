package com.aflores.rest.controllers;

import com.aflores.rest.entities.Person;
import com.aflores.rest.services.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
@Slf4j
public class PersonController {

    @Autowired
    private PersonService personService;

    /*@Value("${app.message.personalized}")
    private String messageFromDocker;*/

    /*@PostMapping
    public ResponseEntity<?> createNewPerson(@RequestBody Person person) {
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.createPerson(person));
    }*/

    @GetMapping
    public ResponseEntity<?> getAllPersons() {
        /*log.info("================= Mensaje desde una variable de entorno docker {}", messageFromDocker);*/
        return ResponseEntity.ok(personService.getPersons());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPersonById(@PathVariable Integer id) {
        Person personDb = personService.getById(id);
        if (personDb == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(personDb);
    }
}
