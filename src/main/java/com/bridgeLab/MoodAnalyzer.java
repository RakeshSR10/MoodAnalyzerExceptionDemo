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
    //analyseMood method and handling nullpointerexception
    public String analyseMood(){
        try {
            //custom exception
            this.message = message;
            if(message == null || message == " ")
            {
                throw new MoodAnalysisException();
            }
            if(message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException | MoodAnalysisException e){
            return "HAPPY";

        }
    }
}
