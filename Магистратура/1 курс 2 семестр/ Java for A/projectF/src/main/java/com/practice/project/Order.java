package com.practice.project;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_order")
    public Long id;

    @Column (name = "number")
    public String number;

    @Column (name = "price")
    public String price;

    @Column (name = "address")
    public String address;

    public Order(String number, String price, String address) {
        this.number = number;
        this.price = price;
        this.address = address;
    }
}