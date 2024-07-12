package n1exercici2;

import n1exercici1.NoGenericMethods;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Rut", "Gràcia", 30);
        String text = "Hola";
        int nombre = 4;

        // Cridar el constructor GenericMethods
        GenericMethods.tipusDiferents(persona, text, nombre);


        // Provar si funcionen la resta de combinacions
        GenericMethods.tipusDiferents(text, nombre, persona);
        GenericMethods.tipusDiferents(nombre, persona, text);

    }
}
