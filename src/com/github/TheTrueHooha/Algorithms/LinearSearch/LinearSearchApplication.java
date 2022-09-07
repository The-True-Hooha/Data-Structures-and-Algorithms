package com.github.TheTrueHooha.Algorithms.LinearSearch;

import java.util.Scanner;

public class LinearSearchApplication {

    public static void main(String[] args) {

        // using arrays to salve linear search
        int b1[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 10, 22, 34}; // one dimensional array containing 10 objects
        Scanner input = new Scanner(System.in); // takes in an input from the user
        int count = 0;
        System.out.println("enter search keyword");
        int keyInt = input.nextInt(); // the keyInt to be queried

        // for loop that runs through the array to search at index position
        for (int j = 0; j < b1.length; j++){
            if (b1[j] == keyInt){ // if found print
                System.out.println("your input can be found here at index " +j);
                count++;
            }
        }
        if (count == 0){
            System.out.println("your input cannot be found, please use a valid input");
        }
    }
}
