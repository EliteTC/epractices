package com.company.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class MapTester {
    private static final int SIZE = 1_000_000;
    private static Map<Integer,Integer> map = new HashMap<>(100000,0.7f);
  //  private static Map<Integer,Integer> map = new ConcurrentHashMap<>(100000,0.7f);

    static class Reader implements Runnable{
        @Override
        public void run() {
            for(int i=0; i< SIZE ;i++){
                map.put(i,randoms[i]);
            }
        }
    }
    static class Writer implements Runnable{
        @Override
        public void run() {
            for(int i=0; i< SIZE ;i++){
                map.get(i);
            }
        }
    }

    static int[] randoms = generateValues(SIZE);
    private static int[] generateValues(int size){
        int[] randoms = new int[size];
        for(int i=0; i < size; i++){
            randoms[i] = new Random().nextInt();
        }
        return randoms;
    }
 }
