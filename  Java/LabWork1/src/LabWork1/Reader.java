package LabWork1;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Reader {

    public static List<String[]> ReadFile() throws IOException {
        CSVReader reader = new CSVReader(new FileReader("./src/LabWork1/Lab1.csv"), ',', '"', 0);
        return reader.readAll();
    }
}
