package com.tutorial.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        // one data list
        List<String> one = Collections.singletonList("satu");

        // empty list
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Ibad");
        mutable.add("Nurhamim");

        // immutable list
        List<String> immutable = Collections.unmodifiableList(mutable);

        // immutable list
        List<String> elements = List.of("Ibad", "Nurhamim");
//        elements.add("Budi");


    }
}
