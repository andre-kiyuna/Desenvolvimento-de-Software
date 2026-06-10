package game.enemies;

import game.models.Monstro;
import game.models.AtaqueMonstro;

public class Bruxo extends Monstro {

    public Bruxo() {

        super("Bruxo", 100, 14);

        adicionarAtaque(
                new AtaqueMonstro("Raio Sombrio", 8, 14, 6)
        );

        adicionarAtaque(new AtaqueMonstro("Maldição", 6, 12, 7));

        adicionarAtaque(
                new AtaqueMonstro(
                        "Bola das Trevas",
                        10,
                        16,
                        5
                )
        );
    }
}
