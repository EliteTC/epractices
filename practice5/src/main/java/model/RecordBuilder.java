package model;

import util.IncorrectValueException;
import view.View;

import static view.Constants.*;

import java.util.Scanner;

public class RecordBuilder {
    private static ResourceManager manager = ResourceManager.INSTANCE;

    public static Record createRecord(){
        Record record = new Record();
        String name = getData(manager.getValue(INPUT_NAME),manager.getValue(CHECK_NAME_REGEX));
        String surname = getData(manager.getValue(INPUT_SURNAME),manager.getValue(CHECK_NAME_REGEX));
        String birthdate = getData(manager.getValue(INPUT_BIRTH_DATE),manager.getValue(CHECK_DATE_REGEX));
        String number = getData(manager.getValue(INPUT_NUMBER),manager.getValue(CHECK_NUMBER_REGEX));
        String address = getData(manager.getValue(INPUT_ADDRESS),manager.getValue(CHECK_ADDRESS_REGEX));

        record.setName(name);
        record.setSurname(surname);
        record.setBirthDate(birthdate);
        record.setNumber(number);
        record.setAddress(address);

        return record;
    }

    private static String getData(String text,String regex){
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                View.print(text);
                String data = sc.nextLine();
                if (data.trim().matches(regex)) return data;
                else throw new IncorrectValueException();
            } catch (IncorrectValueException e) {
                System.out.println(manager.getValue(INCORRECT_INPUT));
            }
        }
    }
}
