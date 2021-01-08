package com.tutorial.collection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {
        List<String> list = List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Java", "Collection");

        // di ubah menjadi spliterator
        Spliterator<String> spliterator1 = list.spliterator();
        // di split datanya dari spliterator1 yang datanya tadinya 6 dibagi 2 sama spliterator2
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        // di split datanya dari spliterator2 yang datanya tadinya 3 dibagi 2 sama spliterator3
        Spliterator<String> spliterator3 = spliterator2.trySplit();

        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());
        System.out.println(spliterator3.estimateSize());

        // Iterasi / Looping
        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        spliterator3.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}

// NOTE : gunakan trySplit() jika ingin men split datanya