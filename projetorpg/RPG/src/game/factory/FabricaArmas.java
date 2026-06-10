package game.factory;

import game.models.Arma;

public class FabricaArmas {

    public static Arma criarArma(String nome) {

        switch (nome) {

            case "Espada Longa":
                return new Arma(
                        "Espada Longa",
                        8,
                        14,
                        5,
                        19);

            case "Machado Orc":
                return new Arma(
                        "Machado Orc",
                        10,
                        18,
                        3,
                        20);

            case "Cajado Arcano":
                return new Arma(
                        "Cajado Arcano",
                        12,
                        20,
                        4,
                        20);

            case "Grimorio":
                return new Arma(
                        "Grimorio",
                        14,
                        22,
                        2,
                        20);

            case "Arco Curto":
                return new Arma(
                        "Arco Curto",
                        6,
                        12,
                        6,
                        18);

            case "Arco Longo":
                return new Arma(
                        "Arco Longo",
                        8,
                        18,
                        4,
                        19);

            default:
                return null;
        }
    }
}