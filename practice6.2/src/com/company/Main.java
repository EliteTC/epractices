package com.company;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = "string";
        System.out.println(s);

        Class<?> clazz = s.getClass();
        Field value = clazz.getDeclaredField("value");
        value.setAccessible(true);
        value.set(s,new char[]{'n','e','w',' ','s','t','r','i','n','g'});

        System.out.println(s);
        System.out.println("string");

        System.out.println("Input line");
        String s2 = new Scanner(System.in).nextLine();
        value.set(s2,new char[]{'n','e','w',' ','s','t','r','i','n','g'});
        System.out.println(s2);
        System.out.println("line");
    }
}
