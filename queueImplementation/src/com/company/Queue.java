package com.company;

public class Queue {
    int arr[], front, rear, cap, n1;

    // Queue constructor
    Queue(int n) {
        arr = new int[n];
        cap = n;
        n = 0;
        front = 0;
        rear = -1;
    }

    public void dequeue()
    {
        // check for queue underflow
        if (isEmpty())
        {
            System.out.println("No items in the queue,cannot delete");
            System.exit(1);
        }

        System.out.println("Deleting " + arr[front]);

        front = (front + 1) % cap;
        n1--;
    }

    public void enqueue(int val)
    {
        // check for queue overflow
        if (isFull())
        {
            System.out.println("OverFlow!!Cannot add more values");
            System.exit(1);
        }

        System.out.println("Adding " + val);

        rear = (rear + 1) % cap;
        arr[rear] = val;
        n1++;
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Queue empty!!Cannot delete");
            System.exit(1);
        }
        return arr[front];
    }

    // returns the size of the queue
    public int size()
    {
        return n1;
    }

    // to check if the queue is empty or not
    public Boolean isEmpty()
    {
        return (size() == 0);
    }

    // to check if the queue is full or not
    public Boolean isFull()
    {
        return (size() == cap);
    }
}
