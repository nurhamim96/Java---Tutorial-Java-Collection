package com.tutorial.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Ibad");
        collection.add("Nurhamim");
        collection.addAll(Arrays.asList("Semangat", "Belajar", "Java", "Collection"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("================ REMOVE =================");
        System.out.println();
        collection.remove("Ibad");
        collection.removeAll(Arrays.asList("Java", "Collection"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("=============== CONTAINS ================");
        System.out.println();
        // contain
        System.out.println(collection.contains("Nurhamim"));
        // contains
        System.out.println(collection.containsAll(Arrays.asList("Semangat", "Belajar")));

        System.out.println("============= GET JUMLAH DATA =============");
        System.out.println(collection.size());

    }
}
