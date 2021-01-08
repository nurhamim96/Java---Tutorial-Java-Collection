package com.tutorial.collection;

import java.util.Arrays;
import java.util.List;

public class ConvertToArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Ibad", "Nurhamim");

        // konversi ke tipe data object
        Object[] objects = names.toArray();
        // konversi ke tipe data string
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
