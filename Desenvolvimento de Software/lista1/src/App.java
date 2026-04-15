public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Contador cont = new Contador();
        int opcao = 0;
        System.out.println("---- MENU ----\N");
        System.out.println("1. Incrementar");
        System.out.println("2. Zerar");
        System.out.println("3. Exibir valor");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();

        while(opcao !=0){
            switch(opcao){
                case 1:
                    cont.incrementar();
                    break;
                case 2:
                    cont.zerar();
                    break;
                case 3:
                    cont.toString();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
