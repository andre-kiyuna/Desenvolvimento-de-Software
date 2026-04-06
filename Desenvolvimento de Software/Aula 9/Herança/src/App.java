public class App {
    public static void main(String[] args) throws Exception {
        Animal cavalo = new Animal("Pé de pano", 1);
        System.out.println(cavalo.toString());
        Ave papagaio = new Ave("Loro",3);
        papagaio.setPeso(0.5f);
        cavalo.andar();
        papagaio.andar();
        System.out.println(cavalo.toString());
        System.out.println(papagaio.toString());
    }
}
