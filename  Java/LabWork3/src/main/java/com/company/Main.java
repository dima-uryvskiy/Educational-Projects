package com.company;

import java.io.IOException;
import java.util.*;

import org.javatuples.Pair;

public class Main
{

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ArrayList<String[]> allData = FileReaderWriter.ReadFromFile("Lab1.csv");
        ArrayList<Lit> allLits = DataParser.Parse(new ArrayList<Lit>(), allData);

        ArrayList<Pair<String, String>> dataForDatabase = new ArrayList<Pair<String, String>>();
        for (Lit lit : allLits)
        {
            lit.PrintData();
            dataForDatabase.add(DatabaseDataPreparer.PrepearData(lit));
        }
        DatabaseMediator databaseMediator = new DatabaseMediator();
        if (databaseMediator.Connect("postgresql", "laba3", "admin", "12345"))
        {
            for (int i = 0; i < allLits.size(); i++)
            {
                databaseMediator.Insert(allLits.get(i).TakeClassName(),
                        dataForDatabase.get(i).getValue0(),
                        dataForDatabase.get(i).getValue1());
            }
            databaseMediator.Disconnect();
        }
    }
}
