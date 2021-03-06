package com.company;

public class LinkedListEmptyException extends RuntimeException {
    public LinkedListEmptyException() {
    }

    public LinkedListEmptyException(String message) {
        super(message);
    }

    public LinkedListEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public LinkedListEmptyException(Throwable cause) {
        super(cause);
    }

    public LinkedListEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
