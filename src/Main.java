//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Conta cc = new ContaCorrente("467", "5678", "Jorge", 500);
    Conta cp = new ContaPoupanca("789", "5558", "Maria", 1500);
    Conta pj = new ContaPessoaJuridica("333", "2321", "Empresa Domfins", 2500);


    IO.println("Conta Corrente");
    cp.exibirSaldo();
    cc.depositar(200);
    cp.exibirSaldo();
    cc.sacar(100);
    cc.exibirSaldo();
    System.out.println("Tarifa CC: R$ " + cc.calularTarifaMensal());

    System.out.println("------------------");


    IO.println("Conta Poupança");
    cp.exibirSaldo();
    cp.depositar(300);
    cp.exibirSaldo();
    cp.sacar(50);
    cp.exibirSaldo();
    System.out.println("Tarifa CP: R$ " + cp.calularTarifaMensal());

    System.out.println("------------------");

    IO.println("Conta PJ");
    pj.exibirSaldo();
    pj.depositar(500);
    pj.exibirSaldo();
    pj.sacar(100);
    pj.exibirSaldo();
    System.out.println("Tarifa PJ: R$ " + pj.calularTarifaMensal());

}
