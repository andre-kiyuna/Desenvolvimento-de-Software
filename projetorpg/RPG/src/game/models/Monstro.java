package game.models;

import java.util.ArrayList;
import java.util.Random;

public abstract class Monstro extends Combatente {

    private ArrayList<AtaqueMonstro> ataques;

    public Monstro(
            String nome,
            int vida,
            int defesa) {

        super(
                nome,
                vida,
                defesa
        );

        ataques = new ArrayList<>();
    }

    public void adicionarAtaque(
            AtaqueMonstro ataque) {

        ataques.add(ataque);
    }

    public AtaqueMonstro escolherAtaque(
            Random random) {

        int indice =
                random.nextInt(
                        ataques.size()
                );

        return ataques.get(indice);
    }

    public ArrayList<AtaqueMonstro> getAtaques() {
        return ataques;
    }

    @Override
    public void atacar(
        Combatente alvo,
        Random random) {

        AtaqueMonstro ataque =
            escolherAtaque(random);

        System.out.println(
            "\n" + getNome()
            + " usa "
            + ataque.getNome()
        );

        int dado =
            random.nextInt(20) + 1;

        int resultado =
            dado +
            ataque.getBonusAcerto();

        System.out.println(
            "Rolagem: " + dado
        );

        System.out.println(
                "Bônus: +"
                + ataque.getBonusAcerto()
        );

        System.out.println(
                "Resultado: "
                + resultado
        );

        if(resultado >= alvo.getDefesa()) {

            System.out.println(
                    "ACERTOU!"
            );

            int dano =
                    ataque.gerarDano(random);

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

            System.out.println(
                    "ERROU!"
            );
        }
    }
}
