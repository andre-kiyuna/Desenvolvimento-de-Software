package game.enemies;

import game.models.Monstro;
import game.models.AtaqueMonstro;

public class Ogro extends Monstro {

    public Ogro() {

        super("Ogro", 110, 12);

        adicionarAtaque(new AtaqueMonstro("Golpe de Clava", 8, 16, 4));

        adicionarAtaque(new AtaqueMonstro("Pisotear", 6, 12, 5));

        adicionarAtaque(
                new AtaqueMonstro(
                        "Arremesso de Pedra",
                        10,
                        18,
                        2
                )
        );
    }
}
