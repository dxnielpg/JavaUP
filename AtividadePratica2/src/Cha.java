public class Cha extends Alimento {
    String temperatura; // Quente ou Frio

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public Cha(String nome, double preco, String temperatura) {
        super(nome, preco);
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "\nNome do alimento: " + getNome() + "\npreço: " + getPreco() + "\nquente ou frio =" + temperatura;
    }
    
    
}
