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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
        
        // SORTING INTRO TAB ---------------------------------------------------
        Tab tabSortingIntro = new Tab("Sorting Intro");
        
        Tab tabInsertionSort = new Tab("Insertion Sort");
        Tab tabQuickSort = new Tab("Quick Sort");

        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        
        
        Label SortingIntroLabel = new Label("Sorting Efficiency" + "\n" + "\n" + 
                "The two main criterias to judge which algorithm is better than the other have been:" 
                + "\n" + "\n" 
                + "    1 - Time taken to sort the given data." + ""
                + "\n" + "    2 - Memory Space required to do so.");
        
        hbox.getChildren().add(SortingIntroLabel);
        
        tabSortingIntro.setContent(hbox); // set content line
        
        tabPane.getTabs().add(tabSortingIntro);
        
        // MERGE SORT TAB ------------------------------------------------------
        
        Tab tabMergeSort = new Tab("Merge Sort");
        
        VBox mergeSortVBox = new VBox();
        mergeSortVBox.setSpacing(80);
        
        HBox mergeSortHBox1 = new HBox();
        mergeSortHBox1.setAlignment(Pos.TOP_CENTER);
        
        HBox mergeSortHBox2 = new HBox();
        
        HBox mergeSortHBox3 = new HBox();
        mergeSortHBox3.setAlignment(Pos.CENTER);
        
        Label mergeSortLabel = new Label("\n\nMerge Sort Description: " 
                + "Merge Sort divides the input array into two halves,\ncalls itself "
                + "for the two halves, and then merges the two sorted halves.");
        
        mergeSortHBox1.getChildren().add(mergeSortLabel);
        
        TextField mfield1 = new TextField();
        TextField mfield2 = new TextField();
        TextField mfield3 = new TextField();
        TextField mfield4 = new TextField();
        TextField mfield5 = new TextField();
        TextField mfield6 = new TextField();
        TextField mfield7 = new TextField();
        TextField mfield8 = new TextField();
        TextField mfield9 = new TextField();
        TextField mfield10 = new TextField();
                
        mergeSortHBox2.getChildren().addAll
        (mfield1, mfield2, mfield3, mfield4, mfield5, mfield6, mfield7, mfield8, mfield9, mfield10);
        
        Button randBtnMerge = new Button("Generate Random Numbers");
        Button startSortBtnMerge = new Button("Start Bubble Sort");
        Button resetBtnMerge = new Button("Reset Numbers");
        
        mergeSortHBox3.getChildren().addAll(randBtnMerge, startSortBtnMerge, resetBtnMerge);
        
        mergeSortVBox.getChildren().addAll(mergeSortHBox1, mergeSortHBox2, mergeSortHBox3);

        tabMergeSort.setContent(mergeSortVBox); // set content line
        
        tabPane.getTabs().add(tabMergeSort);
        
        // SELECTION SORT TAB --------------------------------------------------
        
        Tab tabSelectionSort = new Tab("Selection Sort");
        
        VBox selectionSortVBox = new VBox();
        selectionSortVBox.setSpacing(80);
        
        HBox selectionSortHBox1 = new HBox();
        selectionSortHBox1.setAlignment(Pos.TOP_CENTER);
        
        HBox selectionSortHBox2 = new HBox();
        
        HBox selectionSortHBox3 = new HBox();
        selectionSortHBox3.setAlignment(Pos.CENTER);
        
        Label selectionSortLabel = new Label("\n\nSelection Sort Description: "
                + "Selection Sort sorts an array by repeatedly finding the minimum "
                + "element and putting it at the beginning.");
        
        selectionSortHBox1.getChildren().add(selectionSortLabel);
        
        TextField sfield1 = new TextField();
        TextField sfield2 = new TextField();
        TextField sfield3 = new TextField();
        TextField sfield4 = new TextField();
        TextField sfield5 = new TextField();
        TextField sfield6 = new TextField();
        TextField sfield7 = new TextField();
        TextField sfield8 = new TextField();
        TextField sfield9 = new TextField();
        TextField sfield10 = new TextField();
                
        selectionSortHBox2.getChildren().addAll
        (sfield1, sfield2, sfield3, sfield4, sfield5, sfield6, sfield7, sfield8, sfield9, sfield10);
        
        Button randBtnSelectionSort = new Button("Generate Random Numbers");
        Button startSortBtnSelectionSort = new Button("Start Bubble Sort");
        Button resetBtnSelectionSort = new Button("Reset Numbers");
        
        selectionSortHBox3.getChildren().addAll(randBtnSelectionSort, startSortBtnSelectionSort, resetBtnSelectionSort);
        
        selectionSortVBox.getChildren().addAll(selectionSortHBox1, selectionSortHBox2, selectionSortHBox3);

        tabSelectionSort.setContent(selectionSortVBox); // set content line
        
        tabPane.getTabs().add(tabSelectionSort);
        
        // INSERTION SORT TAB --------------------------------------------------
        
        
        
        
        
        
        
        
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
