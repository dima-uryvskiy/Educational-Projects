package com.company;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "polka")
public class Polka {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_polka")
    private Long id;

    @Column (name = "type")
    private String type;

    @Column (name = "name")
    private String name;

    @Column (name = "country")
    private String country;


    @OneToMany(mappedBy = "polka", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;
    @OneToMany(mappedBy = "polka", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Jour> jours;

    public Polka() {
        books = new ArrayList<Book>();
        jours = new ArrayList<Jour>();

    }

    public void addBooks(Book book) {
        book.setPolka(this);
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addJour(Jour jour) {
        jour.setPolka(this);
        jours.add(jour);
    }

    public void removeJour(Jour jour) {
        jours.remove(jour);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return
                "Type:" + type + "\nName:" + name +
                "\nCountry:" + country + "\n";
    }
}

