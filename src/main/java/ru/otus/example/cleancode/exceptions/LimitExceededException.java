package ru.otus.example.cleancode.exceptions;

import java.math.BigDecimal;

public class LimitExceededException extends RuntimeException {

    public LimitExceededException(String msg, BigDecimal limit){
        super("Limit: " + msg + " " + limit);
    }

}
