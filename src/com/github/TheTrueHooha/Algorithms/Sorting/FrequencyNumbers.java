package com.github.TheTrueHooha.Algorithms.Sorting;

import java.util.*;

public class FrequencyNumbers {

    static Integer[] arrInput = {4, 4, 3, 3, 2, 2, 2, 55, 66, 777, 1, 2, 3};

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(arrInput);

        sortBasedOnNumberFrequency(list);

    }

    public static void sortBasedOnNumberFrequency(List<Integer> list){
        int n = arrInput.length;
        final HashMap<Integer, Integer> map = new HashMap<>();
        final HashMap<Integer, Integer> mapIndex = new HashMap<>();

        for(int i = 0; i< n; i++){
            if(map.containsKey(arrInput[i])){
                map.put(arrInput[i], map.get(arrInput[i]) + 1);
            } else {
                map.put(arrInput[i], 1);
                mapIndex.put(arrInput[i], i);
            }
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int freq1 = map.get(o1);
                int freq2 = map.get(o2);
                if(freq1 != freq2){
                    return freq2 - freq1;
                } else{
                    return mapIndex.get(o1) - mapIndex.get(o2);
                }
            }
        });
        System.out.println(list);
    }
}
