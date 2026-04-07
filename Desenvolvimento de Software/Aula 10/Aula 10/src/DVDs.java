public class DVDs extends Produto{
    private int duracao;

    public DVDs(){}

    public DVDs(String nome, double preco, int duracao, String codigo){
        super(nome, preco, codigo);
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        return "DVD: " + super.toString() + ", Duração: " + duracao;
    }
}
