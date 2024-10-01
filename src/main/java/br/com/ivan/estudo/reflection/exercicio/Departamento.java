package br.com.ivan.estudo.reflection.exercicio;

public class Departamento {
    @MyCustomInjection
    private String nome;
    private String descricao;

    public Departamento() {
    }

    public String getNome() {
        System.out.println("Nome: " + nome);
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
