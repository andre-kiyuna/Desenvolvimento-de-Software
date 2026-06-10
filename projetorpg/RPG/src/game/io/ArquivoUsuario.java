package game.io;

import java.io.*;
import java.util.ArrayList;

import game.models.Usuario;

public class ArquivoUsuario {

    private static final String ARQUIVO = "usuarios.csv";

    public static void salvarUsuario(Usuario usuario) {
        try {
            FileWriter fw =new FileWriter(ARQUIVO,true);

            BufferedWriter bw =new BufferedWriter(fw);

            bw.write(
                    usuario.getLogin() + ";" +
                    usuario.getSenhaAtual() + ";" +
                    usuario.getSenhaAntiga1() + ";" +
                    usuario.getSenhaAntiga2() + ";" +
                    usuario.getSenhaAntiga3()
            );
            bw.newLine();
            bw.close();

        } catch (IOException e) {

            System.out.println("Erro ao salvar usuário.");
        }
    }

    public static ArrayList<Usuario>
    carregarUsuarios() {

        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {

            BufferedReader br =new BufferedReader(new FileReader(ARQUIVO));
            String linha;
            while ((linha = br.readLine())
                    != null) {

                String[] dados = linha.split(";", -1);

                Usuario usuario =new Usuario(
                                dados[0],
                                dados[1],
                                dados[2],
                                dados[3],
                                dados[4]);
                usuarios.add(usuario);
            }

            br.close();

        } catch (IOException e) {

            System.out.println(
                    "Arquivo ainda não existe."
            );
        }

        return usuarios;
    }

    public static Usuario buscarUsuario(String login) {

        ArrayList<Usuario> usuarios =
                carregarUsuarios();

        for (Usuario usuario : usuarios) {

            if (usuario.getLogin()
                    .equals(login)) {

                return usuario;
            }
        }

        return null;
    }

    public static void atualizarUsuarios(
            ArrayList<Usuario> usuarios) {

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(
                                    ARQUIVO
                            )
                    );

            for (Usuario usuario : usuarios) {

                bw.write(
                        usuario.getLogin() + ";" +
                        usuario.getSenhaAtual() + ";" +
                        usuario.getSenhaAntiga1() + ";" +
                        usuario.getSenhaAntiga2() + ";" +
                        usuario.getSenhaAntiga3()
                );

                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {

            System.out.println(
                    "Erro ao atualizar usuários."
            );
        }
    }
}
