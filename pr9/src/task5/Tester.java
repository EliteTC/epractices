package task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(10, i -> i + 10).limit(10).map(i -> i / 2).collect(Collectors.toList());
        System.out.println("Task 5.1 : "+numbers);

        List<Person> persons = Arrays.asList(
                new Person("Johnny",17, "M"),
                new Person("Tommy",25, "M"),
                new Person("Kate",17, "F"),
                new Person("Melissa",29, "F")
        );

        System.out.println("Armyable guys: ");
        persons.stream().filter(p -> p.getAge() >= 18 && p.getSex() == "M").forEach(System.out::println);

        System.out.print("Females average age: ");
        System.out.println(persons.stream().filter(x -> x.getSex() == "F").mapToInt(Person::getAge).average().getAsDouble());

    }
}

