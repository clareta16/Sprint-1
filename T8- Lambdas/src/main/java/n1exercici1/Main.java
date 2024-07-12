package n1exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> paraules = Arrays.asList("hola", "Clara", "explicació", "bombo", "programació", "port", "exercici");

        // Es filtren les paraules i torna les que contenen la lletra o
        List<String> paraulesAmbO = filterStringsContainingO(paraules);

        for (String wordO : paraulesAmbO) {
            System.out.println(wordO);
        }

    }

    public static List<String> filterStringsContainingO(List<String> paraules) {
        return paraules.stream() // converteix la llista de paraules en un flux
                .filter(s -> s.contains("o")) // paràmetre -> expressió
                // aplica un filtre al flux, deixant passar només les cadenes amb o

                .collect(Collectors.toList());
        // posa les paraules amb o a una llista
    }
}

