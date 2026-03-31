import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Ler dados para instanciar a classe Pessoa
        System.out.println("Digite o nome: ");
        String nome = sc.next();

        System.out.println("Digite o CPF: ");
        String cpf = sc.next();

        Pessoa pessoa1 = new Pessoa(nome, cpf); // Utiliza construtor de 2 parâmetros

        Calendar data = Calendar.getInstance(); // Leitura de datas com Calendar
        data.set(1995, 8, 22);
        pessoa1.setNascimento(data);
        System.out.println(pessoa1.toString());

        sc.close();
    }
}
