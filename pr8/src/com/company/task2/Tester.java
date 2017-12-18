package com.company.task2;

public class Tester {
    public static void main(String[] args) {
        Task2.Counter counter = new Task2.Counter();
        Task2.Printer printer = new Task2.Printer();
         new Thread(counter).start();
        new Thread(printer).start();


    }
}
