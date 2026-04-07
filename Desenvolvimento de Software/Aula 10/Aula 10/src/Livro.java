public class Livro extends Produto{
    private String autor;
    
    public Livro(){}

    public Livro(String nome, double preco, String autor, String codigo){
        super(nome, preco, codigo);
        this.autor = autor;
    }

    @Override
    public String toString(){
        return "Livro: " + super.toString() + ", Autor: " + autor;
    }
}