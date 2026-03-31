public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int portas;

    public Carro(){} // Contrutor vazio

    public Carro (String tipo, String cor, String placa, int portas){
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.portas = portas;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getPortas(){
        return this.portas;
    }
    public void setPortas(int portas){
        this.portas = portas;
    }

    public String toString(){
        return "Tipo: "+ this.tipo + "\nCor: " + this.cor + "\nPlaca: " + this.placa + "\nPortas: " + this.portas;
    }
}