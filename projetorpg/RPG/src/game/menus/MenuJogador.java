package game.menus;

import java.util.ArrayList;
import java.util.Scanner;

import game.characters.Arqueiro;
import game.characters.Guerreiro;
import game.characters.Mago;
import game.enemies.Bruxo;
import game.enemies.Dragao;
import game.enemies.Ogro;
import game.factory.FabricaArmas;
import game.io.ArquivoPersonagem;
import game.login.SistemaLogin;
import game.models.Arma;
import game.models.Monstro;
import game.models.Personagem;
import game.models.Usuario;

public class MenuJogador implements Menu {

    private Usuario usuario;
    private Scanner scanner;

    public MenuJogador(Usuario usuario) {
        this.usuario = usuario;
        scanner = new Scanner(System.in);
    }

    public void exibir() {

        int opcao;

        do {

            System.out.println("\n===== MENU JOGADOR =====");
            System.out.println("Usuário: " + usuario.getLogin());
            System.out.println("1 - Criar Personagem");
            System.out.println("2 - Meus Personagens");
            System.out.println("3 - Iniciar Campanha");
            System.out.println("4 - Alterar Senha");
            System.out.println("5 - Ranking");
            System.out.println("0 - Logout");
            System.out.print("Opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:
                    criarPersonagem();
                    break;

                case 2:
                    listarPersonagens();
                    break;

                case 3:
                    iniciarCampanha();
                    break;

                case 4:
                    alterarSenha();
                    break;

                case 5:
                    exibirRanking();
                    break;

                case 0:
                    System.out.println("Logout realizado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private void criarPersonagem() {

        System.out.print("\nNome do personagem: ");
        String nome = scanner.nextLine();

        System.out.println("\nClasse:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        System.out.print("Escolha: ");

        int classe = Integer.parseInt(scanner.nextLine());

        Personagem personagem = null;
        Arma arma = null;

        switch (classe) {

            case 1:

                System.out.println("\n1 - Espada Longa");
                System.out.println("2 - Machado Orc");
                System.out.print("Arma: ");

                int armaGuerreiro =
                        Integer.parseInt(scanner.nextLine());

                if (armaGuerreiro == 1) {
                    arma = FabricaArmas.criarArma("Espada Longa");
                } else {
                    arma = FabricaArmas.criarArma("Machado Orc");
                }

                personagem =
                        new Guerreiro(nome, arma);

                break;

            case 2:

                System.out.println("\n1 - Cajado Arcano");
                System.out.println("2 - Grimorio");
                System.out.print("Arma: ");

                int armaMago =
                        Integer.parseInt(scanner.nextLine());

                if (armaMago == 1) {
                    arma = FabricaArmas.criarArma("Cajado Arcano");
                } else {
                    arma = FabricaArmas.criarArma("Grimorio");
                }

                personagem =
                        new Mago(nome, arma);

                break;

            case 3:

                System.out.println("\n1 - Arco Curto");
                System.out.println("2 - Arco Longo");
                System.out.print("Arma: ");

                int armaArqueiro =
                        Integer.parseInt(scanner.nextLine());

                if (armaArqueiro == 1) {
                    arma = FabricaArmas.criarArma("Arco Curto");
                } else {
                    arma = FabricaArmas.criarArma("Arco Longo");
                }

                personagem =
                        new Arqueiro(nome, arma);

                break;

            default:

                System.out.println("Classe inválida.");
                return;
        }

        ArquivoPersonagem.salvarPersonagem(usuario.getLogin(),personagem);
        System.out.println("\nPersonagem criado com sucesso!");
        
    }

    private void listarPersonagens() {
        ArrayList<String[]> personagens = ArquivoPersonagem.buscarPersonagens(usuario.getLogin());

        if (personagens.isEmpty()) {
            System.out.println("\nNenhum personagem encontrado.");
            return;
        }

        System.out.println("\n===== PERSONAGENS =====");

        for (String[] personagem : personagens) {

            System.out.println(
                    "Nome: " + personagem[1]
                    + " | Classe: " + personagem[2]
                    + " | XP: " + personagem[6]
                    + " | Fase: " + personagem[5]
            );
        }
    }

    private void iniciarCampanha() {
        System.out.print("\nDigite o nome do personagem: ");
        String nome = scanner.nextLine();
        Personagem personagem = ArquivoPersonagem.carregarPersonagem(usuario.getLogin(), nome);

        if (personagem == null) {
            System.out.println("Personagem não encontrado.");
            return;
        }
        Monstro monstro;

        switch (personagem.getFaseAtual()) {
            case 1:
                monstro = new Ogro();
                break;

            case 2:
                monstro = new Bruxo();
                break;

            case 3:
                monstro = new Dragao();
                break;

            default:
                System.out.println("Fase inválida.");
                return;
        }
        MenuCombate menuCombate = new MenuCombate(usuario.getLogin(), personagem, monstro);

        menuCombate.exibir();
    }

    private void alterarSenha() {
        SistemaLogin sistemaLogin = new SistemaLogin();
        sistemaLogin.alterarSenha(usuario);
    }

    private void exibirRanking() {

    ArrayList<String[]> personagens = ArquivoPersonagem.carregarDados();

    if (personagens.isEmpty()) {
        System.out.println("\nNenhum personagem cadastrado.");
        return;
    }

    personagens.sort((p1, p2) ->Integer.parseInt(p2[6])- Integer.parseInt(p1[6]));

    System.out.println("\n===== RANKING =====");

    int posicao = 1;

    for (String[] personagem : personagens) {
        System.out.println(
                posicao + "º - "
                + personagem[1]
                + " | XP: "
                + personagem[6]
            );
        posicao++;
        }
    }
}