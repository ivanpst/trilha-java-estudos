package br.com.ivan.estudo.reflection.exercicio;

public class Main {
    public static void main(String[] args) throws Exception {
        Departamento departamento = new Departamento();

        System.out.println("Antes da injeção nome: " +  departamento.getNome());
        System.out.println("Antes da injeção descrição: " + departamento.getDescricao());

        MyCustomInjector.injetarDependencias(departamento);

        System.out.println("Depois da injeção nome: " +  departamento.getNome());
        System.out.println("Depois da injeção descrição: " + departamento.getDescricao());

    }
}
