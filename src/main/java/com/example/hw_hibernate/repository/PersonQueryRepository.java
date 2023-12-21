package com.example.hw_hibernate.repository;

import com.example.hw_hibernate.model.Person;
import com.example.hw_hibernate.model.PersonInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PersonQueryRepository extends CrudRepository<Person, PersonInfo> {
    @Query("select p from Person p where p.cityOfLiving = :cityOfLiving")
    List<Person> findPersonsIsCityOfLiving(@Param("cityOfLiving") String cityOfLiving);

    @Query("select p from Person p where p.id.age < :age order by p.id.age asc")
    List<Person> findPersonsAgeLessThanOrderByIdAge(int age);

    @Query("select p from Person p where p.id.name = :name and p.id.surname = :surname")
    Optional<Person> findPersonsWithNameAndSurname(String name, String surname);
}
