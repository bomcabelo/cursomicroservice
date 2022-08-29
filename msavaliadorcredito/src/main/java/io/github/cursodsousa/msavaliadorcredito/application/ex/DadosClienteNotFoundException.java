package io.github.cursodsousa.msavaliadorcredito.application.ex;

public class DadosClienteNotFoundException extends Exception {
    public DadosClienteNotFoundException() {
        super("Dados do Cliente não enocntrado par ao CPF informado.");
    }
}
