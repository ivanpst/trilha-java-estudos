package br.com.ivan.estudo.reflection;

import br.com.ivan.estudo.reflection.Carro;

import java.lang.reflect.Field;

public class MyCarro {
    public static void main(String[] args) throws Exception {

        Carro carro = new Carro("Chevrolet", "Onix", 2021);
        System.out.println(carro.getMarca());

        Class<?> classeCarro = carro.getClass();

        Field field = classeCarro.getDeclaredField("marca");
        field.setAccessible(true);
        field.set(carro, "Honda");
        System.out.println(carro.getMarca());
    }

}
