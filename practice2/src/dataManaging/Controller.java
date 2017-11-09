package dataManaging;

import dataHolding.DataHolder;
import model.Book;

import java.util.Arrays;
import java.util.Comparator;

public class Controller {
    private static String EMPTY_QUERY_RESULT = "The query did not return any results";
    private static Book [] books = DataHolder.getBooks();

    public Controller(){

    }

    public Book[] getBooksByAuthor(String author){
        Book[] booksToReturn = new Book[books.length];
        int index =0;
        for(int i=0; i < books.length; i++){
            if(author.equals(books[i].getAuthor())) booksToReturn[index++] = books[i];
        }
        if(index ==0) System.out.println(EMPTY_QUERY_RESULT);
        return booksToReturn;
    }

   public Book[] getBooksByPublisher(String publisher){
        Book[] booksToReturn = new Book[books.length];
        int index =0;
        for(int i=0; i < books.length; i++){
            if(publisher.equals(books[i].getPublisher())) booksToReturn[index++] = books[i];
        }
        if(index ==0) System.out.println(EMPTY_QUERY_RESULT);
        return booksToReturn;
    }

    public Book[] getBooksByYearLimit(int minYear){
        Book[] booksToReturn = new Book[books.length];
        int index =0;
        for(int i=0; i < books.length; i++){
            if(books[i].getYearOfPublishment() > minYear) booksToReturn[index++] = books[i];
        }
        if(index ==0) System.out.println(EMPTY_QUERY_RESULT);
        return booksToReturn;
    }

   public void sortByPublisher(){
       Arrays.sort(books,new BookPublisherComparator());
    }

    public void printBooks(){
        for(Book b : books) System.out.println(b);
    }
    class BookPublisherComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Book b1 = (Book) o1;
            Book b2 = (Book) o2;
            return b1.getPublisher().compareTo(b2.getPublisher());
        }
    }
}
