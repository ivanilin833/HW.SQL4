package com.example.hw_hibernate.controllers;

import com.example.hw_hibernate.model.Person;
import com.example.hw_hibernate.model.PersonInfo;
import com.example.hw_hibernate.services.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/root/by-city")
    public List<Person> getPersonsById (@RequestParam String city){

        return service.getPersonsByCity(city);
    }

    @GetMapping("/root/by-age")
    public List<Person> getPersonsByAge (@RequestParam int age){

        return service.getPersonsByAge(age);
    }

    @GetMapping("/root/by-fullname")
    public Person getPersonsByfullName(@RequestParam String name, @RequestParam String surname){

        return service.getPersonByFullName(name, surname);
    }

    @GetMapping("/root/by-id")
    public Person getPersonsById(@RequestParam String name, @RequestParam String surname,
                                 @RequestParam int age){

        return service.getPersonById(name, surname, age);
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getAll(){
        return ResponseEntity.ok(service.getAllPersons());
    }

    @PostMapping("/root")
    public Person savePerson(@RequestBody Person person){
        return service.savePerson(person);
    }

    @DeleteMapping("/root")
    public List<Person> deletePersonById(@RequestBody PersonInfo id){
        service.deletePersonById(id);
        return service.getAllPersons();
    }
}
