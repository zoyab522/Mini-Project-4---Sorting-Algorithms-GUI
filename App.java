package com.mycompany.sortingalgorithmsgui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        TabPane tabPane = new TabPane();
        Tab tabSortingIntro = new Tab("Sorting Intro");
        Tab tabBubbleSort = new Tab("Bubble Sort");
        Tab tabSelectionSort = new Tab("Selection Sort");
        Tab tabInsertionSort = new Tab("Insertion Sort");
        
        HBox defaultTabHBox = new HBox();
        
        tabPane.getTabs().add(tabSortingIntro);
        tabPane.getTabs().add(tabBubbleSort);
        tabPane.getTabs().add(tabSelectionSort);
        tabPane.getTabs().add(tabInsertionSort);
        
        Scene scene = new Scene(tabPane, 600, 600);
        scene.getStylesheets().add("application.css");
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
