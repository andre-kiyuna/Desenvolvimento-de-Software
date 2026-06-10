package game.systems;

import java.util.Random;
import game.models.Personagem;
import game.models.Monstro;
import game.models.Pocao;
import game.models.TipoPocao;

public class SistemaCombate {

    private Random random;

    public SistemaCombate() {
        random = new Random();
    }

    public void atacarJogador(Personagem personagem, Monstro monstro) {
        personagem.atacar(monstro, random);
    }

    public void atacarMonstro(Monstro monstro, Personagem personagem) {
        monstro.atacar(personagem, random);
    }

    public boolean personagemVenceu(Monstro monstro) {
        return !monstro.estaVivo();
    }

    public boolean personagemPerdeu(Personagem personagem) {
        return !personagem.estaVivo();
    }

    public void aplicarRecompensa(
        Personagem personagem) {

    switch (personagem.getFaseAtual()) {

        case 1:

            System.out.println("\n=== RECOMPENSAS ===");
            System.out.println("+20 Vida");
            System.out.println("+50 XP");
            System.out.println("+1 Poção de Cura");

            personagem.setVida(
                    personagem.getVida() + 20);
            personagem.ganharExperiencia(50);
            personagem.getInventario().adicionarPocao(new Pocao(TipoPocao.CURA));
            personagem.setFaseAtual(2);
            break;

        case 2:

            System.out.println("\n=== RECOMPENSAS ===");
            System.out.println("+2 Defesa");
            System.out.println("+100 XP");
            System.out.println("+1 Poção de Dano");

            personagem.setDefesa(personagem.getDefesa() + 2);
            personagem.ganharExperiencia(100);
            personagem.getInventario().adicionarPocao(new Pocao(TipoPocao.DANO));
            personagem.setFaseAtual(3);
            break;

        case 3:
            System.out.println("\n=== DRAGÃO DERROTADO ===");
            System.out.println("+250 XP");
            personagem.ganharExperiencia(250);
            personagem.setFaseAtual(1);
            break;
    }

    personagem.setBonusDanoTemporario(0);
}

    public void finalizarDerrota(
            Personagem personagem) {

        personagem.setBonusDanoTemporario(0);
    }
}
