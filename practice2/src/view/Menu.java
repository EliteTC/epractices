package view;

import dataHolding.DataHolder;
import dataManaging.Controller;
import model.Book;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private static String MENU = "Welcome. \n Choose the function you want to call and press ENTER \n" +
            "0 - Exit the program \n" +
            "1 - Get books by specified author \n" +
            "2 - Get books by specified publisher \n" +
            "3 - Get books that were published after specified year \n" +
            "4 - Order books by publisher \n" +
            "5 - Print all books \n";

    private static Controller controller = new Controller();

    public static void initializeMenu() throws IOException {
        System.out.println(MENU);
        Scanner sc = new Scanner(System.in);
        int functionNumber = sc.nextInt();
        switch(functionNumber){
            case 1 :
                String randomAuthor = DataHolder.getRandomAuthor();
                System.out.println("Searching for books with author "+randomAuthor);
                for(Book b : controller.getBooksByAuthor(randomAuthor)) {
                    if(b != null)
                    System.out.println(b);
                }
                initializeMenu();
                break;
            case 2 :
                String randomPublisher = DataHolder.getRandomPublisher();
                System.out.println("Searching for books with publisher "+randomPublisher);
                for(Book b : controller.getBooksByPublisher(randomPublisher)) {
                    if(b != null)
                    System.out.println(b);
                }
                initializeMenu();
                break;
            case 3 :
                int randomYear = DataHolder.getRandomYear(1990,2025);
                System.out.println("Searching for books published after year "+randomYear);
                for(Book b : controller.getBooksByYearLimit(randomYear)) {
                    if(b != null)
                    System.out.println(b);
                }
                initializeMenu();
                break;
            case 4 :
                controller.sortByPublisher();
                controller.printBooks();
                initializeMenu();
                break;
            case 5:
                controller.printBooks();
                initializeMenu();
                break;
            case 0 : default:
                System.out.println("Exited the program");
                break;

        }
    }
}
