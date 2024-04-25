import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Alimento> listaAlimento = new ArrayList<>();

    public static void cadastrar(Alimento alimento) {
        listaAlimento.add(alimento);
    }

    public static List<Alimento> getListaAlimento() {
        return listaAlimento;
    }

    public static Alimento buscar(String nome) {
        for (Alimento temp : listaAlimento) {
            if (temp.getNome().equals(nome)) {
                return temp;
            }
        }
        return null;
    }

}