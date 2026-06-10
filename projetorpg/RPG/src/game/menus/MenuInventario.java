package game.menus;

import java.util.Scanner;
import game.models.Personagem;
import game.models.Pocao;
import game.models.TipoPocao;

public class MenuInventario implements Menu {

    private Personagem personagem;
    private Scanner scanner;

    public MenuInventario(Personagem personagem) {

        this.personagem = personagem;
        scanner = new Scanner(System.in);
    }


    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void exibir() {

        while (true) {

            System.out.println("\n===== INVENTÁRIO =====");

            System.out.println("1 - Usar Poção de Cura");
            System.out.println("2 - Usar Poção de Dano");
            System.out.println("3 - Ver Inventário");
            System.out.println("0 - Voltar");

            System.out.print("Escolha: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:

                    usarPocaoCura();
                    break;

                case 2:

                    usarPocaoDano();
                    break;

                case 3:

                    mostrarInventario();
                    break;

                case 0:

                    return;

                default:

                    System.out.println("Opção inválida!");
            }
        }
    }

    private void usarPocaoCura() {

        Pocao pocao = personagem.getInventario().usarPocao(TipoPocao.CURA);

        if (pocao == null) {

            System.out.println(
                    "Você não possui Poção de Cura!"
            );

            return;
        }

        personagem.setVida(
                personagem.getVida()
                + pocao.getValorEfeito()
        );

        System.out.println(
                "Você recuperou "
                + pocao.getValorEfeito()
                + " de vida!"
        );
    }

    private void usarPocaoDano() {

        Pocao pocao = personagem.getInventario().usarPocao(TipoPocao.DANO);

        if (pocao == null) {

            System.out.println("Você não possui Poção de Dano!");
            return;
        }

        personagem.setBonusDanoTemporario(personagem.getBonusDanoTemporario() + pocao.getValorEfeito()
);

        System.out.println(
                "Dano aumentado em "
                + pocao.getValorEfeito()
                + " nesta batalha!"
        );
    }

    private void mostrarInventario() {

        System.out.println("\n===== ITENS =====");

        System.out.println(
                personagem.getInventario()
        );
    }
}
