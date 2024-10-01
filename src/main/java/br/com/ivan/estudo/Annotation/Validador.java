package br.com.ivan.estudo.Annotation;

public class Validador {
    public static void validar(Object obj) {
        Class<?> clazz = obj.getClass();
        for (java.lang.reflect.Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Range.class)) {
                Range range = field.getAnnotation(Range.class);
                try {
                    field.setAccessible(true);
                    int valor = (int) field.get(obj);
                    if (valor < range.min() || valor > range.max()) {
                        throw new IllegalArgumentException("Valor fora do range permitido para o campo " + field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
