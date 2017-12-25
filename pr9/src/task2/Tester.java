package task2;

import java.util.*;

import static task2.Task2.*;

public class Tester {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[100];
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(100);
            strings.add(randomString(10));
        }

        System.out.println("Initial numbers: " + Arrays.toString(numbers));
        System.out.println("Initial strings " + strings);

        Arrays.sort(numbers,(fst,snd) -> (fst.compareTo(snd)));
        Collections.sort(strings,(fst, snd) -> (snd.compareTo(fst)));

        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        System.out.println("Sorted strings: " + strings);


        System.out.println("Get pair numbers : " + filterByPredicate(numbers, x -> x%2 == 0));
        System.out.println("Get strings with prefix 'n' : " + filterStringsByPrefix(strings, 'n'));

        System.out.println("Converted to upper case: "+ convertToUpperCase(strings));

    }



}
