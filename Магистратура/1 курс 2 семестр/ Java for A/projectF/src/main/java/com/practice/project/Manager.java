package com.practice.project;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "manager")
public class Manager
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_manager")
    public Long id;

    @Column (name = "fio")
    public String fio;

    @Column (name = "position")
    public String position;

    @Column (name = "phone")
    public String phone;

    public Manager(String fio, String position, String phone) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
    }
}