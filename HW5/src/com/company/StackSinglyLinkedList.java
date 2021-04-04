package com.company;

public class StackSinglyLinkedList<T> {
    private int size;
    private Node<T> head;

    public StackSinglyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T data) {
        Node oldHead = head;
        head = new Node();
        head.data = data;
        head.next = oldHead;
        size++;
    }

    public T pop() {
        if (head == null) {
            throw new LinkedListEmptyException("List is Empty");
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public T top() {
        return head.data;
    }

    public int size() {
        return size;
    }

}
