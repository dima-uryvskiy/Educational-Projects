package com.practice.project;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_employee")
    public Long id;

    @Column (name = "fio")
    public String fio;

    @Column (name = "position")
    public String position;

    @Column (name = "contact")
    public String contact;

    public Employee(String fio, String position, String contact) {
        this.fio = fio;
        this.position = position;
        this.contact = contact;
    }
}