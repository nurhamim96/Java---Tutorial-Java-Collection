package com.tutorial.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Ibad");
        list.add("Nurhamim");

        for (var value : list) {
            System.out.println(value);
        }
    }
}

// NOTE : Vector sebenernya sama kayak ArrayList cuman dia tread safe(bisa di jalankan secara synchronized/paralel).