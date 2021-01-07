package com.tutorial.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        // Empty
        Map<String, String> empty = Collections.emptyMap();
        // Single data
        Map<String, String> singleton = Collections.singletonMap("name", "Ibad nurhamim");
        // Mutable
        Map<String, String> mutable = new HashMap<>();
        mutable.put("name.first", "Ibad");
        mutable.put("name.last", "Nurhamim");
        // Immutable
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);


        // Manual immutable
        Map<String, String> manual = Map.of(
                "name.first", "Ibad",
                "name.last", "Nurhamim"
        );

    }
}
