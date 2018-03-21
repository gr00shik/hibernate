package com.gr00shik.entity.function.exc;

public class NoAnyProductException extends Throwable {
    @Override
    public void printStackTrace() {
        System.out.println("No more Product");
    }
}
