import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Ponto2D p1 = new Ponto2D();
        int opcao = -1;

        while(opcao != 0){
            System.out.println("\n---- MENU PONTO2D ----");
            System.out.println("1. Definir coordenadas");
            System.out.println("2. Mover para o inicio");
            System.out.println("3. Mover para novo local");
            System.out.println("4. Calcular distancia para outro ponto");
            System.out.println("5. Comparar com outro ponto");
            System.out.println("6. Clonar ponto");
            System.out.println("7. Exibir ponto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Digite o X: ");
                    p1.setX(sc.nextDouble());
                    System.out.print("Digite o Y: ");
                    p1.setY(sc.nextDouble());
                    break;
                case 2:
                    p1.mover();
                    break;
                case 3:
                    System.out.print("Digite o novo X: ");
                    double novoX = sc.nextDouble();
                    System.out.print("Digite o novo Y: ");
                    double novoY = sc.nextDouble();
                    p1.mover(novoX, novoY);
                    break;
                case 4:
                    System.out.print("Digite o X do outro ponto: ");
                    double dx = sc.nextDouble();
                    System.out.print("Digite o Y do outro ponto: ");
                    double dy = sc.nextDouble();
                    Ponto2D p2 = new Ponto2D(dx, dy);
                    System.out.println("Distancia: " + p1.calcularDistancia(p2));
                    break;
                case 5:
                    System.out.print("Digite o X do outro ponto: ");
                    double ex = sc.nextDouble();
                    System.out.print("Digite o Y do outro ponto: ");
                    double ey = sc.nextDouble();
                    Ponto2D p3 = new Ponto2D(ex, ey);
                    System.out.println("Os pontos sao iguais? " + p1.equals(p3));
                    break;
                case 6:
                    Ponto2D clone = p1.clone();
                    System.out.println("Clone criado: " + clone.toString());
                    break;
                case 7:
                    System.out.println(p1.toString());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        sc.close();
    }
}