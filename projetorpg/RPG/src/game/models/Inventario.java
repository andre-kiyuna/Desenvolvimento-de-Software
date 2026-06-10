package game.models;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Pocao> pocoes;

    public Inventario() {
        pocoes = new ArrayList<>();
    }

    public void adicionarPocao(Pocao pocao) {
        pocoes.add(pocao);
    }

    public ArrayList<Pocao> getPocoes() {
        return pocoes;
    }

    public Pocao usarPocao(TipoPocao tipo) {

        for (int i = 0; i < pocoes.size(); i++) {

            if (pocoes.get(i).getTipo() == tipo) {

                return pocoes.remove(i);
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return pocoes.toString();
    }
}
