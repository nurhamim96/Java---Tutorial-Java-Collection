package com.tutorial.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();
        map.put("Ibad", "Ibad");
        map.put("Eko", "Eko");
        map.put("Budi", "Budi");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}

// NOTE : Hashtable<>() sebenernya sama kayak HashMap<>(), cuman dia tread safe(bisa di jalankan secara synchronized/paralel).