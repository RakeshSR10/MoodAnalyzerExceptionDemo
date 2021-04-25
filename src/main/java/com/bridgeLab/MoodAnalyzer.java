package com.bridgeLab;

public class MoodAnalyzer {
    public String message;
    //default constructor
    public MoodAnalyzer() {
    }

    //Parametrised constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    //analyseMood instance method
    public String analyseMood(String message){
        this.message = message;
        return analyseMood();
    }

    //UC1 Given a message, Ability to analyse and respond Happy or Sad mood
    public String analyseMood()
    {
        if(message.contains("Sad"))
        {
            return "SAD";
        }
        else
        {
            return "HAPPY";
        }
    }
}
