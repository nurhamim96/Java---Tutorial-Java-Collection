package com.tutorial.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Collections"));

        System.out.println(list);

        // Reverse
        Collections.reverse(list);
        System.out.println(list);

        // Acak
        Collections.shuffle(list);
        System.out.println(list);

    }
}
