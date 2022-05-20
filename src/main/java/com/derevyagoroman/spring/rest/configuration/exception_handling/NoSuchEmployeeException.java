package com.derevyagoroman.spring.rest.configuration.exception_handling;

public class NoSuchEmployeeException extends  RuntimeException{

    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
