package com.practice.project.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "result")
public class Result
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_result")
    private Long id;

    @Column (name = "resultTest")
    private Integer resultTest;

    public Result(Integer resultTest) {
        this.resultTest = resultTest;
    }
}

