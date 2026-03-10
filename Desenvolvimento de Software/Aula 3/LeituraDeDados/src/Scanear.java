import java.util.Scanner;
public class Scanear {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in); // Inicia o leitor
        System.out.println("Digite um número: "); // Exibe mensagem
        int numero = input.nextInt(); // Lê do teclado
        System.out.println("O primeiro número é: "+ numero +"!"); // Exibe
        System.out.println("Digite outro número:");
        int numero2 = input.nextInt();
        System.out.println("O segundo número é: "+numero2 +"!");
        int soma = numero + numero2;
        System.out.println("O resultado da soma é: "+ soma + "!");
        input.close(); // Fecha o leitor no fim do programa
    }
}
