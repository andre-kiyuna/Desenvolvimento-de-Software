public class CD extends Produto{
    private int numFaixas;

    public CD(){}

    public CD(String nome, double preco, int numFaixas, String codigo){
        super(nome, preco, codigo);
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString(){
        return "CD: " + super.toString() + ", Faixas: " + numFaixas;
    }
}
