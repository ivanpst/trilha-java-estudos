package br.com.ivan.estudo.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Range {
    int min() default 0;
    int max() default 100;
}
