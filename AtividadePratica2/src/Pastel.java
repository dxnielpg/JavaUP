public class Pastel extends Alimento{
    String sabor; // exemplo: Calabresa, Pizza, Carne

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Pastel(String nome, double preco, String sabor) {
        super(nome, preco);
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "\nNome do pastel: " + getNome() + "\npreço: " + getPreco() + "\nsabor do pastel = " + sabor;
    }

    
    
}
