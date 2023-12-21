package com.example.hw_hibernate.services;

import com.example.hw_hibernate.model.Person;
import com.example.hw_hibernate.model.PersonInfo;
import com.example.hw_hibernate.repository.PersonJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonJpaRepository repository;

    public PersonService(PersonJpaRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.findAllByCityOfLiving(city);
    }

    public List<Person> getPersonsByAge(int age) {
        return repository.findAllByIdAgeLessThanOrderByIdAgeAsc(age);
    }

    public Person getPersonByFullName(String name, String surname) {
        return repository.findByIdNameAndIdSurname(name, surname)
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
