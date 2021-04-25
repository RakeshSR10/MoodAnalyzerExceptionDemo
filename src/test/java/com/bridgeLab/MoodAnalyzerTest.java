package com.bridgeLab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyzerTest {
    //UC1 TC-1.1
    //UC1 Refactor code using default and parameterized constructor TC-1.1
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Sad");
        String mood = moodAnalyzer.analyseMood("This is Sad Message");
        Assertions.assertEquals("SAD",mood);
    }
    //UC1 TC-1.2
    //UC1 Refactor code using default and parameterized constructor TC-1.1
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Happy");
        String mood = moodAnalyzer.analyseMood("This is Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }
}

