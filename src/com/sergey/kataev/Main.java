package com.sergey.kataev;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static <K> Map<K, Integer> arrayToMap(K[] ks){
        HashMap<K, Integer> map = new HashMap<>();
        for (K i : ks){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else {
                map.put(i, 1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
	    String[] strings = {"a","a","a","b","b","b","b","cC"};
	    Map<String, Integer> map = arrayToMap(strings);
	    for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
