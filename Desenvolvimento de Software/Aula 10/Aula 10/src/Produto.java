public class Produto {
    private String nome;
    private double preco;
    private String codigo;

    public Produto(){}

    public Produto(String nome, double preco, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: " + preco;
    }
}
