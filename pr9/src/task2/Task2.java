package task2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task2 {
    static List<Integer> filterByPredicate(Integer[] array, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer integer : array) {
            if(predicate.test(integer))
                filtered.add(integer);
        }
        return filtered;
    }

    static List<String> filterStringsByPrefix(List<String> strings, char startsWith) {
        return strings.stream().filter(x -> x.startsWith(String.valueOf(startsWith))).collect(Collectors.toList());
    }
    static List<String> convertToUpperCase(List<String> strings){
        List<String> converted = new ArrayList<>();
        StringConverter stringConverter = String::toUpperCase;
        for (int i = 0; i < strings.size(); i++) {
            converted.add(stringConverter.convert(strings.get(i)));
        }
        return converted;
    }
    @FunctionalInterface
    interface StringConverter {
        String convert(String s);
        static boolean exists(String s) {
            return s != null;
        }
    }

    static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    static String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }
}
