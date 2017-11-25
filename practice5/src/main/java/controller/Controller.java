package controller;

import model.Database;
import model.RecordBuilder;
import model.ResourceManager;
import util.IncorrectValueException;
import view.Constants;
import view.View;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Controller {
    private static Database db = Database.INSTANCE;
    private static ResourceManager manager = ResourceManager.INSTANCE;

    public  void menu() {
        View.printMenu();
        switch (getUserInput()) {
            case 1:
                db.addRecord(RecordBuilder.createRecord());
                menu();
                break;
            case 2:
                View.print(db.getAllRecords());
                menu();
                break;
            case 3:
                View.printLocaleMenu();
                manager.changeResource(new Locale(chooseLocale()));
                menu();
                break;
            case 4: default:
                break;

        }
    }



    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int com = sc.nextInt();
                if (com < 1 || com > 4)
                    throw new IncorrectValueException();
                return com;
            } catch (IncorrectValueException e) {
                System.out.println(manager.getValue(Constants.INCORRECT_INPUT) +"\n");
            }
        }
    }

    public static String chooseLocale() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String com = sc.nextLine();
                if ((com.equals("ru") || com.equals("en") || com.equals("ua")))
                    return com;
                else
                    throw new IOException(manager.getValue(Constants.INCORRECT_INPUT));
            } catch (IOException exp) {
                System.out.println(exp.getMessage());
            }
        }
    }
}