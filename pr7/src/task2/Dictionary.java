package task2;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String,String> dictionary;

    Dictionary(){
        dictionary = new HashMap<>(100);
    }

    Dictionary(Map<String,String> dictionary){
        this.dictionary = dictionary;
    }

    public void addPair(String english,String russian){
        dictionary.put(english,russian);
    }

    public String translate(String englishText){
        String [] words = englishText.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : words){
           sb.append(" "+dictionary.get(s));
        }
        return sb.toString();
    }

}
