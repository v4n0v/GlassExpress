package ru.glassexpress;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;


import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();
        showPersonOverview();
    }

    /**
     * Инициализирует корневой макет.
     */
    public void initRootLayout() {
        try {
            // Загружаем корневой макет из fxml файла.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            System.out.println("рут подгружен");
            rootLayout = (BorderPane) loader.load();
            System.out.println("BorderPane подгружен");
            // Отображаем сцену, содержащую корневой макет.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Показывает в корневом макете сведения об адресатах.
     */
    public void showPersonOverview() {
        try {
            // Загружаем сведения об адресатах.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("ModelAddLayout.fxml"));
            System.out.println("вью подгружен");
            VBox modelAdd = (VBox) loader.load();

            // Помещаем сведения об адресатах в центр корневого макета.
            rootLayout.setCenter(modelAdd);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Возвращает главную сцену.
     *
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
