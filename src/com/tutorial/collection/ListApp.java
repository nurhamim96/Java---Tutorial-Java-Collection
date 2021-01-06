package com.tutorial.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
//        List<String> strings = new LinkedList<>();

        strings.add("Ibad");
        strings.add("Nurhamim");

        strings.set(0, "Budi");

        // remove dari List
        strings.remove(1);
//        strings.remove("Ibad"); // remove bawaan collection

        System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }
    }
}

// Note : Default dari list yaitu 10 jika dia lebih dari 10 maka akan membuat array baru. ArrayList<>(100) berikut contoh array list dengan memasukkan jumlah initial capacitynya.

