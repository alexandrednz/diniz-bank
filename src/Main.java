public class Main {
    public static void main(String[] args) {

        // Criando um novo cliente
        Cliente alexandre = new Cliente();
        alexandre.setNome("Alexandre Diniz de Souza");

        Conta corrente = new ContaCorrente(alexandre);// Criando uma nova conta corrente para o cliente
        Conta poupanca = new ContaPoupanca(alexandre);// Criando uma nova conta poupança para o cliente

        // Operações para testar os métodos
        corrente.depositar(100);
        corrente.depositar(50);
        corrente.sacar(50);
        corrente.transferir(poupanca, 100.00);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
