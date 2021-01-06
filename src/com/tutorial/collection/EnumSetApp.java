package com.tutorial.collection;

import java.util.EnumSet;

public class EnumSetApp {
    public static void main(String[] args) {
//        EnumSet<Gender> genders = EnumSet.allOf(Gender.class); // Jika ingin menampilkan semua data enum
        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE); // Jika ingin menampilkan beberapa data enum

        for (var gender : genders) {
            System.out.println(gender);
        }
    }

    public static enum Gender {
        FEMALE, MALE, NOT_MENTION
    }
}
