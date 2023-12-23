package ru.itis.inf;

public class InvalidTotalScaleException extends  Exception{
    public  InvalidTotalScaleException(int scale){
        super("Total has scale="+ scale+ " instead of scale="+2);
    }
}
