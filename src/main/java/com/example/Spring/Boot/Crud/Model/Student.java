package com.example.Spring.Boot.Crud.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
    @Id
    private Long id;

    private String name;

    private String course;

}
