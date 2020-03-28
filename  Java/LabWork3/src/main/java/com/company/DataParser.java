package com.company;

import java.util.ArrayList;

public class DataParser
{
    static public ArrayList<Lit> Parse(ArrayList<Lit> allLits, ArrayList<String []> allData)
    {
        for (String[] furnitureData:allData)
        {
            if(furnitureData[0].contains("book"))
                allLits.add(new Book(furnitureData));
            else
            if(furnitureData[0].contains("jour"))
                allLits.add(new Jour(furnitureData));
        }
        return allLits;
    }
}
