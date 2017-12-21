package task4;

import java.util.concurrent.ForkJoinPool;

public class Tester {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(ArrayForkJoin.NUM_THREADS);
        long computedSum = pool.invoke(new ArrayForkJoin.RecSumOfArray(0,(int)ArrayForkJoin.N-1));
        System.out.println(computedSum);
    }
}
