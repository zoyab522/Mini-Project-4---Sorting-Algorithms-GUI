package com.mycompany.sortingalgorithmsgui;

import static com.mycompany.sortingalgorithmsgui.SortingAlgorithms.*;
import static com.mycompany.sortingalgorithmsgui.QuickSort.*;
import static com.mycompany.sortingalgorithmsgui.MergeSort.*;
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
import javafx.event.ActionEvent;

/**
 * JavaFX App Anika Suman Zoya Bawangaonwala
 */
public class App extends Application {

    // initializing first and last to be used below
    int first = 0;
    int last = 10;

    int[] numsM = new int[10]; // Creating a text field for every tab 

    // these text fields are numsM for Merge Sort
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

    int[] numsS = new int[10];

    // These text fields are numsS for Selection Sort
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

    int[] numsI = new int[10];

    // These text fields are numsI for Insertion Sort
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

    int[] numsQ = new int[10];

    // These text fields are numsQ for Quick Sort
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

    @Override
    public void start(Stage stage) {

        stage.setTitle("SORTING ALGORITHMS"); // Give the window a name

        TabPane tabPane = new TabPane(); // create a TabPane so we can add tabs
        Random rand = new Random(); // for generating random numbers

        tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        // set the tabs so that they cannot be closed (even accidentally)

        // SORTING INTRO TAB ---------------------------------------------------
        // Name the tab 'Sorting Intro'
        Tab tabSortingIntro = new Tab("Sorting Intro");

        // Create another tab called 'Insertion Sort' and also 'Quick Sort'
        Tab tabInsertionSort = new Tab("Insertion Sort");
        Tab tabQuickSort = new Tab("Quick Sort");

        // Each tab is made up of HBox(es) in a VBox
        // Create an HBox, position it in the center
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);

        // Adds background image to Sorting Intro
        // Have a nice intro image when the GUI is opened 
        Image image = null;

        // Use a try-catch loop to get the image to work
        try {
            image = new Image(new FileInputStream("src/main/mp.png"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        ImageView imageViewTJG = new ImageView(image);
        hbox.getChildren().add(imageViewTJG); // getChildren line to display img
        imageViewTJG.setPreserveRatio(true); // so the img isn't distorted
        imageViewTJG.setFitHeight(800); // 800 pixels high within the window

        tabSortingIntro.setContent(hbox); // set content to display HBox

        tabPane.getTabs().add(tabSortingIntro); // add the tab to the pane

        // MERGE SORT TAB ------------------------------------------------------
        Tab tabMergeSort = new Tab("Merge Sort"); // Name the tab 'Merge Sort'

        VBox mergeSortVBox = new VBox(); // All HBox(es) go into one VBox

        // Set the space between every HBox
        mergeSortVBox.setSpacing(80);

        // There are 4 HBox(es) in a VBox
        // They are named and positioned accordingly
        HBox mergeSortHBox1 = new HBox(); // 1st HBox
        mergeSortHBox1.setAlignment(Pos.TOP_CENTER);

        HBox mergeSortHBox2 = new HBox(); // 2nd HBox

        HBox mergeSortHBox3 = new HBox(); // 3rd HBox
        mergeSortHBox3.setAlignment(Pos.CENTER);

        HBox mergeSortHBox4 = new HBox(); // 4th HBox - this is for the output
        // This HBox contains the steps and the final sorted input

        mergeSortHBox4.setAlignment(Pos.CENTER);
        Label mergeLabel = new Label(""); // This is the specific label that will contain the output within the HBox

        // This label is in the first HBox, at the top containing the description and what the program (GUI) does
        Label mergeSortLabel = new Label("\n\nMerge Sort Description: "
                + "Merge Sort is a type of divide and conquer sorting method. "
                + "\nThe array is divided into two halves, and further sub-divided until"
                + "division can no longer take place. \nEach divided sub-array is then "
                + "sorted and subsequently merged with other sub-divisions. "
                + "\nThe sorted merge continues until all divisions of the array have "
                + "been merged, giving us a sorted array.");
        // Source (for description): https://www.educative.io/edpresso/how-to-implement-a-merge-sort-in-java

        mergeSortHBox1.getChildren().add(mergeSortLabel); // add the label to the HBox

        mergeSortHBox2.getChildren().addAll // add all the text fields to the second HBox below the label
                (mfield1, mfield2, mfield3, mfield4, mfield5, mfield6, mfield7, mfield8, mfield9, mfield10);

        // Create the 3 interface buttons
        Button randBtnMerge = new Button("Generate Random Numbers");
        Button startSortBtnMerge = new Button("Start Merge Sort");
        Button resetBtnMerge = new Button("Reset Numbers");

        // Add the buttons to the third HBox, below the labels
        mergeSortHBox3.getChildren().addAll(randBtnMerge, startSortBtnMerge, resetBtnMerge);

        // Action Event generating random numbers into the fields
        randBtnMerge.setOnAction(event -> {
            for (int i = 0; i < numsM.length; i++) {
                numsM[i] = rand.nextInt(100);
                System.out.println(numsM[i]);
            }

            first = 0; // first has to be set equal to zero every time 

            // output is generated in the fields
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

        MergeSort merge = new MergeSort();

        // sort the input(s) and print the steps: 
        startSortBtnMerge.setOnAction(event -> {
            if (!(SortingAlgorithms.isSorted(numsM, 0, numsM.length))) {

                //mergeSort(numsM, first, last - 1);
                int mergeArray[] = new int[10];

                // every individual element is printed
                // 1st element
                String m1 = mfield1.getText();
                int num1 = Integer.parseInt(m1);
                mergeArray[0] = num1;

                // 2nd element
                String m2 = mfield2.getText();
                int num2 = Integer.parseInt(m2);
                mergeArray[1] = num2;

                // 3rd element
                String m3 = mfield3.getText();
                int num3 = Integer.parseInt(m3);
                mergeArray[2] = num3;

                // 4th element
                String m4 = mfield4.getText();
                int num4 = Integer.parseInt(m4);
                mergeArray[3] = num4;

                // 5th element
                String m5 = mfield5.getText();
                int num5 = Integer.parseInt(m5);
                mergeArray[4] = num5;

                // 6th element
                String m6 = mfield6.getText();
                int num6 = Integer.parseInt(m6);
                mergeArray[5] = num6;

                // 7th element
                String m7 = mfield7.getText();
                int num7 = Integer.parseInt(m7);
                mergeArray[6] = num7;

                // 8th element
                String m8 = mfield8.getText();
                int num8 = Integer.parseInt(m8);
                mergeArray[7] = num8;

                // 9th element
                String m9 = mfield9.getText();
                int num9 = Integer.parseInt(m9);
                mergeArray[8] = num9;

                // 10th element
                String m10 = mfield10.getText();
                int num10 = Integer.parseInt(m10);
                mergeArray[9] = num10;

                String mergeSteps = ""; // blank string for now that will contain all the steps of the sorting

                // getting the steps
                mergeSteps = merge.mergeSort(mergeArray, 0, mergeArray.length - 1);

                // getting the FINAL SORTED ARRAY
                String mergeSortFinal = "";
                for (int i = 0; i < 10; i++) {
                    mergeSortFinal = mergeSortFinal + Integer.toString(mergeArray[i]) + " ";
                }

                // printing the steps and sorted array
                mergeLabel.setText("\t\tSteps: \n\n" + mergeSteps + "\n\t Sorted array: \n\n" + mergeSortFinal);

                // printing the final sorted array in the text fields (so that they're updated)
                mfield1.setText(Integer.toString(mergeArray[0]));
                mfield2.setText(Integer.toString(mergeArray[1]));
                mfield3.setText(Integer.toString(mergeArray[2]));
                mfield4.setText(Integer.toString(mergeArray[3]));
                mfield5.setText(Integer.toString(mergeArray[4]));
                mfield6.setText(Integer.toString(mergeArray[5]));
                mfield7.setText(Integer.toString(mergeArray[6]));
                mfield8.setText(Integer.toString(mergeArray[7]));
                mfield9.setText(Integer.toString(mergeArray[8]));
                mfield10.setText(Integer.toString(mergeArray[9]));

            }
        });

        // clear the text fields after completion using the reset button (action event)
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

        // Add a getChildren line and get the final mergeLabel in the 4th and final HBox
        mergeSortHBox4.getChildren().addAll(mergeLabel);
        // Put everything in the VBox
        mergeSortVBox.getChildren().addAll(mergeSortHBox1, mergeSortHBox2, mergeSortHBox3, mergeSortHBox4);
        // This line ensures that the VBox is fully displayed
        tabMergeSort.setContent(mergeSortVBox); // set content line
        // Add the mergeSort tab to the Pane
        tabPane.getTabs().add(tabMergeSort);

        // THIS SPECIFIC PROCESS IS REPEATED FOR QUICK SORT (THE 4TH AND FINAL TAB)
        // There are fewer comments on the quickSort tab because most of the comments are really regarding the format
        // Both this tab and the quickSort tab print the steps in the same way
        // Selection and Insertion Sort work a bit differently
        // SELECTION SORT TAB --------------------------------------------------
        // Name the tab, create the HBox(es) again (there are only 3 for this tab) and put them into a VBox
        // Position everything accordingly
        Tab tabSelectionSort = new Tab("Selection Sort");

        VBox selectionSortVBox = new VBox();
        selectionSortVBox.setSpacing(80);

        HBox selectionSortHBox1 = new HBox();
        selectionSortHBox1.setAlignment(Pos.TOP_CENTER);

        HBox selectionSortHBox2 = new HBox();

        HBox selectionSortHBox3 = new HBox();
        selectionSortHBox3.setAlignment(Pos.CENTER);

        // Label describing what selectionSort does and also contains the instructions for how this particular example will work
        Label selectionSortLabel = new Label("\n\nSelection Sort Description: "
                + "Selection Sort iterates through the array, finds the smallest number, and swaps it "
                + "with the first element if it \nis smaller than the first element. "
                + "Next, it goes on to the second element and so on until all elements are sorted."
                + "\n\n\nInstructions: Yellow highlights indicate the steps of the sorting process."
                + "\nWhen all the blocks turn green, sorting is complete. Click on the 'Start Selection Sort'"
                + "\nbutton repeatedly until the blocks are all green.");

        // Source for Selection Sort description: https://www.edureka.co/blog/selection-sort-in-c/
        // Using getChildren lines to add and display labels and buttons below
        selectionSortHBox1.getChildren().add(selectionSortLabel);

        selectionSortHBox2.getChildren().addAll(sfield1, sfield2, sfield3, sfield4, sfield5, sfield6, sfield7, sfield8, sfield9, sfield10);

        // Adding buttons
        Button randBtnSelectionSort = new Button("Generate Random Numbers");
        Button startSortBtnSelectionSort = new Button("Start Selection Sort: \nRepeatedly Click until boxes are GREEN");
        Button resetBtnSelectionSort = new Button("Reset Numbers");

        randBtnSelectionSort.setOnAction(event -> {
            for (int i = 0; i < numsS.length; i++) {
                numsS[i] = rand.nextInt(100);
                System.out.println(numsS[i]);
            }

            first = 0;

            // Set all the fields to white
            sfield1.setStyle("-fx-background-color: white;");
            sfield2.setStyle("-fx-background-color: white;");
            sfield3.setStyle("-fx-background-color: white;");
            sfield4.setStyle("-fx-background-color: white;");
            sfield5.setStyle("-fx-background-color: white;");
            sfield6.setStyle("-fx-background-color: white;");
            sfield7.setStyle("-fx-background-color: white;");
            sfield8.setStyle("-fx-background-color: white;");
            sfield9.setStyle("-fx-background-color: white;");
            sfield10.setStyle("-fx-background-color: white;");

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

        startSortBtnSelectionSort.setOnAction(this::selectionButton);

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

            // When cleared, all the fields are white again (not green, so it is not misleading)
            sfield1.setStyle("-fx-background-color: white;");
            sfield2.setStyle("-fx-background-color: white;");
            sfield3.setStyle("-fx-background-color: white;");
            sfield4.setStyle("-fx-background-color: white;");
            sfield5.setStyle("-fx-background-color: white;");
            sfield6.setStyle("-fx-background-color: white;");
            sfield7.setStyle("-fx-background-color: white;");
            sfield8.setStyle("-fx-background-color: white;");
            sfield9.setStyle("-fx-background-color: white;");
            sfield10.setStyle("-fx-background-color: white;");

        });

        selectionSortHBox3.getChildren().addAll(randBtnSelectionSort, startSortBtnSelectionSort, resetBtnSelectionSort);
        selectionSortVBox.getChildren().addAll(selectionSortHBox1, selectionSortHBox2, selectionSortHBox3);
        tabSelectionSort.setContent(selectionSortVBox); // set content line
        tabPane.getTabs().add(tabSelectionSort);

        // INSERTION SORT TAB --------------------------------------------------
        // Insertion is set up the way selection sort is in terms of how it displays steps. 
        // The tab is also formatted similarly.
        // Creating the VBox and the HBox(es) within it that are positioned accordingly
        VBox insertionSortVBox = new VBox();
        insertionSortVBox.setSpacing(80);

        HBox insertionSortHBox1 = new HBox();
        insertionSortHBox1.setAlignment(Pos.TOP_CENTER);

        HBox insertionSortHBox2 = new HBox();

        HBox insertionSortHBox3 = new HBox();
        insertionSortHBox3.setAlignment(Pos.CENTER);

        // Descriptive Label
        Label insertionSortLabel = new Label("\n\nInsertion Sort Description: "
                + "Insertion Sort splits an array into a sorted and an unsorted part. Values "
                + "from \nthe unsorted part are picked and placed at the correct position in the sorted part.\n\n"
                + "\nInstructions: Yellow highlights indicate the steps of the sorting process."
                + "\nWhen all the blocks turn green, sorting is complete. Click on the 'Start Insertion Sort'"
                + "\nbutton repeatedly until the blocks are all green.");
        // Source for Insertion Sort Description: https://www.geeksforgeeks.org/insertion-sort/

        insertionSortHBox1.getChildren().add(insertionSortLabel);

        insertionSortHBox2.getChildren().addAll(ifield1, ifield2, ifield3, ifield4, ifield5, ifield6, ifield7, ifield8, ifield9, ifield10);

        Button randBtnInsertionSort = new Button("Generate Random Numbers");
        Button startSortBtnInsertionSort = new Button("Start Insertion Sort: \nRepeatedly Click until boxes are GREEN");
        Button resetBtnInsertionSort = new Button("Reset Numbers");

        randBtnInsertionSort.setOnAction(event -> {
            for (int i = 0; i < numsI.length; i++) {
                numsI[i] = rand.nextInt(100);
                System.out.println(numsI[i]);
            }
            first = 0;

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

            ifield1.setStyle("-fx-background-color: white;");
            ifield2.setStyle("-fx-background-color: white;");
            ifield3.setStyle("-fx-background-color: white;");
            ifield4.setStyle("-fx-background-color: white;");
            ifield5.setStyle("-fx-background-color: white;");
            ifield6.setStyle("-fx-background-color: white;");
            ifield7.setStyle("-fx-background-color: white;");
            ifield8.setStyle("-fx-background-color: white;");
            ifield9.setStyle("-fx-background-color: white;");
            ifield10.setStyle("-fx-background-color: white;");

        });

        startSortBtnInsertionSort.setOnAction(this::insertionButton);

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

            ifield1.setStyle("-fx-background-color: white;");
            ifield2.setStyle("-fx-background-color: white;");
            ifield3.setStyle("-fx-background-color: white;");
            ifield4.setStyle("-fx-background-color: white;");
            ifield5.setStyle("-fx-background-color: white;");
            ifield6.setStyle("-fx-background-color: white;");
            ifield7.setStyle("-fx-background-color: white;");
            ifield8.setStyle("-fx-background-color: white;");
            ifield9.setStyle("-fx-background-color: white;");
            ifield10.setStyle("-fx-background-color: white;");

        });

        insertionSortHBox3.getChildren().addAll(randBtnInsertionSort, startSortBtnInsertionSort, resetBtnInsertionSort);
        insertionSortVBox.getChildren().addAll(insertionSortHBox1, insertionSortHBox2, insertionSortHBox3);
        tabInsertionSort.setContent(insertionSortVBox); // set content line
        tabPane.getTabs().add(tabInsertionSort);

        // QUICK SORT TAB ------------------------------------------------------
        // Set up similarly to Merge Sort
        // Creating HBox(es) and the VBox they will go in, all positioned accordingly
        // Like Merge Sort, this one has 4 HBox(es)
        VBox quickSortVBox = new VBox();
        quickSortVBox.setSpacing(50);

        HBox quickSortHBox1 = new HBox();
        quickSortHBox1.setAlignment(Pos.TOP_CENTER);

        HBox quickSortHBox2 = new HBox();

        HBox quickSortHBox3 = new HBox();
        quickSortHBox3.setAlignment(Pos.CENTER);

        HBox quickSortHBox4 = new HBox();
        quickSortHBox4.setAlignment(Pos.CENTER);
        Label quickLabel = new Label("");

        Label quickSortLabel = new Label("\n\nQuick Sort Description: "
                + "Quick Sort picks an element as a 'pivot' and partitions the given array "
                + "around the picked pivot.\n\n");
        // Source for description: https://www.geeksforgeeks.org/quick-sort/

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

        quickSortHBox2.getChildren().addAll(qfield1, qfield2, qfield3, qfield4, qfield5, qfield6, qfield7, qfield8, qfield9, qfield10);

        Button randBtnQuickSort = new Button("Generate Random Numbers");
        Button startSortBtnQuickSort = new Button("Start Quick Sort");
        Button resetBtnQuickSort = new Button("Reset Numbers");

        randBtnQuickSort.setOnAction(event -> {
            for (int i = 0; i < numsQ.length; i++) {
                numsQ[i] = rand.nextInt(100);
                System.out.println(numsQ[i]);
            }

            first = 0;

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
        QuickSort quick = new QuickSort();

        startSortBtnQuickSort.setOnAction(event -> {
            if (!(SortingAlgorithms.isSorted(numsQ, 0, numsQ.length))) {

                int quickArray[] = new int[10];

                String q1 = qfield1.getText();
                int num1 = Integer.parseInt(q1);
                quickArray[0] = num1;

                String q2 = qfield2.getText();
                int num2 = Integer.parseInt(q2);
                quickArray[1] = num2;

                String q3 = qfield3.getText();
                int num3 = Integer.parseInt(q3);
                quickArray[2] = num3;

                String q4 = qfield4.getText();
                int num4 = Integer.parseInt(q4);
                quickArray[3] = num4;

                String q5 = qfield5.getText();
                int num5 = Integer.parseInt(q5);
                quickArray[4] = num5;

                String q6 = qfield6.getText();
                int num6 = Integer.parseInt(q6);
                quickArray[5] = num6;

                String q7 = qfield7.getText();
                int num7 = Integer.parseInt(q7);
                quickArray[6] = num7;

                String q8 = qfield8.getText();
                int num8 = Integer.parseInt(q8);
                quickArray[7] = num8;

                String q9 = qfield9.getText();
                int num9 = Integer.parseInt(q9);
                quickArray[8] = num9;

                String q10 = qfield10.getText();
                int num10 = Integer.parseInt(q10);
                quickArray[9] = num10;

                String quickSteps = "";
                quickSteps = quick.main(quickArray);

                String quickSortFinal = "";
                for (int i = 0; i < 10; i++) {
                    quickSortFinal = quickSortFinal + Integer.toString(quickArray[i]) + " ";
                }

                quickLabel.setText("\t\tSteps: \n\n" + quickSteps + "\n\t  Sorted array: \n\n" + quickSortFinal);

                qfield1.setText(Integer.toString(quickArray[0]));
                qfield2.setText(Integer.toString(quickArray[1]));
                qfield3.setText(Integer.toString(quickArray[2]));
                qfield4.setText(Integer.toString(quickArray[3]));
                qfield5.setText(Integer.toString(quickArray[4]));
                qfield6.setText(Integer.toString(quickArray[5]));
                qfield7.setText(Integer.toString(quickArray[6]));
                qfield8.setText(Integer.toString(quickArray[7]));
                qfield9.setText(Integer.toString(quickArray[8]));
                qfield10.setText(Integer.toString(quickArray[9]));

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
        quickSortHBox4.getChildren().addAll(quickLabel);
        quickSortVBox.getChildren().addAll(quickSortHBox1, quickSortHBox2, quickSortHBox3, quickSortHBox4);
        tabQuickSort.setContent(quickSortVBox); // set content line
        tabPane.getTabs().add(tabQuickSort);

        // SCENE SET- UP -------------------------------------------------------
        // Creating a scene with tabs
        Scene scene = new Scene(tabPane, 1300, 800);
        scene.getStylesheets().add("application.css"); // Adding application.css (for Zoya, whose Mac will display gibberish without it)
        stage.setScene(scene);
        stage.show();
    }

    // SELECTION SORT PROCESS ----------------------------------------------
    // This is what actually shows the steps/process as it is sorted
    public void selectionButton(ActionEvent evt) {

        if (!(SortingAlgorithms.isSorted(numsS, 0, numsS.length))) {
            // if it is not sorted...

            if (first < last) {
                int i = first;
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

                    // blocks are yellow while stepping through the process
                    if (i == 0 || iSmall == 0) {
                        sfield1.setStyle("-fx-background-color: #f1e740;");
                    }
                    if (i == 1 || iSmall == 1) {
                        sfield2.setStyle("-fx-background-color: #f1e740;");
                    }
                    if (i == 2 || iSmall == 2) {
                        sfield3.setStyle("-fx-background-color: #f1e740;");
                    }
                    if (i == 3 || iSmall == 3) {
                        sfield4.setStyle("-fx-background-color: #f1e740;");
                    }
                    if (i == 4 || iSmall == 4) {
                        sfield5.setStyle("-fx-background-color: #f1e740;");
                    }
                    if (i == 5 || iSmall == 5) {
                        sfield6.setStyle("-fx-background-color: #f1e740;");
                    }
                    if (i == 6 || iSmall == 6) {
                        sfield7.setStyle("-fx-background-color: #f1e740;");
                    }
                    if (i == 7 || iSmall == 7) {
                        sfield8.setStyle("-fx-background-color: #f1e740;");
                    }
                    if (i == 8 || iSmall == 8) {
                        sfield9.setStyle("-fx-background-color: #f1e740;");
                    }
                    if (i == 9 || iSmall == 9) {
                        sfield10.setStyle("-fx-background-color: #f1e740;");
                    }
                }
            }

            first++;

        } else {
            // All blocks are green when process is completed
            sfield1.setStyle("-fx-background-color: #39FF14;");
            sfield2.setStyle("-fx-background-color: #39FF14;");
            sfield3.setStyle("-fx-background-color: #39FF14;");
            sfield4.setStyle("-fx-background-color: #39FF14;");
            sfield5.setStyle("-fx-background-color: #39FF14;");
            sfield6.setStyle("-fx-background-color: #39FF14;");
            sfield7.setStyle("-fx-background-color: #39FF14;");
            sfield8.setStyle("-fx-background-color: #39FF14;");
            sfield9.setStyle("-fx-background-color: #39FF14;");
            sfield10.setStyle("-fx-background-color: #39FF14;");
        }
    }

    // INSERTION BUTTON PROCESS --------------------------------------------
    // This is what actually shows the steps/process as it is sorted
    public void insertionButton(ActionEvent evt) {
        if (!(SortingAlgorithms.isSorted(numsI, 0, numsI.length))) {

            if (first < last) {
                int i = first;
                // store the value that we'll insert
                int next = numsI[i];
                // Start searching backwards numsIfor where we're going to insert next
                int iFill = i - 1;
                while ((iFill >= 0) && (next <= numsI[iFill])) {
                    // As long as this is true, move the iFill element up one to make space
                    numsI[iFill + 1] = numsI[iFill];
                    iFill--;
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
                // when we're done, we know where our element belongs
                numsI[iFill + 1] = next;

                if (i == 0 || iFill == 0) // as it steps through the sorting process, blocks turn yellow 
                {
                    ifield1.setStyle("-fx-background-color: #f1e740;");
                }
                if (i == 1 || iFill == 1) {
                    ifield2.setStyle("-fx-background-color: #f1e740;");
                }
                if (i == 2 || iFill == 2) {
                    ifield3.setStyle("-fx-background-color: #f1e740;");
                }
                if (i == 3 || iFill == 3) {
                    ifield4.setStyle("-fx-background-color: #f1e740;");
                }
                if (i == 4 || iFill == 4) {
                    ifield5.setStyle("-fx-background-color: #f1e740;");
                }
                if (i == 5 || iFill == 5) {
                    ifield6.setStyle("-fx-background-color: #f1e740;");
                }
                if (i == 6 || iFill == 6) {
                    ifield7.setStyle("-fx-background-color: #f1e740;");
                }
                if (i == 7 || iFill == 7) {
                    ifield8.setStyle("-fx-background-color: #f1e740;");
                }
                if (i == 8 || iFill == 8) {
                    ifield9.setStyle("-fx-background-color: #f1e740;");
                }
                if (i == 9 || iFill == 9) {
                    ifield10.setStyle("-fx-background-color: #f1e740;");
                }
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

            first++;

        } else {

            // when completed, all blocks turn green
            ifield1.setStyle("-fx-background-color: #39FF14;");
            ifield2.setStyle("-fx-background-color: #39FF14;");
            ifield3.setStyle("-fx-background-color: #39FF14;");
            ifield4.setStyle("-fx-background-color: #39FF14;");
            ifield5.setStyle("-fx-background-color: #39FF14;");
            ifield6.setStyle("-fx-background-color: #39FF14;");
            ifield7.setStyle("-fx-background-color: #39FF14;");
            ifield8.setStyle("-fx-background-color: #39FF14;");
            ifield9.setStyle("-fx-background-color: #39FF14;");
            ifield10.setStyle("-fx-background-color: #39FF14;");
        }
    }

    // LAUNCH THE SCENE --------------------------------------------------------
    public static void main(String[] args) {
        launch();
    }
}
