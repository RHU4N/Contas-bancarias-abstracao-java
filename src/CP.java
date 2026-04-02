public class CP extends Conta{

    public CP() {
    }

    public CP(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override
    public void calcularTarifaMensal() {
        IO.println("Conta Poupança mão há desconto tributario");
        exibirSaldo();
    }


}
