package com.company.task2;

public class Task2 {
   static int iterator = 0;

    static class Counter implements Runnable {
        @Override
        public void run() {
            while (iterator++ != 99) {
            }
        }
    }

    static class Printer implements Runnable {
        @Override
        public void run() {
            while (iterator !=100) {
                System.out.println(iterator);
            }

        }
    }
}
