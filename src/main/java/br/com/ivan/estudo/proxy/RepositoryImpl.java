package br.com.ivan.estudo.proxy;

public class RepositoryImpl implements Repository{
    @Override
    public void save(Object object) {
        System.out.println("Salvando objeto: " + object);
    }
}
