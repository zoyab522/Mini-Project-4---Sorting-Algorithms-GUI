package com.mycompany.sortingalgorithmsgui;

import static com.mycompany.tabtest.SortingAlgorithms.*;
import static com.mycompany.tabtest.MergeSort.*;
import java.util.Random;
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
import java.io.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("SORTING ALGORITHMS");

        TabPane tabPane = new TabPane();
        Random rand = new Random();
        
        tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        
        // SORTING INTRO TAB ---------------------------------------------------
        Tab tabSortingIntro = new Tab("Sorting Intro");
        
        Tab tabInsertionSort = new Tab("Insertion Sort");
        Tab tabQuickSort = new Tab("Quick Sort");

        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        
        //Adds background image to Sorting Intro
        Image image = null;
        
        try {
            image = new Image(new FileInputStream("src/main/images/mp.png"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        ImageView imageViewTJG = new ImageView(image);
        hbox.getChildren().add(imageViewTJG);
        imageViewTJG.setPreserveRatio(true);
        imageViewTJG.setFitHeight(800);
        
        /*
        Label SortingIntroLabel = new Label("Sorting Efficiency" + "\n" + "\n" + 
                "The two main criterias to judge which algorithm is better than the other have been:" 
                + "\n" + "\n" 
                + "    1 - Time taken to sort the given data." + ""
                + "\n" + "    2 - Memory Space required to do so.");
        
        hbox.getChildren().add(SortingIntroLabel);*/
        
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
        Button startSortBtnMerge = new Button("Start Merge Sort");
        Button resetBtnMerge = new Button("Reset Numbers");
        
        mergeSortHBox3.getChildren().addAll(randBtnMerge, startSortBtnMerge, resetBtnMerge);
        
        mergeSortVBox.getChildren().addAll(mergeSortHBox1, mergeSortHBox2, mergeSortHBox3);

        int[] numsM = new int[10];
        int first = 0;
        int last = numsM.length;
        
        randBtnMerge.setOnAction(event -> {
            for (int i = 0; i < numsM.length; i++) {
                numsM[i] = rand.nextInt(100); 
                System.out.println(numsM[i]);
            }
                
            mfield1.setText(Integer.toString(numsM[0]));   
            mfield2.setText(Integer.toString(numsM[1]));
            mfield3.setText(Integer.toString(numsM[2]));
            mfield4.setText(Integer.toString(numsM[3]));
            mfield5.setText(Integer.toString(numsM[4]));
            mfield6.setText(Integer.toString(numsM[5]));
            mfield7.setText(Integer.toString(numsM[6]));
            mfield8.setText(Integer.toString(numsM[7]));
            mfield9.setText(Integer.toString(numsM[8]));
            mfield10.setText(Integer.toString(numsM[9]));
                
        });
        
        startSortBtnMerge.setOnAction(event -> {
            if (!(SortingAlgorithms.isSorted(numsM, 0, numsM.length))) {
                
            mergeSort(numsM,first,last);
            
            mfield1.setText(Integer.toString(numsM[0]));   
            mfield2.setText(Integer.toString(numsM[1]));
            mfield3.setText(Integer.toString(numsM[2]));
            mfield4.setText(Integer.toString(numsM[3]));
            mfield5.setText(Integer.toString(numsM[4]));
            mfield6.setText(Integer.toString(numsM[5]));
            mfield7.setText(Integer.toString(numsM[6]));
            mfield8.setText(Integer.toString(numsM[7]));
            mfield9.setText(Integer.toString(numsM[8]));
            mfield10.setText(Integer.toString(numsM[9]));
                
            }        
        });
        
        resetBtnMerge.setOnAction(event -> {
            mfield1.clear();
            mfield2.clear();
            mfield3.clear();
            mfield4.clear();
            mfield5.clear();
            mfield6.clear();
            mfield7.clear();
            mfield8.clear();
            mfield9.clear();
            mfield10.clear();
        });

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
        Button startSortBtnSelectionSort = new Button("Start Selection Sort");
        Button resetBtnSelectionSort = new Button("Reset Numbers");
       
        int[] numsS = new int[10];
            
        randBtnSelectionSort.setOnAction(event -> {
            for (int i = 0; i < numsS.length; i++) {
                numsS[i] = rand.nextInt(100); 
                System.out.println(numsS[i]);
            }
                
            sfield1.setText(Integer.toString(numsS[0]));   
            sfield2.setText(Integer.toString(numsS[1]));
            sfield3.setText(Integer.toString(numsS[2]));
            sfield4.setText(Integer.toString(numsS[3]));
            sfield5.setText(Integer.toString(numsS[4]));
            sfield6.setText(Integer.toString(numsS[5]));
            sfield7.setText(Integer.toString(numsS[6]));
            sfield8.setText(Integer.toString(numsS[7]));
            sfield9.setText(Integer.toString(numsS[8]));
            sfield10.setText(Integer.toString(numsS[9]));
                
        });
        
        startSortBtnSelectionSort.setOnAction(event -> {
            if (!(SortingAlgorithms.isSorted(numsS, 0, numsS.length))) {
                
            for (int i = first; i < last; i++) {
                // Find the smallest value in the unsorted part of the array
                // Initialize with the first element in the unsorted part of the array
                int small = numsS[i];
                int iSmall = i;
                // Now look for the smallest element
                for (int j = i + 1; j < last; j++) {
                    if (numsS[j] < small) {
                        small = numsS[j];
                        iSmall = j;
                    }
                }
                // We now know the smallest value in the unsorted array
                if (i != iSmall) { // if the smallest value isn't the first one, swap
                    swapElements(numsS, i, iSmall);
         
                }
            
            }
            
            sfield1.setText(Integer.toString(numsS[0]));   
            sfield2.setText(Integer.toString(numsS[1]));
            sfield3.setText(Integer.toString(numsS[2]));
            sfield4.setText(Integer.toString(numsS[3]));
            sfield5.setText(Integer.toString(numsS[4]));
            sfield6.setText(Integer.toString(numsS[5]));
            sfield7.setText(Integer.toString(numsS[6]));
            sfield8.setText(Integer.toString(numsS[7]));
            sfield9.setText(Integer.toString(numsS[8]));
            sfield10.setText(Integer.toString(numsS[9]));
                
            }        
        });
        
        resetBtnSelectionSort.setOnAction(event -> {
            sfield1.clear();
            sfield2.clear();
            sfield3.clear();
            sfield4.clear();
            sfield5.clear();
            sfield6.clear();
            sfield7.clear();
            sfield8.clear();
            sfield9.clear();
            sfield10.clear();
        });
        
        selectionSortHBox3.getChildren().addAll(randBtnSelectionSort, startSortBtnSelectionSort, resetBtnSelectionSort);
        
        selectionSortVBox.getChildren().addAll(selectionSortHBox1, selectionSortHBox2, selectionSortHBox3);

        tabSelectionSort.setContent(selectionSortVBox); // set content line
        
        tabPane.getTabs().add(tabSelectionSort);
        
        // INSERTION SORT TAB --------------------------------------------------
        
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
        Button startSortBtnInsertionSort = new Button("Start Insertion Sort");
        Button resetBtnInsertionSort = new Button("Reset Numbers");
        
        int[] numsI = new int[10];
        
        randBtnInsertionSort.setOnAction(event -> {
            for (int i = 0; i < numsI.length; i++) {
                numsI[i] = rand.nextInt(100); 
                System.out.println(numsI[i]);
            }
                
            ifield1.setText(Integer.toString(numsI[0]));   
            ifield2.setText(Integer.toString(numsI[1]));
            ifield3.setText(Integer.toString(numsI[2]));
            ifield4.setText(Integer.toString(numsI[3]));
            ifield5.setText(Integer.toString(numsI[4]));
            ifield6.setText(Integer.toString(numsI[5]));
            ifield7.setText(Integer.toString(numsI[6]));
            ifield8.setText(Integer.toString(numsI[7]));
            ifield9.setText(Integer.toString(numsI[8]));
            ifield10.setText(Integer.toString(numsI[9]));
                
        });
        
        
        startSortBtnInsertionSort.setOnAction(event -> {
            if (!(SortingAlgorithms.isSorted(numsI, 0, numsI.length))) {
                
            for (int i = first + 1; i < last; i++) {
                // store the value that we'll insert
                int next = numsI[i];
                // Start searching backwards numsIfor where we're going to insert next
                int iFill = i - 1;
                while ((iFill >= 0) && (next < numsI[iFill]))
                {
                    // As long as this is true, move the iFill element up one to make space
                    numsI[iFill + 1] = numsI[iFill];
                    iFill--;
                }
                // when we're done, we know where our element belongs
                numsI[iFill + 1] = next;
            }
            
            ifield1.setText(Integer.toString(numsI[0]));   
            ifield2.setText(Integer.toString(numsI[1]));
            ifield3.setText(Integer.toString(numsI[2]));
            ifield4.setText(Integer.toString(numsI[3]));
            ifield5.setText(Integer.toString(numsI[4]));
            ifield6.setText(Integer.toString(numsI[5]));
            ifield7.setText(Integer.toString(numsI[6]));
            ifield8.setText(Integer.toString(numsI[7]));
            ifield9.setText(Integer.toString(numsI[8]));
            ifield10.setText(Integer.toString(numsI[9]));
                
            }        
        });
        
        resetBtnInsertionSort.setOnAction(event -> {
            ifield1.clear();
            ifield2.clear();
            ifield3.clear();
            ifield4.clear();
            ifield5.clear();
            ifield6.clear();
            ifield7.clear();
            ifield8.clear();
            ifield9.clear();
            ifield10.clear();
        });
        
        insertionSortHBox3.getChildren().addAll(randBtnInsertionSort, startSortBtnInsertionSort, resetBtnInsertionSort);
        
        insertionSortVBox.getChildren().addAll(insertionSortHBox1, insertionSortHBox2, insertionSortHBox3);

        tabInsertionSort.setContent(insertionSortVBox); // set content line
        
        tabPane.getTabs().add(tabInsertionSort);
        
        // QUICK SORT TAB ------------------------------------------------------

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
        Button startSortBtnQuickSort = new Button("Start Quick Sort");
        Button resetBtnQuickSort = new Button("Reset Numbers");
        
        int[] numsQ = new int[10];        
        
        randBtnQuickSort.setOnAction(event -> {
            for (int i = 0; i < numsQ.length; i++) {
                numsQ[i] = rand.nextInt(100); 
                System.out.println(numsQ[i]);
            }
                
            qfield1.setText(Integer.toString(numsQ[0]));   
            qfield2.setText(Integer.toString(numsQ[1]));
            qfield3.setText(Integer.toString(numsQ[2]));
            qfield4.setText(Integer.toString(numsQ[3]));
            qfield5.setText(Integer.toString(numsQ[4]));
            qfield6.setText(Integer.toString(numsQ[5]));
            qfield7.setText(Integer.toString(numsQ[6]));
            qfield8.setText(Integer.toString(numsQ[7]));
            qfield9.setText(Integer.toString(numsQ[8]));
            qfield10.setText(Integer.toString(numsQ[9]));
                
        });
        
        startSortBtnQuickSort.setOnAction(event -> {
            if (!(SortingAlgorithms.isSorted(numsQ, 0, numsQ.length))) {
                
            if (last - first > 3) {
                // What's the middle element
                int mid = first + (last - first) / 2;
                // Sort the first, middle, and last elements
                if (numsQ[first] > numsQ[mid]) {
                    swapElements(numsQ, first, mid);
                }
                if (numsQ[mid] > numsQ[last - 1]) {
                    swapElements(numsQ, mid, last - 1);
                }
                if (numsQ[first] > numsQ[mid]) {
                    swapElements(numsQ, first, mid);
                }
                // Move the pivot to the end
                swapElements(numsQ, mid, last - 1);
                int pivotValue = numsQ[last - 1];

                // Start from both sides and work inwards
                int indexFromLeft = first + 1;
                int indexFromRight = last - 2;
                boolean done = false; // this becomes true once all the elements
                // are positioned relative to the pivot
                while (!done) {
                    // Move from the left until we find an element greater than the pivot
                    while (numsQ[indexFromLeft] < pivotValue) {
                        indexFromLeft++;
                    }
                    // Now move from the right until we find an element less than the pivot
                    while (numsQ[indexFromRight] > pivotValue) {
                        indexFromRight--;
                    }
                    // Provided that the left and right pointers have not crossed,
                    // swap those elements
                    if (indexFromLeft < indexFromRight) {
                        swapElements(numsQ, indexFromLeft, indexFromRight);
                        indexFromLeft++;
                        indexFromRight--;
                    } else {
                        done = true;
                    }
                }
                // Once the pointers cross, move the pivot into the correct location
                swapElements(numsQ, last - 1, indexFromLeft);
                // Let's use quickSort to sort each subarray on either side of the pivot
                quickSort(numsQ, first, indexFromLeft);
                quickSort(numsQ, indexFromLeft + 1, last);

            } else { //do an insertion sort
                // Start at index first + 1
                for (int i = first + 1; i < last; i++) {
                    // store the value that we'll insert
                    int next = numsQ[i];
                    // Start searching backwards for where we're going to insert next
                    int iFill = i - 1;
                    while (iFill >= 0 && next < numsQ[iFill]) {
                        // As long as this is true, move the iFill element up one to make space
                        numsQ[iFill + 1] = numsQ[iFill];
                        iFill--;
                    }
                    // when we're done, we know where our element belongs
                    numsQ[iFill + 1] = next;
                }
            }
            
            qfield1.setText(Integer.toString(numsQ[0]));   
            qfield2.setText(Integer.toString(numsQ[1]));
            qfield3.setText(Integer.toString(numsQ[2]));
            qfield4.setText(Integer.toString(numsQ[3]));
            qfield5.setText(Integer.toString(numsQ[4]));
            qfield6.setText(Integer.toString(numsQ[5]));
            qfield7.setText(Integer.toString(numsQ[6]));
            qfield8.setText(Integer.toString(numsQ[7]));
            qfield9.setText(Integer.toString(numsQ[8]));
            qfield10.setText(Integer.toString(numsQ[9]));
                
            }        
        });
        
        resetBtnQuickSort.setOnAction(event -> {
            qfield1.clear();
            qfield2.clear();
            qfield3.clear();
            qfield4.clear();
            qfield5.clear();
            qfield6.clear();
            qfield7.clear();
            qfield8.clear();
            qfield9.clear();
            qfield10.clear();
        });
        
        quickSortHBox3.getChildren().addAll(randBtnQuickSort, startSortBtnQuickSort, resetBtnQuickSort);
        
        quickSortVBox.getChildren().addAll(quickSortHBox1, quickSortHBox2, quickSortHBox3);

        tabQuickSort.setContent(quickSortVBox); // set content line
        
        tabPane.getTabs().add(tabQuickSort);
        
        //Scene set-up----------------------------------------------------------

        Scene scene = new Scene(tabPane, 1300, 800);

        scene.getStylesheets().add("application.css");
        /*Image img = new Image("src/main/images/mainpage.png");
        BackgroundImage bImg = new BackgroundImage(img,
                                                   BackgroundRepeat.NO_REPEAT,
                                                   BackgroundRepeat.NO_REPEAT,
                                                   BackgroundPosition.DEFAULT,
                                                   BackgroundSize.DEFAULT);
        Background bGround = new Background(bImg);
        tabPane.setBackground(bGround);*/
        stage.setScene(scene);
        stage.show();
    }
    
    //Launches the scene
    public static void main(String[] args) {
        launch();
    }

}
