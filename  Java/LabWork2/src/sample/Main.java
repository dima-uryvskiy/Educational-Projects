package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;

public class Main extends Application{
    static String field;
    static String value;
    static int index;

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // создаем список объектов
        ObservableList<Lit> lit = FXCollections.observableArrayList(
                new Lit("book","Histotia",1987,"AAA","Willi",555),
                new Lit("jour","Avto",2011,"BBB","Alex",25),
                new Lit("jour","Myr",2020,"CCC","Sergio",80),
                new Lit("book","Cats",2001,"DDD","MAYcAT",567)
        );

        // определяем таблицу и устанавливаем данные
        TableView<Lit> table = new TableView<Lit>(lit);
        table.setPrefWidth(367);
        table.setPrefHeight(150);

        // столбец для вывода имени
        TableColumn<Lit, String> typeColumn = new TableColumn<Lit, String>("Type");
        // определяем фабрику для столбца с привязкой к свойству name
        typeColumn.setCellValueFactory(new PropertyValueFactory<Lit, String>("type"));
        // добавляем столбец
        table.getColumns().add(typeColumn);

        TableColumn<Lit, String> nameColumn = new TableColumn<Lit, String>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<Lit, String>("name"));
        table.getColumns().add(nameColumn);

        // столбец для вывода возраста
        TableColumn<Lit, Integer> yearColumn = new TableColumn<Lit, Integer>("Year");
        yearColumn.setCellValueFactory(new PropertyValueFactory<Lit, Integer>("year"));
        table.getColumns().add(yearColumn);

        TableColumn<Lit, String> editionColumn = new TableColumn<Lit, String>("Edition");
        editionColumn.setCellValueFactory(new PropertyValueFactory<Lit, String>("edition"));
        table.getColumns().add(editionColumn);

        TableColumn<Lit, String> authorColumn = new TableColumn<Lit, String>("Author");
        authorColumn.setCellValueFactory(new PropertyValueFactory<Lit, String>("author"));
        table.getColumns().add(authorColumn);

        TableColumn<Lit, Integer> pagesColumn = new TableColumn<Lit, Integer>("Pages");
        pagesColumn.setCellValueFactory(new PropertyValueFactory<Lit, Integer>("pages"));
        table.getColumns().add(pagesColumn);

        Label labelField = new Label("Field:");
        ObservableList<String> fields = FXCollections.observableArrayList("Type", "Name", "Year", "Edition", "Author", "Pages");
        ComboBox<String> fieldComboBox = new ComboBox<String>(fields);

        Label labelValue = new Label("Value:");
        TextField valueInput = new TextField();

        Button btn = new Button("Find");
        btn.setPrefWidth(80);

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 15, labelField, fieldComboBox, labelValue, valueInput, btn, table);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 600, 300);

        stage.setScene(scene);

        stage.setTitle("TableView in JavaFX");
        stage.show();

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                field = fieldComboBox.getValue();
                value = valueInput.getText();
                Controller.FindRow(table, index, field, value);
            }
        });
    }
}