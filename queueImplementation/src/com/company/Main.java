package com.company;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front element is: " + q.peek());
        q.dequeue();

        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is " + q.size());
        q.dequeue();

        System.out.println("Front element is: " + q.peek());
        q.dequeue();

        System.out.println("Queue size is " + q.size());
    }
}
