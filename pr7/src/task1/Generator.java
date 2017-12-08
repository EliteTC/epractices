package task1;

import java.util.*;

public class Generator {

    public static List<Integer> generateList(int size,int lo,int hi){
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for(int i=0; i < size; i++){
            list.add(lo+rand.nextInt(hi-lo));
        }


        return list;
    }
    public static Set<Integer> generateSet(int size, int lo, int hi){
        Set<Integer> set = new HashSet<>();
        Random rand = new Random();
        for(int i=0; i < size; i++){
            set.add(lo+rand.nextInt(hi-lo));
        }


        return set;
    }
}
