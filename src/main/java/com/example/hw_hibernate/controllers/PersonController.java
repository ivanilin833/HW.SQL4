package com.example.hw_hibernate.controllers;

import com.example.hw_hibernate.model.Person;
import com.example.hw_hibernate.services.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
