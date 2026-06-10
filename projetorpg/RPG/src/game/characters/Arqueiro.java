package game.characters;

import game.models.Personagem;

import java.util.Random;

import game.models.Arma;
import game.models.Combatente;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome, Arma arma) {
        super(nome, 100, 16, arma);
    }

    // Arqueiro.java
    @Override
    public void atacar(Combatente alvo, Random random) {
        System.out.println("[ARQUEIRO] Dispara flecha!");
        super.atacar(alvo, random);
    }
}
