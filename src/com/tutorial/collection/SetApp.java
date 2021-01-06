package com.tutorial.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("Ibad");
        names.add("Nurhamim");
        names.add("Belajar Set pada collection");
        names.add("Ibad");
        names.add("Nurhamim");
        names.add("Belajar Set pada collection");

        for (var name : names) {
            System.out.println(name);
        }
    }
}

/*
 Note : 1. pada Set data tidak boleh duplikat kalo duplikat yang di masukan cuman 1 data aja
        2. kalo pake HashSet<>(); data yang di tampilkan tidak sesuai dengan yang di inputkan (tidak berurutan)
        3. kalo pake LinkedHashSet<>(); data yang di tampilkan berurutan sesuai dengan yang di inputkan (berurutan)
*/