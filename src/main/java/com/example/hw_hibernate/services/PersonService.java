package com.example.hw_hibernate.services;

import com.example.hw_hibernate.model.Person;
import com.example.hw_hibernate.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city){
        return repository.getPersonsByCity(city);
    }
}
