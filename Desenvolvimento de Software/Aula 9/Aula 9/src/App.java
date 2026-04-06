import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int menu = 5;
        Calculadora calculo = new Calculadora();
        do {System.out.println("-- MENU -- \n"
                        + "1 - Soma \n"
                        + "2 - Subtração \n"
                        + "3 - Multiplicação \n"
                        + "4 - Divisão \n"
                        + "5 - Sair \n");
            menu = sc.nextInt();
        if (menu != 5){
        System.out.println("Digite o primeiro número: ");
        calculo.setNum1(sc.nextInt());
        System.out.println("Digite o segundo número: ");
        calculo.setNum2(sc.nextInt());
        }
        switch (menu){
            case 1:
            System.out.println(calculo.getNum1() + " + " + calculo.getNum2() + " = " + calculo.soma());
            break;
            case 2:
            System.out.println(calculo.getNum1() + " - " + calculo.getNum2() + " = " + calculo.subtracao());
            break;
            case 3:
            System.out.println(calculo.getNum1() + " x " + calculo.getNum2() + " = " + calculo.multiplicacao());
            break;
            case 4:
            System.out.println(calculo.getNum1() + " / " + calculo.getNum2() + " = " + calculo.divisao());
            break;
            case 5:
                System.out.println("Fim do programa");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println(calculo.toString());

        }while (menu != 5);
        sc.close();
    }
}
