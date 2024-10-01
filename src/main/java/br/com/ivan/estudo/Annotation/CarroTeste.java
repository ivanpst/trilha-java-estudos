package br.com.ivan.estudo.Annotation;

public class CarroTeste {
    public static void main(String[] args) {
        CarroAnnotation carro = new CarroAnnotation("Fiat", "Uno", 2024);
        Validador.validar(carro);
        System.out.println("qual é o ano do carro? " + carro.getAno());
    }

}
