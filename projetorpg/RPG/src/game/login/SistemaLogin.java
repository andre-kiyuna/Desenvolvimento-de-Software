package game.login;

import java.util.ArrayList;
import java.util.Scanner;

import game.io.ArquivoUsuario;
import game.models.Usuario;

public class SistemaLogin {

    private Scanner scanner;

    public SistemaLogin() {
        scanner = new Scanner(System.in);
    }

    public Usuario login() {

        int tentativas = 0;

        while (tentativas < 3) {

            System.out.print("Login: ");
            String login = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            Usuario usuario =
                    ArquivoUsuario.buscarUsuario(login);

            if (usuario != null
                    && usuario.getSenhaAtual().equals(senha)) {

                System.out.println(
                        "\nLogin realizado com sucesso!"
                );

                return usuario;
            }

            tentativas++;

            System.out.println(
                    "\nLogin ou senha incorretos."
            );

            System.out.println(
                    "Tentativas restantes: "
                    + (3 - tentativas)
            );
        }

        System.out.println(
                "\nNúmero máximo de tentativas atingido."
        );

        return null;
    }

    public void cadastrarUsuario() {

        System.out.print("Login: ");
        String login = scanner.nextLine();

        if (ArquivoUsuario.buscarUsuario(login) != null) {

            System.out.println(
                    "Usuário já existe."
            );

            return;
        }

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Usuario usuario =
                new Usuario(login, senha);

        ArquivoUsuario.salvarUsuario(usuario);

        System.out.println(
                "Usuário cadastrado com sucesso!"
        );
    }

    public void alterarSenha(
            Usuario usuario) {

        System.out.print("Nova senha: ");
        String novaSenha = scanner.nextLine();

        if (!usuario.alterarSenha(novaSenha)) {

            System.out.println(
                    "Não é permitido reutilizar as 3 últimas senhas."
            );

            return;
        }

        ArrayList<Usuario> usuarios =
                ArquivoUsuario.carregarUsuarios();

        for (Usuario u : usuarios) {

            if (u.getLogin().equals(
                    usuario.getLogin())) {

                u.setSenhaAtual(
                        usuario.getSenhaAtual());

                u.setSenhaAntiga1(
                        usuario.getSenhaAntiga1());

                u.setSenhaAntiga2(
                        usuario.getSenhaAntiga2());

                u.setSenhaAntiga3(
                        usuario.getSenhaAntiga3());

                break;
            }
        }

        ArquivoUsuario.atualizarUsuarios(
                usuarios);

        System.out.println(
                "Senha alterada com sucesso!"
        );
    }

    public void redefinirSenha() {

        System.out.print("Login: ");
        String login = scanner.nextLine();

        Usuario usuario =
                ArquivoUsuario.buscarUsuario(login);

        if (usuario == null) {

            System.out.println(
                    "Usuário não encontrado."
            );

            return;
        }

        System.out.println(
                "\n=== REDEFINIÇÃO DE SENHA ==="
        );

        System.out.print(
                "Nova senha: "
        );

        String novaSenha =
                scanner.nextLine();

        if (!usuario.alterarSenha(
                novaSenha)) {

            System.out.println(
                    "A senha não pode ser igual às 3 últimas."
            );

            return;
        }

        ArrayList<Usuario> usuarios =
                ArquivoUsuario.carregarUsuarios();

        for (Usuario u : usuarios) {

            if (u.getLogin().equals(login)) {

                u.setSenhaAtual(
                        usuario.getSenhaAtual());

                u.setSenhaAntiga1(
                        usuario.getSenhaAntiga1());

                u.setSenhaAntiga2(
                        usuario.getSenhaAntiga2());

                u.setSenhaAntiga3(
                        usuario.getSenhaAntiga3());

                break;
            }
        }

        ArquivoUsuario.atualizarUsuarios(
                usuarios);

        System.out.println(
                "Senha redefinida com sucesso!"
        );
    }
}