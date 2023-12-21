package com.example.hw_hibernate.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Persons")
public class Person {
    @EmbeddedId
    private PersonInfo id;
    private String phoneNumber;
    private String cityOfLiving;
}
