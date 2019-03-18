package com.globallogic.training.ducker.exception;

public class NoSuchColorException extends Exception {
    public NoSuchColorException() {
        System.out.println("illegal color for duck: please choose between yellow, brown. white or gold");
    }
}
