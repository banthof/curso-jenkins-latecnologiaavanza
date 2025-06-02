package com.aflores.rest.entities;

/*import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;*/
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
/*@Entity*/
public class Person {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
}
