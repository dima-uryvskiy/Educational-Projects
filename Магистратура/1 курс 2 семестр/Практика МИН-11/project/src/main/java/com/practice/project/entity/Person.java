package com.practice.project.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_person")
    public Long id;

    @Column (name = "name")
    public String name;

    @Column (name = "surname")
    public String surname;

    @Column (name = "age")
    public Integer age;

    @Column (name = "company")
    public String company;

    public Person(String name, String surname, Integer age, String company) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.company = company;
    }
}
