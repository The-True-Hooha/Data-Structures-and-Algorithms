package com.github.TheTrueHooha;

import java.util.SortedSet;
import java.util.TreeSet;


//random question to find the second-highest number in an array
//solved using collections api

public class FindTheSecondLargestNumber {

    public void number () {

        //given int of numbers in arrays
        int[] givenArrayNumbers = {1, 22, 3, 1, 22, 5, 5, 6, 6, 77, 77, 4, 4, 8};

        //the numbers in the array are sorted
        //eliminating the duplicates
        SortedSet<Integer> sortedSet = new TreeSet<>();

        //a for loop method the loops through and prints the sorted array
        for (Integer i: givenArrayNumbers){
            sortedSet.add(i);
        }
        //System.out.println(sortedSet);

        //sorted and prints the second-largest number
        sortedSet.remove(sortedSet.last());
        System.out.println(sortedSet.last());
    }
}
