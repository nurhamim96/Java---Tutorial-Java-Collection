package com.tutorial.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Ibad", "Ibad");
        map.put("Eko", "Eko");
        map.put("Budi", "Budi");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        // kurang dari "Eko"
        System.out.println(map.lowerKey("Eko"));
        // lebih dari "Eko"
        System.out.println(map.higherKey("Eko"));
        // kurang dari sama dengan "Eko"
        System.out.println(map.floorKey("Eko"));
        // lebih dari sama dengan "Eko"
        System.out.println(map.ceilingKey("Eko"));

        // Dibalikan jadi descending
        System.out.println("================= DESCENDING ==================");
        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        System.out.println("==================== IMMUTABLE ==================");
        // Immutable Empty
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        // Merubah Mutable menjadi Immutable
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);
//        immutable.put("tambah data", "Tidak bisa ditambahkan karena sudah di ubah menjadi immutable");

    }
}
