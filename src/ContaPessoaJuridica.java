public class ContaPessoaJuridica extends Conta{
    public ContaPessoaJuridica() {
    }

    public ContaPessoaJuridica(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public double calularTarifaMensal() {
        return 20;
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor+1.50);
    }


}
