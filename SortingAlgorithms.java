package com.mycompany.sortingalgorithmsgui;

public class SortingAlgorithms {

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
