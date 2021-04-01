package com.company;

public class Main {

    public static void main(String[] args) {
        Integer a = 3;
        Integer b = 32;
        Integer c = 10;
        MyList<Integer> myList = new MyList<>();
        myList.add(a);
        myList.add(b);
        myList.add(c);
        System.out.println(myList.toString());
        System.out.println(myList.smallest());
        System.out.println(myList.largest());
    }
}
