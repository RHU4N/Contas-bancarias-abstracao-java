public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public double calularTarifaMensal() {
        return 12.00;
    }


}
