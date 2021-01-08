package com.tutorial.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(1000);
        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }

        System.out.println("================= TANPA COMPARATOR =====================");
        int index = Collections.binarySearch(list, 333);
        System.out.println(index);


        System.out.println("================= MENGGUNAKAN COMPARATOR =====================");
        Comparator<Integer> last = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        int indexLast = Collections.binarySearch(list, 330);
        System.out.println(indexLast);
    }
}
