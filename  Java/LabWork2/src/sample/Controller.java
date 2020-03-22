package sample;

import javafx.scene.control.TableView;
import java.util.ArrayList;

public class Controller {

    public static void FindRow(TableView<Lit> table, int index, String field, String value)
    {
        ArrayList<String[]> listTable = new ArrayList<String[]>();
        for (Lit objects: table.getItems()) {
            listTable.add(objects.returnArray());
        }

        int indexValue = 0;
        switch (field.toLowerCase()) {
            case "type": indexValue = 0;
                break;
            case "name": indexValue = 1;
                break;
            case "year": indexValue = 2;
                break;
            case "edition": indexValue = 3;
                break;
            case "author": indexValue = 4;
                break;
            case "pages": indexValue = 5;
                break;
            default:
                break;
        }

        for (String[] arrayValues: listTable)
        {
            if (arrayValues[indexValue].indexOf(value) != -1)
                break;
            index++;
        }
        table.getSelectionModel().select(index);
    }
}
