package game.models;

import java.util.Random;

public abstract class Combatente {

    private String nome;
    private int vida;
    private int defesa;

    public abstract void atacar(
        Combatente alvo,
        Random random
    );

    public Combatente(String nome, int vida, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
    }

    public Combatente() {}

    public void receberDano(int dano) {
        this.vida -= dano;

        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
               "\nVida: " + vida +
               "\nDefesa: " + defesa;
    }
}
