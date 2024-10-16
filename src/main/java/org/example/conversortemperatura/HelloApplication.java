package org.example.conversortemperatura;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 950, 600);

        HelloController controller = fxmlLoader.getController();

        controller.initialize();

        stage.setMinWidth(scene.getWidth());
        stage.setMinHeight(scene.getHeight());
        stage.setMaxWidth(scene.getWidth());
        stage.setMaxHeight(scene.getHeight());
        stage.setTitle("Guillem Vicente");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}