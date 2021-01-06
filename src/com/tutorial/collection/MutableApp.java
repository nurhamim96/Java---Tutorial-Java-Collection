package com.tutorial.collection;

import com.tutorial.collection.data.Person;

import java.security.PublicKey;
import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Ibad");

        person.addHobby("Game");
        person.addHobby("Coding");
//        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan hobby");
    }
}
