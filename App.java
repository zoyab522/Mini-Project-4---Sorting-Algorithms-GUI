package com.mycompany.sortingalgorithmsgui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("SORTING ALGORITHMS");

        TabPane tabPane = new TabPane();
        
        tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

        Tab tabSortingIntro = new Tab("Sorting Intro");
        Tab tabBubbleSort = new Tab("Merge Sort");
        Tab tabSelectionSort = new Tab("Selection Sort");
        Tab tabInsertionSort = new Tab("Insertion Sort");
        Tab tabQuickSort = new Tab("Quick Sort");

        HBox hbox = new HBox();
        hbox.getChildren().add
        (new Label("Sorting Efficiency" + "\n" + "\n" + 
                "The two main criterias to judge which algorithm is better than the other have been:" 
                + "\n" + "\n" 
                + "    1- Time taken to sort the given data." + ""
                + "\n" + "    2- Memory Space required to do so."));
        
        hbox.setAlignment(Pos.CENTER);
        
        tabSortingIntro.setContent(hbox); // set content line
      
        Button btn0 = new Button("Generate Random Numbers");
        Button btn00 = new Button("Start Bubble Sort");
        Button btn000 = new Button("Reset Numbers");
        HBox buttonHbox0 = new HBox();
        buttonHbox0.setAlignment(Pos.CENTER);
        buttonHbox0.getChildren().addAll(btn0, btn00, btn000);
        
        Label label = new Label();
        Label label2 = new Label();
        
        
        
        tabPane.getTabs().add(tabBubbleSort);
        tabPane.getTabs().add(tabSelectionSort);
        tabPane.getTabs().add(tabInsertionSort);
        tabPane.getTabs().add(tabQuickSort);

        Scene scene = new Scene(tabPane, 1300, 800);

        scene.getStylesheets().add("application.css");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

