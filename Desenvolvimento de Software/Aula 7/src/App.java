import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Conta conta1 = new Conta();
    System.out.println("Digite o nome: ");
    String n = sc.next(); // lendo do teclado
    conta1.setNome(n); // usando set

    //conta1.numero = 2;  // public
    System.out.println("O nome digitado é: " + conta1.getNome());

    System.out.println("Digite o numero: ");
    int num = sc.nextInt();
    conta1.setNumero(num);
    System.out.println(" O número digitado é: " + conta1.getNumero());

    System.out.println("Digite o saldo: ");
    double sal = sc.nextDouble();
  //  conta1.setSaldo(sal);
    System.out.println("O Saldo digitado é: " + conta1.getSaldo());

    System.out.println("Digite o limite: ");
    double lim = sc.nextDouble();
    conta1.setLimite(lim);
    System.out.println("O limite digitado é: " + conta1.getLimite());
    // conta 2
    Conta conta2 = new Conta();
    conta2.setNumero(num = 5);
    System.out.println(conta1.toString());
    
    System.out.println(conta2.toString());
    sc.close();
}
}