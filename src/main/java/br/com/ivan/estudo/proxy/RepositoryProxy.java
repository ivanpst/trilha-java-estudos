package br.com.ivan.estudo.proxy;

public class RepositoryProxy  implements Repository{

    private final Repository repository = new RepositoryImpl();
    @Override
    public void save(Object object) {
        System.out.println("Criando transação");

        repository.save(object);

        System.out.println("Comitando transação");
    }
}
