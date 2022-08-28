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

        // calls the searchArray method and takes in a value and a key

        int value =  searchArray(arraySort, 2);
        if (value == -1){
            System.out.println("value cannot be found in the array");
        } else {
            // TODO: print result in a new line out the sorted results
            System.out.println("value found here at index "+value);
        }
    }

    // search through an array
    // pass as static inside a main class
    // TODO: can you have two public methods inside a main class?
    public static int searchArray(int arraySearch[], int key){
        for (int i=0; i<arraySearch.length; i++){
            if (arraySearch[i] == key){
                return i;
            }
        }
        return -1;
    }
}
