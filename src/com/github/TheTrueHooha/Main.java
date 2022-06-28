package com.github.TheTrueHooha;


import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        findSecondLargestNumber findTheSecondLargestNumber = new findSecondLargestNumber();
        //calls an object of the class
        findTheSecondLargestNumber.solution();
    }

}

class findSecondLargestNumber{

    public void solution() {
        int [] numbers = {1, 22, 3, 1, 22, 5, 5, 6, 6, 77, 77, 4, 4, 8};

        //sorts the number
        SortedSet<Integer> sortNumber = new TreeSet<>();
        //loop through the array and sort the number

        for (Integer i : numbers) {
            sortNumber.add(i);
            System.out.println(sortNumber);
        }

        //prints the second-largest number
        sortNumber.remove(sortNumber.last());
        System.out.println(sortNumber.last());
    }
}