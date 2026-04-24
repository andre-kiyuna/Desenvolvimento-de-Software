public class Passaro extends Animal {
    public Passaro (String nome, int patas, double velocidade,int localizacao){
        super(nome,patas,velocidade,localizacao);
    }

    @Override
    public void mover(){
        System.out.println( "Passaro "+getNome()+" voando ' ' ' ' ' ' ' ' ' ' ' ' ' '");
        super.setLocalizacao(1);
    }
}