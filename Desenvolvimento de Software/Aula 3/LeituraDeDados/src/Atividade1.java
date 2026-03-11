public class Atividade1 {
    public static void main (String[] args) {
        double ze = 1.1;
        double joao = 1.5;
        int contador = 0;
        while(ze < joao){
            contador++;
            ze += 0.03;
            joao += 0.02;
        }
        System.out.println("Foram nescessários: " +contador + "anos para Zé ser maior que João");
    }
}
