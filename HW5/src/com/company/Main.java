package com.company;

public class Main {

    public static void main(String[] args) {

        //Singly linked list based stack
        System.out.println("Singly linkedList based stack: ");
        StackSinglyLinkedList<Integer> stackList = new StackSinglyLinkedList<>();
        System.out.println(stackList.isEmpty());
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        System.out.println(stackList.top());
        System.out.println(stackList.pop());
        System.out.println(stackList.top());
        System.out.println(stackList.size());
        System.out.println(stackList.isEmpty());

        //Doubly linked list based queue
        System.out.println("\nDoubly linkedList based queue:");
        QueueDoublyLinkedList<String> queueList = new QueueDoublyLinkedList<>();
        System.out.println(queueList.isEmpty());
        queueList.enqueue("a");
        queueList.enqueue("b");
        queueList.enqueue("c");
        System.out.println(queueList.size());
        System.out.println(queueList.dequeue());
        System.out.println(queueList.size());
        System.out.println(queueList.isEmpty());

        //Doubly linked list
        System.out.println("\nDoubly linked list:");
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(4);
        System.out.println("size: " + list.size());
        list.removeFirst();
        System.out.println(list.toString());
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(1);
        list.add(2, 1);
        System.out.println(list.toString());
        list.removeFirst();
        System.out.println(list.toString());
        list.addFirst(1);
        System.out.println(list.toString());
        list.removeLast();
        System.out.println(list.toString());
        list.addLast(4);
        System.out.println(list.toString());
        System.out.println("size: " + list.size());
    }
}
