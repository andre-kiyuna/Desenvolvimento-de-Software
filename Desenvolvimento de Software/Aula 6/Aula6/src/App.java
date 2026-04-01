import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- SISTEMA BANCÁRIO ---- \n");
        // Instanciando um objeto da classe Conta
        Conta conta1 = new Conta();
        int menu = 0;
        do {
        System.out.println("Digite 1 para cadastrar conta");
        System.out.println("Digite 2 para Ver dados cadastrados");
        System.out.println("Digite 3 para Sacar");
        System.out.println("Digite 4 para Depósitar");
        System.out.println("Digite 5 para sair: ");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                //Editando os atributos do objeto
                System.out.print("Digite o nome do cliente: ");
                conta1.nome = sc.nextLine();// Lendo o nome do teclado
                System.out.print("Digite o numero da conta: ");
                conta1.numero = sc.nextInt();
                System.out.print("Digite o saldo da conta: ");
                conta1.saldo = sc.nextDouble();
                System.out.print("Digite o limite da conta: ");
                conta1.limite = sc.nextDouble();
                break;
        
            case 2:
                System.out.println(conta1.toString());
                break;

            case 3:
                System.out.println("--- SAQUE ---");
                System.out.println("Digite o valor de saque");
                double valor = sc.nextDouble();
                if(conta1.sacarVerifica(valor)){
                System.out.println("Saque realizado!");
                }
                break;
            case 4:
                System.out.println("Digite o valor do depósito: ");
                double valorDeposito = sc.nextDouble();
                conta1.depositar(valorDeposito);
                break;

            case 5:
                System.out.println("Saindo...");
                break;
            default:
                break;
        }
        } while (menu != 5);
        sc.close();
}
}