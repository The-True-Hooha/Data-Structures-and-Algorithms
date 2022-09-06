package com.github.TheTrueHooha.TwoSum;

import java.util.HashMap;

/*
    Question:
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
 */


public class TwoSumApplication {

    class Solution {

        public int[] twoSum(int[] nums, int target) { // method takes in an argument. One, an array (int), and an int

            HashMap<Integer, Integer> store = new HashMap<>(); // using hashmap to take in key, and values(both integers)

            for (int i = 0; i < nums.length; i++) { // for loop that goes through the nums array

                int index = nums[i]; // places the index at 0

                int secondValue = target - index; // the second value equals the target number minus the index

                if(store.containsKey(nums[i])){ // if found in the hashmap with the key, returns the value starting from index
                    return new int[]{store.get(index), i};
                }
                store.put(secondValue, i);
            }

            return new int[]{};

        }
    }
}
