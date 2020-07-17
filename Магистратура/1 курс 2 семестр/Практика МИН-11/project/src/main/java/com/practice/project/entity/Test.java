package com.practice.project.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "test")
public class Test
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_test")
    public Long id;

    @Column (name = "quastion")
    public String quastion;

    @Column (name = "answer")
    public String answer;

    public Test(String quastion, String answer) {
        this.quastion = quastion;
        this.answer = answer;
    }
}
