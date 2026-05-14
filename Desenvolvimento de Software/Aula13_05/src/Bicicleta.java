public class Bicicleta implements Veiculo {
    private String tipo;

    public Bicicleta(String tipo){
        this.tipo = tipo;
    }

   @Override
    public void acelerar(){
        System.out.println("Pedalando mais rápido...");
    }

    @Override
    public void frear(){
        System.out.println("Freiando a bicicleta...");
    }

    @Override
    public String obterTipo(){
        return "Bicicleta";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
