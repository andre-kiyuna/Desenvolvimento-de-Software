package game.models;

import java.util.Random;

public abstract class Personagem extends Combatente {

    private Arma arma;
    private Inventario inventario;
    private int experiencia;
    private int vitorias;
    private int derrotas;
    private int faseAtual;
    private int bonusDanoTemporario;

    public Personagem(String nome, int vida, int defesa, Arma arma) {
        super(nome, vida, defesa);

        this.arma = arma;
        this.inventario = new Inventario();
        this.experiencia = 0;
        this.vitorias = 0;
        this.derrotas = 0;
        this.faseAtual = 1;
        this.bonusDanoTemporario = 0;
    }
    
    

    @Override
    public void atacar(
            Combatente alvo,
            Random random) {

        System.out.println(
                "\n" + getNome()
                + " ataca com "
                + getArma().getNome()
        );

        int dado = random.nextInt(20) + 1;

        int resultado =
                dado +
                getArma().getBonusAcerto();

        System.out.println(
                "Rolagem: " + dado
        );

        System.out.println(
                "Bônus: +" +
                getArma().getBonusAcerto()
        );

        System.out.println(
                "Resultado: " + resultado
        );

        if (resultado >= alvo.getDefesa()) {

            System.out.println("ACERTOU!");

            int dano =
                    getArma().gerarDano(random)
                    + getBonusDanoTemporario();

            if (getArma().ehCritico(dado)) {

                dano *= 2;

                System.out.println(
                        "CRÍTICO!"
                );
            }

            alvo.receberDano(dano);

            System.out.println(
                    "Dano causado: "
                    + dano
            );

            System.out.println(
                    alvo.getNome()
                    + " ficou com "
                    + alvo.getVida()
                    + " HP"
            );

        } else {

            System.out.println("ERROU!");
        }
    }

    public void ganharExperiencia(int xp) {
        experiencia += xp;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getFaseAtual() {
        return faseAtual;
    }

    public void setFaseAtual(int faseAtual) {
        this.faseAtual = faseAtual;
    }

    public int getBonusDanoTemporario() {
        return bonusDanoTemporario;
    }

    public void setBonusDanoTemporario(int bonusDanoTemporario) {
        this.bonusDanoTemporario = bonusDanoTemporario;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nClasse: " + getClass().getSimpleName() +
                "\nArma: " + arma.getNome() +
                "\nXP: " + experiencia +
                "\nVitórias: " + vitorias +
                "\nDerrotas: " + derrotas +
                "\nFase Atual: " + faseAtual;
    }
}
