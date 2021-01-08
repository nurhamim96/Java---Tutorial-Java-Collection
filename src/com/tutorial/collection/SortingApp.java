package com.tutorial.collection;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;

public class SortingApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // Menambahkan lebih dari satu data
        list.addAll(Arrays.asList("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Collection"));

        System.out.println("================== TANPA COMPARATOR ======================");
        // di urutkan
        Collections.sort(list);

        for (var value : list) {
            System.out.println(value);
        }

        System.out.println("==================== DENGAN COMPARATOR =====================");
        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list, reverse);

        for (var value : list) {
            System.out.println(value);
        }

    }
}
