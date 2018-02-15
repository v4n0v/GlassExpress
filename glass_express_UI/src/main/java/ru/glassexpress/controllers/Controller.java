package ru.glassexpress.controllers;

import javafx.stage.Stage;
import ru.glassexpress.MainApp;

public class Controller {
    protected MainApp mainApp;
    Stage stage;
    ClientController clientController;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setClientController(ClientController clientController) {
        this.clientController = clientController;
    }

    public void close() {
        stage.close();
    }
}
