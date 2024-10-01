package br.com.ivan.estudo.injecaoDependencia;

public class Main {
    public static void main(String[] args) {

        TransacaoService transacaoService = new TransacaoServiceImpl();
        ContaService contaService = new ContaService(transacaoService);

        Conta conta = contaService.criarConta("Maria Silva", 1000.0);
        contaService.exibirSaldo(conta);

        contaService.realizarSaque(conta, 200.0);
        contaService.exibirSaldo(conta);

        contaService.realizarDeposito(conta, 500.0);
        contaService.exibirSaldo(conta);

        contaService.realizarSaque(conta, 1500.0);
        contaService.exibirSaldo(conta);

    }
}