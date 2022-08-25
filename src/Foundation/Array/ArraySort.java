package Foundation.Array;

import java.util.Arrays;
// how to sort through in an array
public class ArraySort {
    public static void main(String[] args) {

        int arraySort[] = new int[] { 3, 5, 6, 29, 10, 22, 23, 4, 1, 2 }; // inserts the numbers into the array unordered

        for(int i = 0; i<arraySort.length; i++){ //for loop that prints out the numbers in the array
            System.out.print(arraySort[i]);
        }
        Arrays.sort(arraySort); // array method that sorts the array
        System.out.println();
        for (int i = 0; i<arraySort.length; i++){ // loops through the new sorted array and prints them
            System.out.print(arraySort[i]);
        }
    }
}
