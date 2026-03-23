import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String meses[] ={"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 12");
        int digitado = sc.nextInt();
        if (1<= digitado && 12 >= digitado){
        digitado -= 1;
        System.out.println("O mês de "+ meses[digitado] +" está na posição: "+ (digitado+1));
        } else {
            System.out.println("Número inválido!");
        }
        sc.close();
    }
}