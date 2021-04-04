package com.company;

public class DoublyLinkedList<T> {
    private Node<T> head, tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T data) {
        Node<T> temp = new Node<>(data);
        if (isEmpty()) {
            tail = temp;
        } else {
            head.previous = temp;
        }
        temp.next = head;
        head = temp;

        setSize(++size);
    }

    public void addLast(T data) {
        Node<T> temp = new Node<>(data);
        if (isEmpty()) {
            head = temp;
        } else {
            tail.next = temp;
        }
        temp.previous = tail;
        tail = temp;
        setSize(++size);
    }

    public void add(T data, int index) {
        Node<T> newElement = new Node<>(data);
        Node<T> currentElement = head;
        int num = 0;
        while (currentElement != null && num != index) {
            currentElement = currentElement.next;
            num++;
        }
        Node<T> prevElement = currentElement.previous;
        prevElement.next = newElement;
        newElement.previous = prevElement;
        currentElement.previous = newElement;
        newElement.next = currentElement;
        setSize(++size);
    }

    public void removeFirst() {
        if (head.next == null) {
            head = null;
        } else {
            head.next.previous = null;
            head = head.next;
        }
        setSize(--size);
    }

    public void removeLast() {
        if (head.next == null) {
            head = null;
        } else {
            tail.previous.next = null;
            tail = tail.previous;
        }
        setSize(--size);
    }

    public void setSize(int size) {
        if (size < 0) {
            size = 0;
        }
        this.size = size;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String str = "";
        Node<T> temp = head;
        while (temp != null) {
            str = str + temp.data + " ";
            temp = temp.next;
        }
        return str;
    }
}
