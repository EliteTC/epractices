package task2;

import java.util.Arrays;

public class PerfectNumbersGenerator {

    private static int[] checkRange(int maxValue){
        int [] perfections = new int[10];
        int index =0;
        for(int i=2; i<= maxValue ; i++){
            if(CheckPerfection.check(i)) {
                perfections[index++] = i;
             //   System.out.println(perfections[index-1]);

            }

        }
        int [] compressed = Arrays.copyOfRange(perfections,0,index);
        return compressed;
    }

    public static void getPerfectNumbers(int maxValue){
        System.out.println(Arrays.toString(checkRange(maxValue)));
    }

}
