package LabWork1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ser {

    public static void CreateFile(ArrayList<Lit> dataFile) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("./src/LabWork1/Ser.ser"));
        oos.writeObject(dataFile);
        oos.flush();
    }
}
