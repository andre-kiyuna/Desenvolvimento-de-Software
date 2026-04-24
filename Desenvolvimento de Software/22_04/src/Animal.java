public class Animal {
   private String nome;
   private int patas;
   private double velocidade;
   private int localizacao = 0;
   
   public Animal (){}

   public Animal(String nome,int patas,double velocidade,int localizacao){
    this.nome = nome;
    this.patas = patas;
    this.velocidade = velocidade;
    this.localizacao = localizacao;
   }

   public String getNome(){
    return this.nome;
    }
   public void setNome(String nome){
    this.nome = nome;
    }

   public int getPatas (){
    return this.patas;
   }
   public void setPatas (int patas){
    this.patas = patas;
   }

   public double getVelocidade (){
    return this.velocidade;
   }
   public void setVelocidade (double velocidade){
    this.velocidade=velocidade;
   }

    public int getLocalizacao() {
    return this.localizacao;
    }
    public void setLocalizacao(int localizacao) {
    this.localizacao = localizacao;
    }
      


   public void mover(){
    System.out.println("Animal ------> "+this.nome);
    this.localizacao++;
   
   }

   public String toString(){
    return "Nome: "+this.nome+"\nPatas: "+this.patas+"\nVelocidade: "+this.velocidade+"\n Localização: "+this.localizacao;
   }

   

   

}