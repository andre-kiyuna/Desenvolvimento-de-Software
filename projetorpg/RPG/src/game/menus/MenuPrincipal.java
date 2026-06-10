package game.menus;

import java.util.Scanner;

import game.login.SistemaLogin;
import game.models.Usuario;

public class MenuPrincipal implements Menu {

    private Scanner scanner;
    private SistemaLogin sistemaLogin;

    public MenuPrincipal() {

        scanner = new Scanner(System.in);
        sistemaLogin = new SistemaLogin();
    }

    public void exibir() {

        int opcao;

        do {

            System.out.println("\n===== RPG JAVA =====");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastro");
            System.out.println("3 - Redefinir Senha");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:

                    Usuario usuario =
                            sistemaLogin.login();

                    if (usuario != null) {

                        MenuJogador menuJogador =
                                new MenuJogador(usuario);

                        menuJogador.exibir();
                    }

                    break;

                case 2:

                    sistemaLogin.cadastrarUsuario();

                    break;

                case 3:

                    sistemaLogin.redefinirSenha();

                    break;

                case 0:

                    System.out.println("Encerrando sistema.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
