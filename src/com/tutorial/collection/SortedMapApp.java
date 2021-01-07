package com.tutorial.collection;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        System.out.println("========================= YANG PAKE KOMPARATOR =================================");
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMapWithComparator = new TreeMap<>(stringComparator);
        sortedMapWithComparator.put("Ibad", "Ibad");
        sortedMapWithComparator.put("Eko", "Eko");
        sortedMapWithComparator.put("Budi", "Budi");

        for (var value : sortedMapWithComparator.keySet()) {
            System.out.println(value);
        }


        System.out.println("========================= YANG GAK PAKE KOMPARATOR =================================");
        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.put("Ibad", "Ibad");
        sortedMap.put("Eko", "Eko");
        sortedMap.put("Budi", "Budi");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }
    }
}

// NOTE : Jika ingin komparatornya desc compere dari object kedua ke object pertama jikan ingin asc tinggal kebalikannya