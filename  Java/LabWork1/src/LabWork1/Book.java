package LabWork1;

public class Book extends Lit
{
    public Book(String type, String name, int year, String edition, String author, int pages)
    {
       super(type, name, year, edition, author, pages);
    }

    public void LookInfo()
    {
        System.out.println("Main Info:");
        System.out.printf("Type: %s\nName: %s\nYear: %d\nEdition: %s\nAuthor: %s\nPages: %d\n",
                type, name, year, edition, author, pages);
        System.out.print("\n");
    }
}
