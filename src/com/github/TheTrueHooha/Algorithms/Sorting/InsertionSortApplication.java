package com.github.TheTrueHooha.Algorithms.Sorting;

public class InsertionSortApplication {

    public static void insertionSort(int[] arr1){
        for (int i = 0; i<arr1.length; i++){
            int j = i-1;
            int b = arr1[i];

            while(j > 0 && b<=arr1[j]){
                arr1[j+1] = arr1[j];
                j = j -1;
            }
            arr1[j+1] = b;
        }
        for (int i = 0; i<arr1.length; i++){
            System.out.print(arr1[1]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] query = new int[]{3, 7, 1, 9, 4, 2, 6};
        insertionSort(query);
    }
}
