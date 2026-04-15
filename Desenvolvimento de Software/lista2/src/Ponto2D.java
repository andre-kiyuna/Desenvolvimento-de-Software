public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(){}
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ponto2D(Ponto2D ponto){
        this.x = ponto.x;
        this.y = ponto.y;
    }

    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x = x;
    }
    
    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y = y;
    }

    public void mover(){
        this.x = 0;
        this.y = 0;
    }
    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void mover(Ponto2D ponto){
        this.x = ponto.x;
        this.y = ponto.y;
    }

    public boolean equals(Ponto2D ponto){
        if(this.x == ponto.x && this.y == ponto.y){
            return true;
        } else{
            return false;
        }
    }

    public String toString(){
        return "Ponto2D: " + "x = " + this.x + " y = " + this.y;
    }
    
    public double calcularDistancia(Ponto2D ponto){
        double distancia = Math.sqrt(Math.pow(this.x - ponto.x, 2) + Math.pow(this.y - ponto.y, 2));
        return distancia;
    }

    public Ponto2D clone(){
        Ponto2D clone = new Ponto2D(this.x, this.y);
        return clone;
    }
}