package com.company.task3;

public class Test {
    public static void main(String[] args) throws Exception {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void someMethod() throws Exception {
        someMethod2();
    }

    static void someMethod2() throws Exception {
        throw new Exception();
    }
}
