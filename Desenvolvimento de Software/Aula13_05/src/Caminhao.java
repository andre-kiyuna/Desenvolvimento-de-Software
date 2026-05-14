import java.util.Scanner;

public class Caminhao implements Veiculo {
    private int capacidaDeCarga;

    public Caminhao(int capacidaDeCarga){
        this.capacidaDeCarga = capacidaDeCarga;
    }

    @Override
    public void acelerar() {
       System.out.println("Qual a intensidade de aceleração");
        Scanner sc = new Scanner(System.in);
        int intensidade = sc.nextInt();
        System.out.println("Acelerando caminhão na intensidade"+ intensidade + "...");
        sc.close();
    }

    @Override
    public void frear() {
        System.out.println("Freando Caminhão...");
    }

    @Override
    public String obterTipo() {
        return "Caminhão";
    }

    public int getCapacidaDeCarga() {
        return capacidaDeCarga;
    }

    public void setCapacidaDeCarga(int capacidaDeCarga) {
        this.capacidaDeCarga = capacidaDeCarga;
    }
    
}
