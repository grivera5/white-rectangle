package edu.daltonstate.diskoflasers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class test extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Label
        Label label = new Label("Enter your name:");

        // Create a TextField
        TextField textField = new TextField();

        // Create a Button
        Button button = new Button("Submit");
        button.setOnAction(event -> {
            String name = textField.getText();
            System.out.println("Hello, " + name + "!");
        });

        // Add the Label, TextField, and Button to a VBox
        VBox vbox = new VBox(10, label, textField, button);

        // Create a Scene and add the VBox to it
        Scene scene = new Scene(vbox, 600, 400);

        // Set the title of the window
        primaryStage.setTitle("My JavaFX App");

        // Set the Scene for the window and show it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}