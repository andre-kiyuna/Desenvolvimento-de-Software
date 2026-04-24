public class Anfibio extends Animal {
    public Anfibio(String nome, int patas, double velocidade, int localizacao){
        super(nome,patas,velocidade,localizacao);
    }

    @Override
    public void mover(){
        System.out.println("Anfíbio "+getNome()+ "_  _  _>\n");
        super.setLocalizacao(1);
    }
    
}