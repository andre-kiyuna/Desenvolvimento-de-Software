package game.io;

import java.io.*;
import java.util.ArrayList;

import game.models.Arma;
import game.models.Inventario;
import game.models.Personagem;
import game.models.Pocao;
import game.models.TipoPocao;
import game.factory.FabricaArmas;
import game.factory.FabricaPersonagens;

public class ArquivoPersonagem {

    private static final String ARQUIVO =
            "personagens.csv";

    public static void salvarPersonagem(
            String login,
            Personagem personagem) {

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(
                                    ARQUIVO,
                                    true
                            )
                    );

            bw.write(
                    login + ";" +
                    personagem.getNome() + ";" +
                    personagem.getClass()
                            .getSimpleName() + ";" +
                    personagem.getVida() + ";" +
                    personagem.getDefesa() + ";" +
                    personagem.getFaseAtual() + ";" +
                    personagem.getExperiencia() + ";" +
                    personagem.getArma().getNome() + ";" +
                    serializarInventario(
                            personagem.getInventario()
                    )
            );

            bw.newLine();

            bw.close();

        } catch (IOException e) {

            System.out.println(
                    "Erro ao salvar personagem."
            );
        }
    }

    private static String serializarInventario(
            Inventario inventario) {

        StringBuilder sb =
                new StringBuilder();

        for (Pocao pocao :
                inventario.getPocoes()) {

            if (sb.length() > 0) {

                sb.append("|");
            }

            sb.append(
                    pocao.getTipo()
            );
        }

        return sb.toString();
    }

    public static ArrayList<String[]>
    carregarDados() {

        ArrayList<String[]> dados =
                new ArrayList<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(
                                    ARQUIVO
                            )
                    );

            String linha;

            while ((linha =
                    br.readLine()) != null) {

                dados.add(
                        linha.split(
                                ";",
                                -1
                        )
                );
            }

            br.close();

        } catch (IOException e) {

            System.out.println(
                    "Arquivo não encontrado."
            );
        }

        return dados;
    }

    public static ArrayList<String[]>
    buscarPersonagens(
            String login) {

        ArrayList<String[]> personagens =
                new ArrayList<>();

        ArrayList<String[]> dados =
                carregarDados();

        for (String[] linha : dados) {

            if (linha[0].equals(login)) {

                personagens.add(linha);
            }
        }

        return personagens;
    }

    public static Personagem
    carregarPersonagem(
            String login,
            String nomePersonagem) {

        ArrayList<String[]> dados =
                carregarDados();

        for (String[] linha : dados) {

            if (linha[0].equals(login)
                    &&
                    linha[1].equals(
                            nomePersonagem
                    )) {

                String classe =
                        linha[2];

                Arma arma =
                        FabricaArmas.criarArma(
                                linha[7]
                        );

                if (arma == null) {

                    return null;
                }

                Personagem personagem =
                        FabricaPersonagens
                                .criarPersonagem(
                                        classe,
                                        linha[1],
                                        arma
                                );

                if (personagem == null) {

                    return null;
                }

                personagem.setVida(
                        Integer.parseInt(
                                linha[3]
                        )
                );

                personagem.setDefesa(
                        Integer.parseInt(
                                linha[4]
                        )
                );

                personagem.setFaseAtual(
                        Integer.parseInt(
                                linha[5]
                        )
                );

                personagem.setExperiencia(
                        Integer.parseInt(
                                linha[6]
                        )
                );

                // INVENTÁRIO

                if (linha.length > 8
                        &&
                        !linha[8].isEmpty()) {

                    String[] pocoes =
                            linha[8]
                                    .split("\\|");

                    for (String tipo :
                            pocoes) {

                        personagem
                                .getInventario()
                                .adicionarPocao(
                                        new Pocao(
                                                TipoPocao.valueOf(
                                                        tipo
                                                )
                                        )
                                );
                    }
                }

                return personagem;
            }
        }

        return null;
    }

    public static void removerPersonagem(
            String login,
            String nomePersonagem) {

        ArrayList<String[]> dados =
                carregarDados();

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(
                                    ARQUIVO
                            )
                    );

            for (String[] linha :
                    dados) {

                boolean ehPersonagem =
                        linha[0].equals(login)
                        &&
                        linha[1].equals(
                                nomePersonagem
                        );

                if (!ehPersonagem) {

                    bw.write(
                            String.join(
                                    ";",
                                    linha
                            )
                    );

                    bw.newLine();
                }
            }

            bw.close();

        } catch (IOException e) {

            System.out.println(
                    "Erro ao remover personagem."
            );
        }
    }

    public static void atualizarPersonagem(
            String nomePersonagem,
            Personagem personagem,
            String login) {

        ArrayList<String[]> dados =
                carregarDados();

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(
                                    ARQUIVO
                            )
                    );

            for (String[] linha :
                    dados) {

                boolean ehPersonagem =
                        linha[0].equals(login)
                        &&
                        linha[1].equals(
                                nomePersonagem
                        );

                if (ehPersonagem) {

                    bw.write(
                            login + ";" +
                            personagem.getNome() + ";" +
                            personagem.getClass()
                                    .getSimpleName() + ";" +
                            personagem.getVida() + ";" +
                            personagem.getDefesa() + ";" +
                            personagem.getFaseAtual() + ";" +
                            personagem.getExperiencia() + ";" +
                            personagem.getArma().getNome() + ";" +
                            serializarInventario(
                                    personagem.getInventario()
                            )
                    );

                } else {

                    bw.write(
                            String.join(
                                    ";",
                                    linha
                            )
                    );
                }

                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {

            System.out.println(
                    "Erro ao atualizar personagem."
            );
        }
    }
}