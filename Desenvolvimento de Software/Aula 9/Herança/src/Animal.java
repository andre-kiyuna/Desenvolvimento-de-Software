public class Animal{
    private String nome;
    private float peso;
    private int recinto;
    
    public Animal(String nome, int recinto){
        this.nome = nome;
        this.recinto = recinto;
    }

    public Animal(){}

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void andar(){
        this.recinto++;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }

    public int getRecinto(){
        return this.recinto;
    }
    public void setRecinto(int recinto){
        this.recinto = recinto;
    }
    @Override
    public String toString(){
        return "Animal [Nome=" + nome + ", Peso=" + peso + ", Recinto= " + recinto + "]";
    }
}