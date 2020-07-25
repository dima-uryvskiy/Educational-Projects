package com.practice.project;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_shop")
    public Long id;

    @Column (name = "id_client")
    public Integer id_client;

    @Column (name = "id_product")
    public Integer id_product;

    @Column (name = "id_manager")
    public Integer id_manager;

    @Column (name = "address")
    public String address;

    public Shop(Integer id_client, Integer id_product, Integer id_manager, String address)
    {
        this.id_client = id_client;
        this.id_product = id_product;
        this.id_manager = id_manager;
        this.address = address;
    }
}

