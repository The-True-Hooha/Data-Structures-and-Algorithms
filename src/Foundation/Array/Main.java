package Foundation.Array;

public class Main {

    public static void main(String[] args) {

        // how to create arrays and how to insert data into them
        int[] array1 = new int[8];
        int count = 0;
        //loops through the array and prints out the data
        for(int i=0; i < array1.length; i++) {
            array1[i] = count;
            count++;
            System.out.print(count+" ");
        }
        // if count equals zero, prints the number of positions filled in the array vice-versa
        for (int j=0; j<array1.length; j++){
            System.out.print(array1[j]+" ");

        }
    }
}
