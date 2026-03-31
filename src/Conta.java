public abstract class Conta {
    private String numero;
    private String agencia;
    private String titular;
    private double saldo;

    public Conta() {
    }

    public Conta(String numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        IO.println("Depositado com sucesso!");
    }

    public void sacar(double valor){

        if (saldo >= valor){
            saldo -= valor;
            IO.println("Sacado com sucesso!");
        }
        else {
            IO.println("Saldo insuficiente!");
        }

    }

    public void exibirSaldo(){
        IO.println("Saldo: " + saldo);
    }

    public abstract double calularTarifaMensal();





}
