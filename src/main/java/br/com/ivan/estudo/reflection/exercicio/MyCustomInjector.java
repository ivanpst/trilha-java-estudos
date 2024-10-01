package br.com.ivan.estudo.reflection.exercicio;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MyCustomInjector {
    public static void injetarDependencias(Object object) throws Exception{
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field filed: fields){
            if (filed.isAnnotationPresent(MyCustomInjection.class)){
                filed.setAccessible(true);
                if (filed.get(object) == null){
                    Class<?> fieldType  = filed.getType();
                    Constructor<?> constructor = fieldType.getDeclaredConstructor();
                    Object instance = constructor.newInstance();
                    filed.set(object, instance);
                }
            }
        }

    }
}
