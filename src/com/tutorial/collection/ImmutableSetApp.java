package com.tutorial.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> singleton = Collections.singleton("Ibad");

        // Mutable
        Set<String> mutable = new HashSet<>();
        mutable.add("Ibad");
        mutable.add("Nurhamim");

        // Immutable
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        // Immutable
        Set<String> set = Set.of("Ibad", "Nurhamim", "Immutable");
//        set.add("Ibad"); / ERROR, tidak bisa ditambahkan karena datanya bersifat immutable
//        set.remove("Ibad"); // ERROR, tidak bisa dihapus karena datanya bersifat immutable


    }
}
