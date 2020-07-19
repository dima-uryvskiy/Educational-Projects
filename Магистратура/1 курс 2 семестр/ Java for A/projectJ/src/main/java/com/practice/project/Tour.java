package com.practice.project;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "tour")
public class Tour
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_tour")
    public Long id;

    @Column (name = "name")
    public String name;

    @Column (name = "price")
    public String price;

    @Column (name = "date_start")
    public String date_start;

    @Column (name = "date_end")
    public String date_end;

    public Tour(String name, String price, String date_start, String date_end) {
        this.name = name;
        this.price = price;
        this.date_start = date_start;
        this.date_end = date_end;
    }
}
