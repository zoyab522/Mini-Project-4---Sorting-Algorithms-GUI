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
        
        Tab tabInsertionSort = new Tab("Insertion Sort");
        
        VBox insertionSortVBox = new VBox();
        insertionSortVBox.setSpacing(80);
        
        HBox insertionSortHBox1 = new HBox();
        insertionSortHBox1.setAlignment(Pos.TOP_CENTER);
        
        HBox insertionSortHBox2 = new HBox();
        
        HBox insertionSortHBox3 = new HBox();
        insertionSortHBox3.setAlignment(Pos.CENTER);
        
        Label insertionSortLabel = new Label("\n\nInsertion Sort Description: "
                + "Insertion Sort splits an array into a sorted and an unsorted part. Values "
                + "from \nthe unsorted part are picked and placed at the correct position in the sorted part.\n\n");
        
        insertionSortHBox1.getChildren().add(insertionSortLabel);
        
        TextField ifield1 = new TextField();
        TextField ifield2 = new TextField();
        TextField ifield3 = new TextField();
        TextField ifield4 = new TextField();
        TextField ifield5 = new TextField();
        TextField ifield6 = new TextField();
        TextField ifield7 = new TextField();
        TextField ifield8 = new TextField();
        TextField ifield9 = new TextField();
        TextField ifield10 = new TextField();
                
        insertionSortHBox2.getChildren().addAll
        (ifield1, ifield2, ifield3, ifield4, ifield5, ifield6, ifield7, ifield8, ifield9, ifield10);
        
        Button randBtnInsertionSort = new Button("Generate Random Numbers");
        Button startSortBtnInsertionSort = new Button("Start Bubble Sort");
        Button resetBtnInsertionSort = new Button("Reset Numbers");
        
        insertionSortHBox3.getChildren().addAll(randBtnInsertionSort, startSortBtnInsertionSort, resetBtnInsertionSort);
        
        insertionSortVBox.getChildren().addAll(insertionSortHBox1, insertionSortHBox2, insertionSortHBox3);

        tabInsertionSort.setContent(insertionSortVBox); // set content line
        
        tabPane.getTabs().add(tabInsertionSort);
        
        // QUICK SORT TAB ------------------------------------------------------
        
        Tab tabQuickSort = new Tab("Quick Sort");
        
        VBox quickSortVBox = new VBox();
        quickSortVBox.setSpacing(80);
        
        HBox quickSortHBox1 = new HBox();
        quickSortHBox1.setAlignment(Pos.TOP_CENTER);
        
        HBox quickSortHBox2 = new HBox();
        
        HBox quickSortHBox3 = new HBox();
        quickSortHBox3.setAlignment(Pos.CENTER);
        
        Label quickSortLabel = new Label("\n\nQuick Sort Description: "
                + "Quick Sort picks an element as a 'pivot' and partitions the given array "
                + "around the picked pivot.\n\n");
        
        quickSortHBox1.getChildren().add(quickSortLabel);
        
        TextField qfield1 = new TextField();
        TextField qfield2 = new TextField();
        TextField qfield3 = new TextField();
        TextField qfield4 = new TextField();
        TextField qfield5 = new TextField();
        TextField qfield6 = new TextField();
        TextField qfield7 = new TextField();
        TextField qfield8 = new TextField();
        TextField qfield9 = new TextField();
        TextField qfield10 = new TextField();
                
        quickSortHBox2.getChildren().addAll
        (qfield1, qfield2, qfield3, qfield4, qfield5, qfield6, qfield7, qfield8, qfield9, qfield10);
        
        Button randBtnQuickSort = new Button("Generate Random Numbers");
        Button startSortBtnQuickSort = new Button("Start Bubble Sort");
        Button resetBtnQuickSort = new Button("Reset Numbers");
        
        quickSortHBox3.getChildren().addAll(randBtnQuickSort, startSortBtnQuickSort, resetBtnQuickSort);
        
        quickSortVBox.getChildren().addAll(quickSortHBox1, quickSortHBox2, quickSortHBox3);

        tabQuickSort.setContent(quickSortVBox); // set content line
        
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
