import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Triangulo trianguloRetangulo = new Triangulo(5.0,"Triangulo", "retangulo");
        System.out.println(trianguloRetangulo.area());

        Retangulo retangulo = new Retangulo(4.0);
        System.out.println(retangulo.area());

        ArrayList<Forma2D> listaFormas = new ArrayList<>();
        int option = 0;
        MenuFormas menuFormas = new MenuFormas();
        do{
            option = menuFormas.exibirMenu();
            switch (option) {
                case 1:
                    // Cadastra forma
                    listaFormas.add(menuFormas.cadastForma2D());
                    break;
                case 2: 
                    // Listar forma
                    for (Forma2D forma2d : listaFormas) {
                        System.out.println(forma2d.toString());
                    }
                    break;
                case 3:
                    // Calcular área
                    for (Forma2D forma2d : listaFormas) {
                        System.out.println("Área da forma " + forma2d.getNome()+ ": " + forma2d.area());
                    }
                    break;
                default:
                    break;
            }

        }while(option !=0);
        menuFormas.encerraSistema();
    }
}
