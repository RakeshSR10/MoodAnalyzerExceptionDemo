package com.bridgeLab;

//Handle custom exception and enum exception
public class MoodAnalysisException extends Exception{

    //UC2 inform if user entered Invalid mood
    public enum errorType{
        NULL,EMPTY
    }

    public MoodAnalysisException(){
        super();
    }
}
