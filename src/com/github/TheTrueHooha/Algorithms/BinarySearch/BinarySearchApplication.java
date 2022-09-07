package com.github.TheTrueHooha.Algorithms.BinarySearch;

public class BinarySearchApplication {

    public static int query(int[] arr1, int input, int first, int last){
        int mid = (first+last)/2;
        if (first <= last){
            if (input == arr1[mid]) {
                return mid;
            }
                if (input<arr1[mid])
                    return query(arr1, input, first, mid-1);
                else
                    return query(arr1, input, mid+1, last);
            }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = query(a1, 5, 0, a1.length-1);
        if (index == -1)
            System.out.println("no result found");
        else
            System.out.println("element found at index "+index);
        }
    }

