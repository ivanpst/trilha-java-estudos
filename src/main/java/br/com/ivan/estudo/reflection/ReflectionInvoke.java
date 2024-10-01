package br.com.ivan.estudo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionInvoke {
    public static void main(String[] args) throws Exception {
        Class<?> carroClasse = Class.forName("br.com.ivan.estudo.reflection.Carro");
        Constructor<?> constructor = carroClasse.getConstructor(String.class, String.class, int.class);
        Object carro = constructor.newInstance("Chevrolet", "Onix", 2021);

        Method metodoGetMarca = carroClasse.getDeclaredMethod("getMarca");
        metodoGetMarca.invoke(carro);

    }

}

