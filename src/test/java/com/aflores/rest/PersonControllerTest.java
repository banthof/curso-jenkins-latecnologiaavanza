package com.aflores.rest;

import com.aflores.rest.controllers.PersonController;
import com.aflores.rest.entities.Person;
import com.aflores.rest.services.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class PersonControllerTest {/*pruebas unitarias en spring boot*/

    @InjectMocks
    private PersonController personController;

    @Mock
    private PersonService personService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllPersons_WhenCalled_ReturnsListOfPersons() {
        // Arrange
        List<Person> mockPersons = Arrays.asList(
                new Person(1, "Ana", "García", "ana@example.com"),
                new Person(2, "Luis", "Martínez", "luis@example.com")
        );
        when(personService.getPersons()).thenReturn(mockPersons);

        // Act
        ResponseEntity<?> response = personController.getAllPersons();

        // Assert
        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
        assertEquals(mockPersons, response.getBody());
    }

    @Test
    void getPersonById_WithValidId_ReturnsPerson() {
        // Arrange
        Integer id = 1;
        Person mockPerson = new Person(id, "Ana", "García", "ana@example.com");
        when(personService.getById(id)).thenReturn(mockPerson);

        // Act
        ResponseEntity<?> response = personController.getPersonById(id);

        // Assert
        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
        assertEquals(mockPerson, response.getBody());
    }

}
