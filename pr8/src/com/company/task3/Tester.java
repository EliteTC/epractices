package com.company.task3;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main started");
        Thread[] writers = new Thread[1000];
        for(int i=0; i< 100; i++){
            writers[i] = new Thread(new MapTester.Writer());
            writers[i].start();
          //  writers[i].join();
        }
        Thread[] readers = new Thread[1000];
        long beforeTime = System.currentTimeMillis();
        for(int i=0; i< 100; i++){
            readers[i] = new Thread(new MapTester.Reader());
            readers[i].start();
          //  readers[i].join();
        }

        long afterTime = System.currentTimeMillis();
        long elapsed = (afterTime - beforeTime);
        //System.out.println(Arrays.toString(MapTester.randoms));
        System.out.println(elapsed);
        System.out.println("main ended");
    }
}
