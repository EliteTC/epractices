package task2;

import java.util.HashMap;
import java.util.Map;

public enum WordsRepo {
    INSTANCE;

    private Map<String,String> dictionary = new HashMap<>();
    {
        dictionary.put("book","книга");
        dictionary.put("table","стол");
        dictionary.put("London","Лондон");
        dictionary.put("is","это");
        dictionary.put("of","");
        dictionary.put("Great","Великой");
        dictionary.put("Britain","Британии");
        dictionary.put("the","");
        dictionary.put("capital","столица");
        dictionary.put("ball","мяч");
        dictionary.put("knife","нож");
        dictionary.put("life","жизнь");
        dictionary.put("pen","ручка");
        dictionary.put("heart","сердце");
        dictionary.put("brain","мозг");
        dictionary.put("pirate","пират");
    }
    public Map<String,String> getDictionary(){
        return dictionary;
    }
}
