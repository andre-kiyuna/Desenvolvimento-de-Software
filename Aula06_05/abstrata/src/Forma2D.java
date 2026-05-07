public abstract class Forma2D {
    private double largura;
    private double altura;
    private String nome;

    public Forma2D(){
        this.altura = this.largura = 0.0;
        this.nome = "nada";
    }
    public Forma2D(double w, double h, String n){
        this.largura = w;
        this.altura = h;
        this.nome = n;
    }
    // Todos os lados iguais
    public Forma2D(double x, String nome){
        this.altura = this.largura = x;
        this.nome = nome;
    }

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public double getLargura() {return largura;}
    public void setLargura(double largura) {this.largura = largura;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    //Método abstract
    public abstract double area();

    @Override
    public String toString() {
        return "Forma2D [largura: " + largura + ", altura: " + altura + ", nome: " + nome + "]";
    }
}
