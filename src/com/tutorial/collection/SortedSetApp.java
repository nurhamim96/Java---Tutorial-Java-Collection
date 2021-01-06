package com.tutorial.collection;

import com.tutorial.collection.data.Person;
import com.tutorial.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

//        SortedSet<Person> people = new TreeSet<>(new PersonComparator()); // diurutkan jadi ascending
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed()); // urutannya dibalik jadi descending

        people.add(new Person("Ibad"));
        people.add(new Person("Eko"));
        people.add(new Person("Budi"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        // diubah menjadi Immutable
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
//        sortedSet.add(new Person("Nurhamim"));
    }
}
