import java.util.Scanner;

public class Atividade2 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int codigo = 1;
        double soma = 0, media = 0;
        do{
        System.out.println("Digite o código do aluno: ");
        codigo = input.nextInt();
        System.out.println("Digite a 1° nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Digite a 2° nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Digite a 3° nota: ");
        double nota3 = input.nextDouble();
        soma = nota1 + nota2 + nota3;
        media = soma / 3;
        System.out.println("A média é: "+ media);
        System.out.println("Digite 0 para encerrar: ");
        codigo = input.nextInt();
        } while (codigo != 0);
        input.close();
    }
}