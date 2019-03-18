package com.globallogic.training.ducker.exception;


public class CannotProccedNewState extends Exception {
    public CannotProccedNewState() {
        System.out.println("Duck cannot change current state to this");
    }
}
