package game.models;

import java.util.Random;

public class Arma {

    private String nome;
    private int danoMinimo;
    private int danoMaximo;
    private int bonusAcerto;
    private int criticoMinimo;

    public Arma(String nome, int danoMinimo, int danoMaximo, int bonusAcerto, int criticoMinimo) {
        this.nome = nome;
        this.danoMinimo = danoMinimo;
        this.danoMaximo = danoMaximo;
        this.bonusAcerto = bonusAcerto;
        this.criticoMinimo = criticoMinimo;
    }

    public int gerarDano(Random random) {
        return random.nextInt(danoMaximo - danoMinimo + 1) + danoMinimo;
    }

    public boolean ehCritico(int dado) {
        return dado >= criticoMinimo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDanoMinimo() {
        return this.danoMinimo;
    }

    public void setDanoMinimo(int danoMinimo) {
        this.danoMinimo = danoMinimo;
    }

    public int getDanoMaximo() {
        return this.danoMaximo;
    }

    public void setDanoMaximo(int danoMaximo) {
        this.danoMaximo = danoMaximo;
    }

    public int getBonusAcerto() {
        return this.bonusAcerto;
    }

    public void setBonusAcerto(int bonusAcerto) {
        this.bonusAcerto = bonusAcerto;
    }

    public int getCriticoMinimo() {
        return this.criticoMinimo;
    }

    public void setCriticoMinimo(int criticoMinimo) {
        this.criticoMinimo = criticoMinimo;
    }

    @Override
    public String toString() {
        return "Arma: " + this.nome +
                "\nDano: " + this.danoMinimo + "-" + this.danoMaximo +
                "\nBonus Acerto: +" + this.bonusAcerto +
                "\nCrítico: " + this.criticoMinimo + "-20";
    }
}
