public class Retangulo extends Forma2D{
    // Não tem atributos de classe
    public Retangulo(){
        super();
    };
    public Retangulo(double x){
        super(x, "retangulo quadrado");
    }

    public Retangulo(double a, double l){
        super(a, l, "retangulo");
    }

    public double area(){
        return getAltura() * getLargura();
    }
}
