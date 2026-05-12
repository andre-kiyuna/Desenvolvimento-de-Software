public class Triangulo extends Forma2D{
    private String style;

    public Triangulo(){
        super();
        style = "nada";
    }
    public Triangulo(String s, double w, double h){
        super(w, h, "triangulo");
        style = s;
    }
    //Construtor para lados iguais
    public Triangulo(double x, String nome, String style){
        super(x, nome);
        this.style = style;
    }

    public String getStyle() {return style;}
    public void setStyle(String style) {this.style = style;}

    // Implementar métodos abstratos
    public double area(){
        return (getLargura() * getAltura()) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo [style: " + style + ", Altura: " + getAltura() + ", Largura: " + getLargura()
                + ", Nome: " + getNome() + "]";
    }

}