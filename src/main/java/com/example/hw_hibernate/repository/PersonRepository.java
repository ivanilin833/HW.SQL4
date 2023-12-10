package com.example.hw_hibernate.repository;

import com.example.hw_hibernate.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city){
        TypedQuery<Person> query = entityManager.createQuery(
                "SELECT p FROM Person p WHERE p.cityOfLiving = :city", Person.class);
        query.setParameter("city", city);
        return query.getResultList();
    }
}
