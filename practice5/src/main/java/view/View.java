package view;

import model.ResourceManager;

import static view.Constants.*;

public class View {
  private static  ResourceManager manager = ResourceManager.INSTANCE;
    public static void printMenu() {
        System.out.println(manager.getValue(WELCOME_LINE));
        System.out.println(manager.getValue(ADD_RECORD));
        System.out.println(manager.getValue(GET_ALL_RECORDS));
        System.out.println(manager.getValue(CHANGE_LOCALE));
        System.out.println(manager.getValue(EXIT_APPLICATION));
    }
    public static void printLocaleMenu(){
        System.out.println(manager.getValue(LOCALE_ENG));
        System.out.println(manager.getValue(LOCALE_RU));
        System.out.println(manager.getValue(LOCALE_UKR));
    }
    public static void print(Object data){
        System.out.println(data);
    }
}
