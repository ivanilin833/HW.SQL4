package com.example.hw_hibernate.services;

import com.example.hw_hibernate.model.Person;
import com.example.hw_hibernate.model.PersonInfo;
import com.example.hw_hibernate.repository.PersonQueryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonQueryRepository repository;

    public PersonService(PersonQueryRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.findPersonsIsCityOfLiving(city);
    }

    public List<Person> getPersonsByAge(int age) {
        return repository.findPersonsAgeLessThanOrderByIdAge(age);
    }

    public Person getPersonByFullName(String name, String surname) {
        return repository.findPersonsWithNameAndSurname(name, surname)
                .orElseThrow();
    }

    public Person savePerson(Person person){
        return repository.save(person);
    }

    public Person getPersonById(String name, String surname, int age){
        return repository.findById(new PersonInfo(name, surname, age))
                .orElseThrow();
    }

    public void deletePersonById(PersonInfo id){
        repository.deleteById(id);
    }

    public List<Person> getAllPersons(){
        return (List<Person>) repository.findAll();
    }
}
