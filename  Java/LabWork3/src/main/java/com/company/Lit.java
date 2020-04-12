package com.company;
import java.io.*;

public abstract class Lit implements Serializable
{
    public String type;
    public String name;
    public int year;
    public String edition;
    public String author;
    public int pages;
    public void PrintData(){};
    public void CreateFromText(String [] text){};
    public String TakeClassName(){return this.getClass().getSimpleName();};
}
