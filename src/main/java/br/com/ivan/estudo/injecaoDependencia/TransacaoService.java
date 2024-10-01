package br.com.ivan.estudo.injecaoDependencia;

public interface TransacaoService {
    void sacar(Conta conta, double valor);
    void depositar(Conta conta, double valor);
}
