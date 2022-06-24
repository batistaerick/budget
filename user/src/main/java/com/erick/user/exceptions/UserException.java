package com.erick.user.exceptions;

public class UserException extends RuntimeException {

    public UserException(Throwable throwable) {
        super(throwable);
    }

    public UserException(String msg) {
        super(msg);
    }

}