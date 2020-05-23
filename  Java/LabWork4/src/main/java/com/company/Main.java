package com.company;

import java.io.IOException;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String[]> dataOffice = FileReaderWriter.ReadFromFile("Polka.csv");
        ArrayList<Polka> polkas = new ArrayList<Polka>();
        ObjectDAO objectDAO = new ObjectDAO();
        for (String[] officeData: dataOffice) {
            Polka polka = new Polka();
            polka.setType(officeData[0]);
            polka.setName(officeData[1]);
            polka.setCountry(officeData[2]);

            polkas.add(polka);
        }

        ArrayList<String[]> data = FileReaderWriter.ReadFromFile("DataFile.csv");
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Jour> jours = new ArrayList<Jour>();

        for (String[] furnitureData: data)
        {
            if (furnitureData[0].contains("book")){

                Book book = new Book();
                book.setType(furnitureData[0]);
                book.setName(furnitureData[1]);
                book.setPages(Integer.valueOf(furnitureData[2]));

                objectDAO.addValue(book);
                books.add(book);
            }

            if (furnitureData[0].contains("jour")) {

                Jour jour = new Jour();
                jour.setType(furnitureData[0]);
                jour.setName(furnitureData[1]);
                jour.setPages(Integer.valueOf(furnitureData[2]));


                objectDAO.addValue(jour);
                jours.add(jour);
            }
        }

        objectDAO = new ObjectDAO();

        int indexObject = 0;
        for (Polka polka : polkas)
        {
            objectDAO.addValue(polka);

            polka.addBooks(books.get(indexObject));
            polka.addJour(jours.get(indexObject));
        }

        int index = 1;
        String name = "Winner";

        polkas.get(index).setName(name);
        objectDAO.updateValue(polkas.get(index));

        index = 1;

        objectDAO.deleteValue(polkas.get(index));

        index = 1;

        System.out.println(objectDAO.getPolkaById(Long.parseLong(Integer.toString(index))).toString());

        for (Polka polka : objectDAO.getAllPolka()){
            System.out.println(polka.toString());
        }

        for (Polka polka : objectDAO.hqlRequest()){
            System.out.println(polka.toString());
        }
    }
}
