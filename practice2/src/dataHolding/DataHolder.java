package dataHolding;

import model.Book;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DataHolder {
    private static Book [] books = {
            new Book("title1","author1","publisher1",2000,200,"5.95"),
            new Book("title2","author2","publisher2",2001,250,"10.95"),
            new Book("title3","author1","publisher1",2010,300,"5.95"),
            new Book("title4","author3","publisher3",2015,1000,"5.95"),
            new Book("title5","author4","publisher4",1995,459,"5.95"),
            new Book("title6","author5","publisher5",2018,497,"5.95"),
            new Book("title7","author4","publisher6",2020,59,"5.95"),


    };
    private static String [] authors = {"author1","author2","author3","author4","author5"};
    private static String [] publishers = {"publisher1","publisher2","publisher3","publisher4","publisher5","publisher6"};


    public static String getRandomAuthor(){
        return getRandomString(authors);
    }

    public static String getRandomPublisher(){
        return getRandomString(publishers);
    }

    public static int getRandomYear(int min,int max) {
        return  ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private static String getRandomString(String [] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static Book[] getBooks (){
        return books;
    }
}
