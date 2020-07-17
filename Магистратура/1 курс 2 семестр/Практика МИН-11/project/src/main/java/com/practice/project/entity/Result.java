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
    public Long id;

    @Column (name = "resultTest")
    public Integer resultTest;

    public Result(Integer resultTest) {
        this.resultTest = resultTest;
    }
}

