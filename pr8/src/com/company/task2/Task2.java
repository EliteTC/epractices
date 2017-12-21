package com.company.task2;

public class Task2 {
   static final Object lock = new Object();
   static boolean flag = false;
   static int value =0;
    static class Counter implements Runnable {

        @Override
        public void run() {

            while (value != 1_000_000) {
                synchronized (lock) {
                    if(flag) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    value++;
                    flag=!flag;
                    lock.notify();

                }
            }
        }
    }

    static class Printer implements Runnable {

        @Override
        public void run() {

            while (value !=1_000_000) {
                synchronized (lock) {
                    if(!flag) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(value);
                    flag=!flag;
                    lock.notify();
                }
            }

        }
    }
}
