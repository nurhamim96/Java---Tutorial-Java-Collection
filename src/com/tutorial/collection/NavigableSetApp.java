package com.tutorial.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Ibad", "Nurhamim", "Belajar", "NavigableSet", "Java", "Collection"));

        NavigableSet<String> nameReverse = names.descendingSet(); // reverse
        NavigableSet<String> last = names.tailSet("Ibad", true); // mengambil element dari Ibad sampai belakang
        NavigableSet<String> first = names.headSet("Ibad", true); // mengambil element dari Ibad sampai depan

        for (var name : first) {
            System.out.println(name);
        }

        // IMMUTABLE NavigableSet
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("Ops");
    }
}

// NOTE : jika element Ibad ingin di tampilkan juga parameter inclusive nya dibikin true kalo false dia gak akan di tampilkan
