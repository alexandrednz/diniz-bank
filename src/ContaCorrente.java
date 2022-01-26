public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("\n$== %s ==$\n", Banco.nome);
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
