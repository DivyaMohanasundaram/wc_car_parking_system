package org.com.exception;


public class OutOfBoundsException extends RuntimeException {
    public OutOfBoundsException(int vertical, int horizontal) {
        super(vertical + " ,"+ horizontal+ "out of Index" );
    }
}