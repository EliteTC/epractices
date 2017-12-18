package main;

import processor.TextProcessor;
import test.TestData;

public class Tester {
    public static void main(String[] args) {
        System.out.println(TextProcessor.getMaxSentencesWithRepeatedWords(TestData.TEXT1));
        System.out.println(TextProcessor.getMaxSentencesWithRepeatedWords(TestData.TEXT2));
    }
}
