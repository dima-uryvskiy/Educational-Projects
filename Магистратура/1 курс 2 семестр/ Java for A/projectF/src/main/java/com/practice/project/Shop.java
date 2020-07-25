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

    @Column (name = "id_order")
    public Integer id_order;

    @Column (name = "url")
    public String url;

    public Shop(Integer id_client, Integer id_product, Integer id_order, String url)
    {
        this.id_client = id_client;
        this.id_product = id_product;
        this.id_order = id_order;
        this.url = url;
    }
}

