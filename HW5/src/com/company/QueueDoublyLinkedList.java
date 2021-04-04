package com.company;

public class QueueDoublyLinkedList<T> {
    private Node<T> front, back;
    private int size;

    public QueueDoublyLinkedList() {
        front = null;
        back = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T data) {
        Node<T> oldBack = back;
        back = new Node<T>();
        back.data = data;
        back.next = null;
        if (isEmpty()) {
            front = back;
        } else {
            oldBack.next = back;
        }
        size++;
    }

    public T dequeue() {
        T data = front.data;
        front = front.next;
        if (isEmpty()) {
            back = null;
        }
        size--;
        return data;
    }

    public int size() {
        return size;
    }
}
