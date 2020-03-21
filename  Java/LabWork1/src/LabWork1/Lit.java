package LabWork1;

import java.io.Serializable;

public abstract class Lit implements Serializable
{
    public String type;
    public String name;
    public int year;
    public String edition;
    public String author;
    public int pages;

    public Lit(String type, String name, int year, String edition, String author, int pages)
    {
        this.type = type;
        this.name = name;
        this.year = year;
        this.edition = edition;
        this.author = author;
        this.pages = pages;
    }

    public void LookInfo()
    {
        System.out.println("Main Info:");
        System.out.printf("Type: %s\nName: %s\nYear: %d\nEdition: %s\nAuthor: %s\nPages: %d\n",
                type, name, year, edition, author, pages);
        System.out.print("\n");
    }
}
