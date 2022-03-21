/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabtest;

/**
 *
 * @author anika
 */
public class SortingAlgorithms {
    
    public static void quickSort(int[] a, int first, int last) {
        // Only do quickSort for more than three array elements
        if (last - first > 3) {
            // What's the middle element
            int mid = first + (last - first) / 2;
            // Sort the first, middle, and last elements
            if (a[first] > a[mid]) {
                swapElements(a, first, mid);
            }
            if (a[mid] > a[last - 1]) {
                swapElements(a, mid, last - 1);
            }
            if (a[first] > a[mid]) {
                swapElements(a, first, mid);
            }
            // Move the pivot to the end
            swapElements(a, mid, last - 1);
            int pivotValue = a[last - 1];

            // Start from both sides and work inwards
            int indexFromLeft = first + 1;
            int indexFromRight = last - 2;
            boolean done = false; // this becomes true once all the elements
            // are positioned relative to the pivot
            while (!done) {
                // Move from the left until we find an element greater than the pivot
                while (a[indexFromLeft] < pivotValue) {
                    indexFromLeft++;
                }
                // Now move from the right until we find an element less than the pivot
                while (a[indexFromRight] > pivotValue) {
                    indexFromRight--;
                }
                // Provided that the left and right pointers have not crossed,
                // swap those elements
                if (indexFromLeft < indexFromRight) {
                    swapElements(a, indexFromLeft, indexFromRight);
                    indexFromLeft++;
                    indexFromRight--;
                } else {
                    done = true;
                }
            }
            // Once the pointers cross, move the pivot into the correct location
            swapElements(a, last - 1, indexFromLeft);
            // Let's use quickSort to sort each subarray on either side of the pivot
            quickSort(a, first, indexFromLeft);
            quickSort(a, indexFromLeft + 1, last);

        } else {
            insertionSort(a, first, last);
        }
    }

    // Selection sort
    // Find the smallest element in the unsorted part of the array
    // Swap it with the first element in the unsorted part of the array
    public static int[] selectionSort(int[] a, int first, int last) {
        // Sort a between indices first and last, inclusive
        // Start at the first index
                for (int i = first; i < last; i++) {
            // Find the smallest value in the unsorted part of the array
            // Initialize with the first element in the unsorted part of the array
            int small = a[i];
            int iSmall = i;
            // Now look for the smallest element
            for (int j = i + 1; j < last; j++) {
                if (a[j] < small) {
                    small = a[j];
                    iSmall = j;
                }
            }
            // We now know the smallest value in the unsorted array
            if (i != iSmall) { // if the smallest value isn't the first one, swap
                swapElements(a, i, iSmall);
            }
            
            return a;
        }

        
        return a;
    }

    public static void insertionSort(int[] a, int first, int last) {
        // Start at index first + 1
        for (int i = first + 1; i < last; i++) {
            // store the value that we'll insert
            int next = a[i];
            // Start searching backwards for where we're going to insert next
            int iFill = i - 1;
            while (iFill >= 0 && next < a[iFill]) {
                // As long as this is true, move the iFill element up one to make space
                a[iFill + 1] = a[iFill];
                iFill--;
            }
            // when we're done, we know where our element belongs
            a[iFill + 1] = next;
        }
    }

    // Swap two elements
    public static void swapElements(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static boolean isSorted(int[] a, int first, int last) {

        for (int i = first; i < last - 2; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }   
}
