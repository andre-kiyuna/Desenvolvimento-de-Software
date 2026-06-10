package game.characters;

import game.models.Personagem;

import java.util.Random;

import game.models.Arma;
import game.models.Combatente;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, Arma arma) {
        super(nome, 120, 18, arma);
    }

    @Override
    public void atacar(Combatente alvo, Random random) {
        System.out.println("[GUERREIRO] Golpe poderoso!");
        super.atacar(alvo, random);
    }
  
}
