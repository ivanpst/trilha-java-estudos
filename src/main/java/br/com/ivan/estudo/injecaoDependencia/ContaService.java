package br.com.ivan.estudo.injecaoDependencia;

public class ContaService {
    private final TransacaoService transacaoService;

    public ContaService(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    public Conta criarConta(String titular, double saldoInicial) {
        return new Conta(titular, saldoInicial);
    }

    public void exibirSaldo(Conta conta) {
        System.out.println("Saldo atual de " + conta.getTitular() + ": " + conta.getSaldo());
    }

    public void realizarSaque(Conta conta, double valor) {
        transacaoService.sacar(conta, valor);
    }

    public void realizarDeposito(Conta conta, double valor) {
        transacaoService.depositar(conta, valor);
    }
}
