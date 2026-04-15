public class Contador {
    private int valor;

    public Contador(){};
    public Contador(int valor) {
        this.valor = valor;
    }

    public String getValor(){
        return this.valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }

    public void zerar(){
        this.valor = 0;
    }
    public void incrementar(){
        this.valor++;
    }

    public String toString(){
        return "Valor do contador: " + this.valor;
    }
}