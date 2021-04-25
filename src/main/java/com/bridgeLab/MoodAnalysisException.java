package com.bridgeLab;
//Handle custom exception and enum exception
//UC 2
public class MoodAnalysisException extends Exception{

    //UC3 inform if user entered Invalid mood
    //Enum expression for empty or null
    public enum errorType{
        NULL,EMPTY
    }
    public errorType type;

    public MoodAnalysisException(String message){

        super(message);
    }
    public MoodAnalysisException(){
        super();
        this.type = type;
    }
}
