package com.practice.project;

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
    private Long id;

    @Column (name = "quastion")
    private String quastion;

    @Column (name = "answer")
    private String answer;

    public Test(String quastion, String answer) {
        this.quastion = quastion;
        this.answer = answer;
    }
}
