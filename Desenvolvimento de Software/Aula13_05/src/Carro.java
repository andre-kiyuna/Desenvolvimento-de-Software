import java.util.Scanner;

public class Carro implements Veiculo{
    private String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    @Override
    public void acelerar(){
        System.out.println("Qual a intensidade de aceleração");
        Scanner sc = new Scanner(System.in);
        int intensidade = sc.nextInt();
        System.out.println("Acelerando carro na intensidade"+ intensidade + "...");
        sc.close();
    }

    @Override
    public void frear(){
        System.out.println("Freiando carro...");
    }

    @Override
    public String obterTipo(){
        return "Carro";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}