package LabWork1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Des {

    public static ArrayList<Lit> CreateArray() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("./src/LabWork1/Ser.ser"));
        ArrayList<Lit> newResult = (ArrayList<Lit>)ois.readObject();
        return newResult;
    }
}
