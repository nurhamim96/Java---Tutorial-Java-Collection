package com.tutorial.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
//        Queue<String> queue = new PriorityQueue<>();
//        Queue<String> queue = new LinkedList<>();
      queue.add("Ibad");
      queue.add("Nurhamim");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }
    }
}

/*
NOTE :
 - ArrayDeque<>(); -> Menggunakan data array
 - LinkedList<>(); -> Menggunakan data double linkedlist (node)
 - PriorityQueue<>(); -> Menggunakan data array dan di urutkan
*/
