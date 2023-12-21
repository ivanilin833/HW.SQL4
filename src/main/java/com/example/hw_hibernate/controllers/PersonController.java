package com.example.hw_hibernate.controllers;

import com.example.hw_hibernate.model.Person;
import com.example.hw_hibernate.model.PersonInfo;
import com.example.hw_hibernate.services.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsById (@RequestParam String city){

        return service.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getPersonsByAge (@RequestParam int age){

        return service.getPersonsByAge(age);
    }

    @GetMapping("/persons/by-fullname")
    public Person getPersonsByfullName(@RequestParam String name, @RequestParam String surname){

        return service.getPersonByFullName(name, surname);
    }

    @GetMapping("/persons/by-id")
    public Person getPersonsById(@RequestParam String name, @RequestParam String surname,
                                 @RequestParam int age){

        return service.getPersonById(name, surname, age);
    }

    @PostMapping("/persons")
    public Person savePerson(@RequestBody Person person){
        return service.savePerson(person);
    }

    @DeleteMapping("/persons")
    public List<Person> deletePersonById(@RequestBody PersonInfo id){
        service.deletePersonById(id);
        return service.getAllPersons();
    }
}
