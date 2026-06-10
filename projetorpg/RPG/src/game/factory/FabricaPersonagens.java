package game.factory;

import game.models.*;
import game.characters.*;

public class FabricaPersonagens {

    public static Personagem criarPersonagem(
            String classe,
            String nome,
            Arma arma) {

        switch (classe) {

            case "Guerreiro":
                return new Guerreiro(nome, arma);

            case "Mago":
                return new Mago(nome, arma);

            case "Arqueiro":
                return new Arqueiro(nome, arma);

            default:
                return null;
        }
    }
}