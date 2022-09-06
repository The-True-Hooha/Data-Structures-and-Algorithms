package com.github.TheTrueHooha.LeetcodeAnagram;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramApplication {

    static class AnagramSolution {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
            int[] charStore = new int[10];

            for(int d = 0; d < s.length(); d++){
                charStore[s.charAt(d) - 'c']++;
                charStore[t.charAt(d) - 'c']--;
            }

            for (int check : charStore){
                if(check != 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        /*
        AnagramSolution test = new AnagramSolution();
        test.isAnagram("check", "heck");
         */

        Scanner word = new Scanner(System.in);

        System.out.println("please enter a valid anagram");
        String example1 = word.nextLine();
        String example2 = word.nextLine();

        // a basic illustration
        // declares the two strings to be converted (anagram)
        // String example1 = "care";
        // String example2 = "race";

        // checks if the length of the two string examples are the same
        if (example1.length() == example2.length()){

            // then converts the string individually
            char[] letterArray1 = example1.toCharArray();
            char[] letterArray2 = example2.toCharArray();

            // sorts the chars in the array
            Arrays.sort(letterArray1);
            Arrays.sort(letterArray2);

            // after sorting, if the characters are the same, then the string is an anagram
            boolean checkedString = Arrays.equals(letterArray1, letterArray2);

            if (checkedString){
                System.out.println("correct, the two strings are an anagram");
            } else {
                System.out.println("error, does not work properly! Not a valid anagram word");
            }
        } else {
            System.out.println("the two strings do not match");
        }
    }
}

/*
    Thoughts
    This solution varies on the whosoever answers it, as I can see that
    they are different ways to implement an anagram

 */
