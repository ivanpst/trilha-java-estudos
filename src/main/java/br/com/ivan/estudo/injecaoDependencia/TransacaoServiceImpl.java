package br.com.ivan.estudo.injecaoDependencia;

public class TransacaoServiceImpl implements TransacaoService{

    @Override
    public void sacar(Conta conta, double valor) {
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }
}
