package br.com.ivan.estudo.proxy;

public class MainProxy {

    public static void main(String[] args) {
        Repository repository = new RepositoryProxy();
        repository.save("Teste");
    }
}
