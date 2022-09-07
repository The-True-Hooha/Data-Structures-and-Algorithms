package com.github.TheTrueHooha.DataStructure.HashTables;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashTableApplication {
    public static void main(String[] args) {

        HashMap<String, Integer> names = new HashMap<>();
        names.put("Dan", 4);
        names.put("Bright", 5);
        names.put("Mike", 2);
        names.put("Ark", 7);

        Set<String> data = names.keySet();
        for(String i: data){
            System.out.println(names.get(i));
            System.out.println(i.hashCode());
        }

        Set<Map.Entry<String, Integer>> population = names.entrySet();
        for (Map.Entry<String, Integer > i : population){
            System.out.println(i.getValue()+ " " +i.getKey());
        }
    }
}