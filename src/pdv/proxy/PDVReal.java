package pdv.proxy;

public class PDVReal implements AcessoPDV {
    @Override
    public void realizarVenda(double valor) {
        System.out.println("Venda registrada no PDV. Valor: R$ " + valor);
    }
}
