package br.com.ivan.estudo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionCarro {
    public static void main(String[] args) throws Exception {

        Class<?> carroClasse = Class.forName("br.com.ivan.estudo.reflection.Carro");

        System.out.println("Nome da classe: " + carroClasse.getName());

        System.out.println("\nMétodos:");
        for (var metodo : carroClasse.getDeclaredMethods()) {
            System.out.println(metodo.getName());
        }

        System.out.println("\nAtributos:");
        for (Field atributo : carroClasse.getDeclaredFields()){
            System.out.println(atributo.getName());
        }
    }

}
