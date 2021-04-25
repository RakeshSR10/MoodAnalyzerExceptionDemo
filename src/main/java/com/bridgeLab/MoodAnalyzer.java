package com.bridgeLab;

public class MoodAnalyzer {
    //UC1 Given a message, Ability to analyse and respond Happy or Sad mood
    public String analyseMood(String message)
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
