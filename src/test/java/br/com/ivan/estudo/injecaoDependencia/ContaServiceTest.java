package br.com.ivan.estudo.injecaoDependencia;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ContaServiceTest {

    @Test
    void criarConta() {
        Mockito.mock(TransacaoService.class);
    }

    @Test
    void exibirSaldo() {
    }

    @Test
    void realizarSaque() {
    }

    @Test
    void realizarDeposito() {
    }
}