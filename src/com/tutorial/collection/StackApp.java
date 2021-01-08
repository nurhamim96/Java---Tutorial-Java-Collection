package com.tutorial.collection;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Ibad");
        stack.push("Nurhamim");

        for (var value = stack.pop(); value != null; value = stack.pop()) {
            System.out.println(value);
        }
    }
}

/*
NOTE : - Stack adalah implementasi struktur data tumpukan LIFO(Last In First Out) sama kayak Deque, cuman Deque ada FIFO juga. jadi mendingan pake Deque aja ;-)
       - Buat nambahin datanya pake push()
       - Buat mengambil data dan menghapus data pake pop()
       - Ketikan datanya Null pop() akan melakukan throw exception : EmptyStackException. untuk mengatasinya tinggal tambahin try/catch aja.
 */
