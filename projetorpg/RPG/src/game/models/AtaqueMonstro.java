package game.models;

import java.util.Random;

public class AtaqueMonstro {

    private String nome;
    private int danoMinimo;
    private int danoMaximo;
    private int bonusAcerto;

    public AtaqueMonstro(
            String nome,
            int danoMinimo,
            int danoMaximo,
            int bonusAcerto) {

        this.nome = nome;
        this.danoMinimo = danoMinimo;
        this.danoMaximo = danoMaximo;
        this.bonusAcerto = bonusAcerto;
    }

    public int gerarDano(Random random) {
        return random.nextInt(
                danoMaximo - danoMinimo + 1
        ) + danoMinimo;
    }

    public String getNome() {
        return nome;
    }

    public int getDanoMinimo() {
        return danoMinimo;
    }

    public int getDanoMaximo() {
        return danoMaximo;
    }

    public int getBonusAcerto() {
        return bonusAcerto;
    }

    @Override
    public String toString() {
        return nome + " (" + danoMinimo + "-" + danoMaximo + ")";
    }
}
