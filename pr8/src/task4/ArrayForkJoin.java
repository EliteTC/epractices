package task4;

import java.util.Random;
import java.util.concurrent.RecursiveTask;

public class ArrayForkJoin {
    static int[] array = new int[1_000_000];
    static{
        Random rand = new Random();
        for(int i=0; i<1_000_000;i++){
            array[i] = rand.nextInt(101);
        }
    }
     static long N = 1_000_000;
     static final int NUM_THREADS = 8;
    static class RecSumOfArray extends RecursiveTask<Long>{
        int from,to;

        public RecSumOfArray(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if((to-from) <= 20){
                long localSum =0;
                for(int i=from; i<=to; i++){
                    localSum+=array[i];
                }
                System.out.printf("\t Summing of range %d to %d is %d %n",from,to,localSum);
                return localSum;
            } else {
                int mid = (from+to)/2;
                System.out.printf("Forking into two ranges: %d to %d and %d to %d %n",from,mid,mid,to);
                RecSumOfArray firstHalf = new RecSumOfArray(from,mid);
                firstHalf.fork();
                RecSumOfArray secondHalf = new RecSumOfArray(mid+1,to);
                long resultSecond = secondHalf.compute();
                return firstHalf.join() + resultSecond;
            }

        }
    }
}
