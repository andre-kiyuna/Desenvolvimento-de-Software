package game.models;

public class Pocao {

    private TipoPocao tipo;
    private int valorEfeito;

    public Pocao(TipoPocao tipo) {
        this.tipo = tipo;

        if (tipo == TipoPocao.CURA) {
            this.valorEfeito = 30;
        } else {
            this.valorEfeito = 5;
        }
    }

    public TipoPocao getTipo() {
        return tipo;
    }

    public int getValorEfeito() {
        return valorEfeito;
    }

    @Override
    public String toString() {
        return tipo + " (" + valorEfeito + ")";
    }
}
