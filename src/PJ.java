public class PJ extends Conta{

    public PJ() {
    }

    public PJ(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo()-20);
        IO.println("Houve desconto da tarifa mensal");
        exibirSaldo();
    }


}
