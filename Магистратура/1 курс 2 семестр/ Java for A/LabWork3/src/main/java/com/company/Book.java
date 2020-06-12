package com.company;

public class Book extends Lit
{
    public Book(String [] allParameters)
    {
        CreateFromText(allParameters);
    }

    @Override public void CreateFromText(String [] allParameters)
    {
        this.type = allParameters[0];
        this.name = allParameters[1];
        this.year = Integer.valueOf(allParameters[2]);
        this.edition = allParameters[3];
        this.author = allParameters[4];
        this.pages = Integer.valueOf(allParameters[5]);
    }

    @Override public void PrintData()
    {
        System.out.println("Main Info:");
        System.out.printf("Type: %s\nName: %s\nYear %d\nEdition: %s\nAutor: %s\nPages %d\n",
                this.type, this.name, this.year, this.edition, this.author, this.pages);
        System.out.print("\n");
    }

}
