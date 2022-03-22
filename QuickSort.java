/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortingalgorithmsgui;

import java.util.*;

/**
 *
 * @author zoya
 */
public class QuickSort {

    public static String main(int[] array) {
        String empty = "";
        // Sorts using quickSort
        empty = quickSort(array, 0, array.length - 1);
        // Verify the final, sorted array
        System.out.println(Arrays.toString(array));
        return empty;
    }

    public static String quickSort(int[] arr, int low, int high) {
        String str = "";
        
            if (arr == null || arr.length == 0) {
        }
            if (low >= high) {
        }

        // Get pivot element from the middle
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low, j = high;
        
        while (i <= j) {
            
            // Keep going until all the values on the left side are lower than the pivot
            while (arr[i] < pivot) {
                i++;
            }
            
            // Keep going until all the values on the left side are greater than the pivot
            while (arr[j] > pivot) {
                j--;
            }
            
            // Compare the values from both sides and see if anything needs to be swapped
            // Then move the iterator on both lists
            
            if (i <= j) {

                str += swap(arr, i, j);
                i++;
                j--;

            }
        }
        
        // Repeat to sort two sub arrays (recursive)
        if (low < j) {
            str += quickSort(arr, low, j);
        }
        if (high > i) {
            str += quickSort(arr, i, high);
        }
        return str;
    }

    public static String swap(int[] array, int x, int y) {

        String quickSort = "";

        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;

        for (int i = 0; i < 10; i++) {
            quickSort += array[i] + " ";

        }
        quickSort += "\n";
        System.out.println(quickSort);
        return quickSort;

    }
}
