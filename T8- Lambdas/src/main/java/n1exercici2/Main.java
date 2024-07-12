package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> paraules = Arrays.asList("hola", "Clara", "bombo", "programació", "port", "exercici");
        Predicate<String> conteO = c -> c.toLowerCase().contains("o");
        Predicate<String> mesDe5Lletres = c -> c.length() > 5;

        paraules.stream()
                .filter(conteO.and(mesDe5Lletres))

                .forEach(l -> System.out.print(l + "\n"));

    }
}

