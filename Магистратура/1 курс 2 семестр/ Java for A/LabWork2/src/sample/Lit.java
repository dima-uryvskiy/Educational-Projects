package sample;

import javafx.beans.property.*;


public class Lit {

    private SimpleStringProperty type;
    private SimpleStringProperty name;
    private SimpleIntegerProperty year;
    private SimpleStringProperty edition;
    private SimpleStringProperty author;
    private SimpleIntegerProperty pages;

    public Lit(String type, String name, int year, String edition, String author, int pages)
    {
        this.type = new SimpleStringProperty(type);
        this.name = new SimpleStringProperty(name);
        this.year = new SimpleIntegerProperty(year);
        this.edition = new SimpleStringProperty(edition);
        this.author = new SimpleStringProperty(author);
        this.pages = new SimpleIntegerProperty(pages);
    }

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getYear() {
        return year.get();
    }

    public SimpleIntegerProperty yearProperty() {
        return year;
    }

    public void setYear(int year) {
        this.year.set(year);
    }

    public String getEdition() {
        return edition.get();
    }

    public SimpleStringProperty editionProperty() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition.set(edition);
    }

    public String getAuthor() {
        return author.get();
    }

    public SimpleStringProperty authorProperty() {
        return author;
    }

    public void setAuthor(String author) {
        this.author.set(author);
    }

    public int getPages() {
        return pages.get();
    }

    public SimpleIntegerProperty pagesProperty() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages.set(pages);
    }

    public String[] returnArray(){
        return new String[] {type.get(), name.get(), String.valueOf(year.get()),  edition.get(), author.get(), String.valueOf(pages.get())};
    }
}
