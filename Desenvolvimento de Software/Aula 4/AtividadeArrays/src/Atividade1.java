import java.util.Scanner;

public class Atividade1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Digite o número minimo: ");
        int minimo = sc.nextInt();
        System.out.print("Digite o número máximo: ");
        int maximo = sc.nextInt();
        if (minimo < 1 || minimo > 10 || maximo < 1 || maximo > 10){
            System.out.println("Nenhum número encontrado!");
        }
        else{
        System.out.println("Números entre " + minimo + " e " + maximo + ":");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > minimo && vetor[i] < maximo) {
                System.out.print(vetor[i] + " ");
            }
        }
        }
        sc.close();
    }
}
