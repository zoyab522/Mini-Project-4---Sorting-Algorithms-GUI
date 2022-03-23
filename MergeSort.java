package com.mycompany.sortingalgorithmsgui;

/**
 *
 * @author Zoya Bawangaonwala and Anika Suman
 */

public class MergeSort {

    public static String mergeSort(int[] array, int low, int high) {
        String str = "";
        if (high <= low) {
            return str;
        }

        // Partition the array
        int mid = (low + high) / 2;
        // Sort the partitions and merge
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        str = merge(array, low, mid, high);
        return str;
    }

    public static String merge(int[] array, int low, int mid, int high) {
        String empty = "";
        // 2 partitions left and right
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        // add elements left in the first interval
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[low + i];
        }
        // add elements left in the second interval
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[mid + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        // Step through the process (show using print statements):
        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                for (int n : array) {
                    System.out.print(n);

                    empty = empty + n + " ";
                    System.out.print(", ");
                }
                empty += "\n";
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        return empty;
    }

}
