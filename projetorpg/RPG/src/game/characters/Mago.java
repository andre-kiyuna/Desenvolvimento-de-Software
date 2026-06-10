package game.characters;

import game.models.Personagem;

import java.util.Random;

import game.models.Arma;
import game.models.Combatente;

public class Mago extends Personagem {

    public Mago(String nome, Arma arma) {
        super(nome, 80, 10, arma);
    }

    // Mago.java
    @Override
    public void atacar(Combatente alvo, Random random) {
        System.out.println("[MAGO] Lança magia!");
        super.atacar(alvo, random);
    }
}
