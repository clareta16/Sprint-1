package n1exercici7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {

            List<Object> elements = Arrays.asList("patata", 4, "dos", 120, "emmagatzemar", 3.14);

            List<String> sortedStrings = elements.stream()
                    .filter(e -> e instanceof String)
                    .map(e -> (String) e)
                    .sorted(Comparator.comparingInt(String::length))
                    .toList();


            sortedStrings.forEach(System.out::println);

        }
    }
