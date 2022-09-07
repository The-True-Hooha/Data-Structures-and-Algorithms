package com.github.TheTrueHooha.FrequentElements;

import java.util.*;

/*
    Question:
    Given an integer array nums and an integer k,
    return the k most frequent elements. You may return the answer in any order.
    Leetcode: 347
 */


public class FrequentElementsApplication {

    class Solution {

        public int[] topKFrequent(int[] nums, int k) {

            int[] arr1 = new int[k]; // declares an array where the size of the array is dynamic irt k

            HashMap<Integer, Integer> storeNums = new HashMap<>();

            for(int num : nums){
                storeNums.put(num, storeNums.getOrDefault(num, 0)+ 1);
            }

            PriorityQueue<Map.Entry<Integer, Integer>> pq1 = new PriorityQueue<>
                    ((a, b) -> a.getValue() - b.getValue());
            for(Map.Entry<Integer, Integer> mp : storeNums.entrySet()){
                pq1.add(mp);
                if (pq1.size() > k) pq1.poll();
            }
            int i = k;
            while (!pq1.isEmpty()) {
                arr1[--i] = pq1.poll().getKey();
            }
            return arr1;
        }
    }
}
