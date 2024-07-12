package n1exercici2;

import java.util.Scanner;

public class CalculoDni {

    private static char[] lletresDNI= { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F',
            'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

    public static char calcularLletraDni(int dni){
        char lletra = lletresDNI[dni % 23];
        return lletra;
    }
}