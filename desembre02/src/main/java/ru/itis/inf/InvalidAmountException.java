package ru.itis.inf;

public class InvalidAmountException extends Exception{
    public  InvalidAmountException() {
        super("Amount should be greater than 0");
    }
}
