package com.practice.project;

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
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "city")
    private String city;

    @Column (name = "address")
    private String address;

    @Column (name = "vat")
    private String vat;
}
