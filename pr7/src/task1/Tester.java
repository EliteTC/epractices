package task1;

import java.util.List;
import java.util.Set;

public class Tester {
    public static void main(String[] args) {
        List<Integer> list = Generator.generateList(10,0,10);
        System.out.println(list);

        Set<Integer> set = Generator.generateSet(10,0,10);
        System.out.println(set);
    }

}
