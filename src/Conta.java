public abstract class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private String titular;

    public Conta() {
    }

    public Conta(int numero, int agencia, double saldo, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double depositar(double valor){
        if(valor > 0){
            return this.saldo += valor;
        }
        else{
            IO.println("Valor errado");
            return saldo;
        }
    }

    public double sacar(double valor){
        if(valor > 0 && saldo >= valor){
            return this.saldo -= valor;
        }else {
            IO.println("Saldo insuficiente");
            return saldo;
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }

    public abstract void calcularTarifaMensal();
}
