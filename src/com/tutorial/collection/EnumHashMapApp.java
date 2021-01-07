package com.tutorial.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static enum Level {
        FREE,
        STANDART,
        PREMIUM,
        VIP
    }
    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);

        map.put(Level.FREE, "Ibad");
        map.put(Level.STANDART, "Nurhamim");
        map.put(Level.VIP, "Ibad Nurhamim");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
