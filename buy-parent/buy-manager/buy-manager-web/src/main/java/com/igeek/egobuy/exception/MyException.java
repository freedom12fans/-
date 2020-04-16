package com.igeek.egobuy.exception;

import lombok.Data;

@Data
public class MyException extends RuntimeException {
    private String message;
    private int code;

    public MyException(String message, int code) {
        super(message);
        this.message = message;
        this.code = code;
    }


}
