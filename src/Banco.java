import java.util.List;

public abstract class Banco {

    protected static String nome = "DinizBank";
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }
}
