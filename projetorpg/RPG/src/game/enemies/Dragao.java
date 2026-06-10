package game.enemies;

import game.models.Monstro;
import game.models.AtaqueMonstro;

public class Dragao extends Monstro {

    public Dragao() {

        super("Dragão", 160, 18);

        adicionarAtaque(
                new AtaqueMonstro("Mordida", 12, 20, 6)
        );

        adicionarAtaque(
                new AtaqueMonstro(
                        "Garrada",
                        10,
                        18,
                        7
                )
        );

        adicionarAtaque(
                new AtaqueMonstro(
                        "Sopro de Fogo",
                        15,
                        25,
                        5
                )
        );
    }
}
