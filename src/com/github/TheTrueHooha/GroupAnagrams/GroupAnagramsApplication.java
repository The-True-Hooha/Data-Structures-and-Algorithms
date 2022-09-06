package com.github.TheTrueHooha.GroupAnagrams;

import java.util.*;

public class GroupAnagramsApplication {

    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            List<List<String>> group = new ArrayList<>();

            if(strs.length == 0){
                return group;
            }
            HashMap<String, List<String>> group2 = new HashMap<>();
            for(String i : strs){
                char[] alpha = new char[30];
                for(char e : i.toCharArray()){
                    alpha[e - 'a']++;
                }
                String key = new String(alpha);
                group2.computeIfAbsent(key, k -> new ArrayList<>());

                group2.get(key).add(i);
            }
            group.addAll(group2.values());
            return group;
        }
    }
}
