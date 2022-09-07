package com.github.TheTrueHooha.ProductArray;

/*
    Leetcode: 238. Product of Array Except Self
    Given an integer array nums, return an array answer such that answer[i] is equal to the
    product of all the elements of nums except nums[i].
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    You must write an algorithm that runs in O(n) time and without using the division operation.

 */

public class ProductArrayApplication {

    class Solution {
        public int[] productExceptSelf(int[] nums) {

            // arr1 contains the defined length of nums array
            int[] arr1 = new int[nums.length];

            int rightSide = 1, leftSide = 1; // start getting the product from both sides at index 1
            for(int i = 0; i < nums.length; i++ ){
                arr1[i] = leftSide;
                leftSide *= nums[i];
            }
            for(int i = nums.length - 1; i >= 0; i--){ // run the for loop in the nums array but from right side
                arr1[i] *= rightSide; // at index of arr1, start product from right side[1]
                rightSide *= nums[i]; // right side multiplies the nums array[i]
            }
            return arr1; // returns the new product array
        }
    }

}

/*
    thoughts: At first, this looked very complicated to come up the best logic.
    But as you'd write further, it will start to make sense.
 */
