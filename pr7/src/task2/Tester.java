package task2;

public class Tester {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(WordsRepo.INSTANCE.getDictionary());
        dictionary.addPair("wolf","волк");
        dictionary.addPair("and","и");
        dictionary.addPair("man","человек");

        System.out.println(dictionary.translate("London is the capital of Great Britain"));

    }
}
