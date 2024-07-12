package n1exercici1;

public class Main1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Arnau", "Alvarez", 20);
        Persona persona2 = new Persona("Arlet", "Alvar", 30);
        Persona persona3 = new Persona("Adrià", "Alvez", 40);


        NoGenericMethods llista1 = new NoGenericMethods(persona1, persona2, persona3);
        NoGenericMethods llista2 = new NoGenericMethods(persona2, persona3, persona1);
        NoGenericMethods llista3 = new NoGenericMethods(persona3, persona1, persona2);


        System.out.println(llista1);
        System.out.println(llista2);
        System.out.println(llista3);

    }

}


