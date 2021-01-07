package com.tutorial.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Ibad");
        stack.offerLast("Nurhamim");
        stack.offerLast("Aja");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        System.out.println("============== LAST ==================");

        Deque<String> deque = new LinkedList<>();

        deque.offerLast("Ibad");
        deque.offerLast("Nurhamim");
        deque.offerLast("Aja");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());

    }
}

// NOTE : Deque bisa pengambilan datanya bisa FIFO atau LIFO