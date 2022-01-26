public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("\n$== %s ==$\n", Banco.nome);
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
