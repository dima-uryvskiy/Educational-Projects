package com.practice.project;

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
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "surname")
    private String surname;

    @Column (name = "age")
    private Integer age;

    @Column (name = "company")
    private String company;

    public Person(String name, String surname, Integer age, String company) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.company = company;
    }
}
