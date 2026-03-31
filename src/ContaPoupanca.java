public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
    }

    public ContaPoupanca(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public double calularTarifaMensal() {
        return 0;
    }

}
