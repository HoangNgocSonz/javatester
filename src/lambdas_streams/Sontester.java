package lambdas_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sontester {

    public static void main(String[] args){
        List<String> coffees = List.of("Cappuccino", "Americano", "Espresso", "Cortado", "Mocha",
                "Cappuccino", "Flat White", "Latte");
        List<String> coffeesEndingInO = coffees.stream()
                .filter(s -> s.endsWith("o"))
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        coffees.forEach(s->System.out.println(s));
    }
    static void go(List list, int number){
        list.add("Hello");
        number = 2;
    }
}
