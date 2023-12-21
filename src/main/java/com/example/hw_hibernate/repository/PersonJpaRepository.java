package com.example.hw_hibernate.repository;

import com.example.hw_hibernate.model.Person;
import com.example.hw_hibernate.model.PersonInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonJpaRepository extends CrudRepository<Person, PersonInfo> {
    List<Person> findAllByCityOfLiving(String cityOfLiving);

    List<Person> findAllByIdAgeLessThanOrderByIdAgeAsc(int age);

    Optional<Person> findByIdNameAndIdSurname(String name, String surname);
}
