package pdv.main;

import pdv.model.Usuario;
import pdv.proxy.AcessoPDV;
import pdv.proxy.PDVProxy;

public class Main {
    public static void main(String[] args) {
        Usuario gerente = new Usuario("Carlos", true);
        Usuario estagiario = new Usuario("Lucas", false);

        AcessoPDV pdvGerente = new PDVProxy(gerente);
        AcessoPDV pdvEstagiario = new PDVProxy(estagiario);

        System.out.println("Tentativa de venda pelo gerente:");
        pdvGerente.realizarVenda(1000.00);

        System.out.println("\nTentativa de venda pelo estagiário:");
        pdvEstagiario.realizarVenda(500.00);
    }
}
