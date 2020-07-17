package com.practice.project.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_company")
    public Long id;

    @Column (name = "name")
    public String name;

    @Column (name = "city")
    public String city;

    @Column (name = "address")
    public String address;

    public Company(String name, String city, String address) {
        this.name = name;
        this.city = city;
        this.address = address;
    }
}
