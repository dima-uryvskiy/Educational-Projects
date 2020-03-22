package sample;

import javafx.scene.control.TableView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Controller {

    public static void FindRow(TableView<Lit> table, int index, String field, String value)
    {
        ArrayList<String[]> listTable = new ArrayList<String[]>();
        for (Lit objects: table.getItems()) {
            listTable.add(objects.returnArray());
        }

        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        dictionary.put("type", 0);
        dictionary.put("name", 1);
        dictionary.put("year", 2);
        dictionary.put("edition", 3);
        dictionary.put("author", 4);
        dictionary.put("pages", 5);

        for (String[] arrayValues: listTable)
        {
            if (arrayValues[dictionary.get(field.toLowerCase())].indexOf(value) != -1)
                break;
            index++;
        }
        table.getSelectionModel().select(index);
    }
}
