package game.menus;

import java.util.Scanner;

import game.io.ArquivoPersonagem;
import game.models.Personagem;
import game.models.Monstro;
import game.systems.SistemaCombate;

public class MenuCombate implements Menu {

    private Scanner scanner;
    private SistemaCombate sistemaCombate;
    private Personagem personagem;
    private Monstro monstro;
    private String login;

    public MenuCombate(String login, Personagem personagem, Monstro monstro) {
        this.login = login;
        this.personagem = personagem;
        this.monstro = monstro;

        scanner = new Scanner(System.in);
        sistemaCombate = new SistemaCombate();
    }

    @Override
    public void exibir() {
        while (true) {
            System.out.println("\n====================");
            System.out.println("COMBATE");
            System.out.println("====================");
            System.out.println("1 - Atacar");
            System.out.println("2 - Inventário");
            System.out.println("3 - Ver Status");
            System.out.print("Escolha: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    sistemaCombate.atacarJogador(personagem, monstro);
                    if (sistemaCombate.personagemVenceu(monstro)) {
                        System.out.println("\nVocê derrotou "+ monstro.getNome()+ "!");
                        sistemaCombate.aplicarRecompensa(personagem);
                        ArquivoPersonagem.atualizarPersonagem(personagem.getNome(), personagem, login);
                        return;
                    }
                    sistemaCombate.atacarMonstro(monstro,personagem);
                    if (sistemaCombate.personagemPerdeu(personagem)) {
                        System.out.println("\nVocê foi derrotado!");
                        sistemaCombate.finalizarDerrota(personagem);
                        ArquivoPersonagem.atualizarPersonagem(personagem.getNome(), personagem, login);
                        return;
                    }
                    break;

                case 2:
                    MenuInventario menuInventario = new MenuInventario(personagem);
                    menuInventario.exibir();
                    break;

                case 3:
                    exibirStatus();
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void exibirStatus() {
        System.out.println("\n===== STATUS =====");
        System.out.println("Nome: "+ personagem.getNome());
        System.out.println("Classe: "+ personagem.getClass().getSimpleName());
        System.out.println("Vida: "+ personagem.getVida());
        System.out.println("Defesa: "+ personagem.getDefesa());
        System.out.println("XP: "+ personagem.getExperiencia());
        System.out.println("Fase Atual: "+ personagem.getFaseAtual());
        System.out.println("\nArma: "+ personagem.getArma().getNome());
        System.out.println("\nMonstro: "+ monstro.getNome());
        System.out.println("Vida do Monstro: "+ monstro.getVida());
        System.out.println("Defesa do Monstro: "+ monstro.getDefesa());
    }
}
