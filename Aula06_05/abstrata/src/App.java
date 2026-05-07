public class App {
    public static void main(String[] args) throws Exception {
        Triangulo trianguloRetangulo = new Triangulo(5.0,"Triangulo", "retangulo");
        System.out.println(trianguloRetangulo.area());

        Retangulo retangulo = new Retangulo(4.0);
        System.out.println(retangulo.area());
    }
}
