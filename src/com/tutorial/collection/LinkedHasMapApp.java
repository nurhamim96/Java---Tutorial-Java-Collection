package com.tutorial.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHasMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Ibad");
        map.put("middle", "Nur");
        map.put("last", "Hamim");

        Set<String> keys = map.keySet();

        for (var key : keys) {
            System.out.println(key);
        }
    }
}


// NOTE : keySet(); -> memastikan data yang ditampilkan berurutan sesuai dengan data yang di inputkan