package com.tutorial.collection;

import com.tutorial.collection.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();
        //cek size
        System.out.println(queue.size());
        // add data
        System.out.println(queue.offer("Ibad"));
        System.out.println(queue.offer("Nur"));
        System.out.println(queue.offer("Hamim"));
        // cek size
        System.out.println(queue.size());
        //ngambil data tapi tidak ngehapus
        System.out.println(queue.peek());
        //ngambil data trus langsung di hapus datanya
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        // cek size
        System.out.println(queue.size());
    }
}
