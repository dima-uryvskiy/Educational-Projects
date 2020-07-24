package com.practice.project;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_product")
    public Long id;

    @Column (name = "name")
    public String name;

    @Column (name = "price")
    public String price;

    @Column (name = "article")
    public String article;

    public Product(String name, String price, String article) {
        this.name = name;
        this.price = price;
        this.article = article;
    }
}
