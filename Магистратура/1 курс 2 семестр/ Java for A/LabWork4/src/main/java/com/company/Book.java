package com.company;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column (name = "id_book")
    private Long id;

    @Column (name = "type")
    private String type;

    @Column (name = "name")
    private String name;

    @Column (name = "pages")
    private int pages;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_polka")
    private Polka polka;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Polka getPolka() {
        return polka;
    }

    public void setPolka(Polka polka) {
        this.polka = polka;
    }

    @Override
    public String toString()
    {
        return
                "Type:" + type + "\nName:" + name +
                "\nPages:" +  pages + "\n";
    }
}
