//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
     CC cc = new CC(178,23,1200,"José");
     CP cp = new CP(211,43,2000,"Nicolly");
     PJ pj = new PJ(231,12,2300,"Heitor");

    IO.println("Conta Corrente:");
    cc.exibirSaldo();
    cc.depositar(200);
    cc.exibirSaldo();
    cc.sacar(250);
    cc.exibirSaldo();
    cc.calcularTarifaMensal();

    IO.println("================");
    IO.println("Conta Poupanca:");
    cp.exibirSaldo();
    cp.depositar(200);
    cp.exibirSaldo();
    cp.sacar(250);
    cp.exibirSaldo();
    cp.calcularTarifaMensal();

    IO.println("================");
    IO.println("Pesso Juridica:");
    pj.exibirSaldo();
    pj.depositar(200);
    pj.exibirSaldo();
    pj.sacar(2550);
    pj.exibirSaldo();
    pj.calcularTarifaMensal();

}
