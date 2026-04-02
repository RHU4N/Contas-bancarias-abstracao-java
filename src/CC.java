public class CC extends Conta{
    public CC() {
    }

    public CC(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo()-12);
        IO.println("Houve desconto da tarifa mensal");
        exibirSaldo();
    }


}
