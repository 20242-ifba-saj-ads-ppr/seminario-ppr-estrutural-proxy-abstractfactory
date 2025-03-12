package pdv.proxy;

import pdv.model.Usuario;

public class PDVProxy implements AcessoPDV {
    private PDVReal pdvReal;
    private Usuario usuario;

    public PDVProxy(Usuario usuario) {
        this.usuario = usuario;
        this.pdvReal = new PDVReal();
    }

    @Override
    public void realizarVenda(double valor) {
        if (usuario.isAutorizado()) {
            pdvReal.realizarVenda(valor);
        } else {
            System.out.println("Acesso negado! Usuário sem permissão para realizar vendas.");
        }
    }
}
