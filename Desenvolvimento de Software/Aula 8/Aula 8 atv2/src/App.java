import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro num: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo num: ");
        int num2 = sc.nextInt();

        Calculadora calculo = new Calculadora(num1, num2);

        System.out.println(calculo.soma());
        System.out.println(calculo.subtracao());
        System.out.println(calculo.divisao());
        System.out.println(calculo.multiplicacao());

        sc.close();
    }
}
