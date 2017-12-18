package processor;

import util.Separators;

import java.util.*;

public class TextProcessor {

    private static String [] getWords(String text){
        return text.replaceAll(Separators.SEPARATORS,"").trim().split(" ");
    }
    private static String [] getSentences(String text){
        return text.split(Separators.SENTENCE_SPLIT_REGEX);
    }

    public static int getMaxSentencesWithRepeatedWords(String text){
        String[] sentences = getSentences(text);
        String[] words = getWords(text);

        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(Arrays.asList(words));

        int maxCount = 0;
        String maxWord = "";

        Iterator<String> iter = uniqueWords.iterator();
        while(iter.hasNext()){
            String word = iter.next();
            int localCount =0;
            for(String s : sentences){
                if(s.contains(word)) localCount++;
            }
            if(localCount > maxCount) {
                maxCount = localCount;
                maxWord = word;
            }
        }
        System.out.println(maxWord);
        return maxCount;
    }
}
