package com.practice.project;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_client")
    public Long id;

    @Column (name = "fio")
    public String fio;

    @Column (name = "email")
    public String email;

    @Column (name = "phone")
    public String phone;


    public Client(String fio, String email, String phone) {
        this.fio = fio;
        this.email = email;
        this.phone = phone;
    }
}
