public class Sobremesa extends Alimento {
    String tamanho; // Pequeno-Grande-Medio

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Sobremesa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "\nNome da sobremesa: " + getNome() + "\npreço: " + getPreco() + "tamanho" + tamanho;
    }
}
