public class Sobremesa extends Alimento {
    String tipo; // tipo: Sorvete, Brigadeiro, Bolo

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Sobremesa(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    
}
