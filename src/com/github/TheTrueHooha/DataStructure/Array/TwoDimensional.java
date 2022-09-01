package Foundation.Array;

// creating two-dimensional arrays 2D

public class TwoDimensional {
    public static void main(String[] args) {

        // creates the array in 4 ruws and 4 columns
        int[][] array2D = new int[4][5];
        int numbers = 1;

        for(int i = 0; i < array2D.length; i++){ // iterates over the rows
            for(int j = 0; j<array2D[i].length; j++){
                array2D[i][j] = numbers; // stores the numbers in the array
                numbers++;

            }
        }
        for(int i = 0; i < array2D.length; i++){
            for(int j = 0; j<array2D[i].length; j++){
                System.out.print(array2D[i][j]+" "); // prints the numbers in a matrix 2D format
            }
            System.out.println();
        }


    }
}
