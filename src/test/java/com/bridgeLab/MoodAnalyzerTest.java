package com.bridgeLab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyzerTest {
    //UC1 TC-1.1
    //UC1 Refactor code using default and parameterized constructor TC-1.1
    @Test
    public void givenMessage_Constructor_whenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String mood = moodAnalyzer.analyseMood("Sad");
        Assertions.assertEquals("SAD",mood);
    }

    //UC1 TC-1.2
    //UC1 Refactor code using default and parameterized constructor TC-1.2
    @Test
    public void givenMessage_Constructor_whenNotSad_ShouldReturnHappy() throws MoodAnalysisException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy mood");
        String mood = moodAnalyzer.analyseMood("Happy");
        Assertions.assertEquals("HAPPY",mood);
    }
    //test for null pointer exception
    @Test
    public void givenNullMood_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY",mood);
    }

    //test for throw exception(null and isEmpty)
    @Test
    public void givenNullMoodShould_Throw_MoodAnalysisException(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY",mood);
    }
    //UC3
    @Test
    public void givenEmptyMoodShould_Throw_MoodAnalysisException(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY",mood);
    }
}

