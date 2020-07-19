package com.practice.project;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "request")
public class Request
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_request")
    public Long id;

    @Column (name = "id_client")
    public Integer id_client;

    @Column (name = "id_tour")
    public Integer id_tour;

    @Column (name = "id_employee")
    public Integer id_employee;

    @Column (name = "date")
    public String date;

    public Request(Integer id_client, Integer id_tour, Integer id_employee, String date)
    {
        this.id_client = id_client;
        this.id_tour = id_tour;
        this.id_employee = id_employee;
        this.date = date;
    }
}

