public class Circulo extends Forma2D{ // necessário implementar area
    
    public Circulo (double altura, String nome){
        super(altura, nome);
    }
    public Circulo(){}

    public double area(){
        double pi = 3.14;
        double raio = getAltura()/2;
        return (raio* raio)*pi;
    }

    @Override
    public String toString() {
        return "Circulo: [raio "+ (getAltura()/2) + ", diâmetro: "+ getAltura() + "]";
    }

}
