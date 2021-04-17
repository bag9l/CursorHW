package com.company.task1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            throw new ExceptionA("ExceptionA");
        } catch (ExceptionA e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new ExceptionB("ExceptionB");
        } catch (ExceptionB e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new NullPointerException("NullPointerException");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new IOException("IOException");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
