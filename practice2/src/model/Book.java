package model;

import java.util.Comparator;

public class Book {

   private String title;
   private String author;
   private String publisher;
   private int yearOfPublishment;
   private int numOfPages;
   private String price;

    public Book(String title, String author, String publisher, int yearOfPublishment, int numOfPages, String price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishment = yearOfPublishment;
        this.numOfPages = numOfPages;
        this.price = price;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getYearOfPublishment() != book.getYearOfPublishment()) return false;
        if (getNumOfPages() != book.getNumOfPages()) return false;
        if (!getTitle().equals(book.getTitle())) return false;
        if (getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) return false;
        return getPublisher() != null ? getPublisher().equals(book.getPublisher()) : book.getPublisher() == null;
    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + (getPublisher() != null ? getPublisher().hashCode() : 0);
        result = 31 * result + getYearOfPublishment();
        result = 31 * result + getNumOfPages();
        return result;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishment() {
        return yearOfPublishment;
    }

    public void setYearOfPublishment(int yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublishment=" + yearOfPublishment +
                ", numOfPages=" + numOfPages +
                ", price='" + price + '\'' +
                '}';
    }



}
