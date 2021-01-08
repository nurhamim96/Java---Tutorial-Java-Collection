package com.tutorial.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Ibad", "Ibad Value");
        map.put("Eko", "Eko Value");
        map.put("Budi", "Budi Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}

// NOTE : Entry diguanakan jika ingin mengambil key dan valuenya.  getKey() -> untuk ngambil keynya dan getValue() -> untuk ngambil valuenya