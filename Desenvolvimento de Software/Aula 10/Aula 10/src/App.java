public class App {
    public static void main(String[] args) throws Exception {
        Produto caneta = new Produto("Caneta", 5.9, "1");
        System.out.println(caneta.toString());
        Livro l1 = new Livro("O Senhor Dos Anéis", 69.9, "J. R. R. Tolkien", "2");

        Produto[] product = new Produto[5];
        product[0] = new Livro("Bíblia", 49.9, "Deus", "7");
        product[1] = new CD("Playlist1", 19.99, 10,"23");
        product[2] = new DVDs("Vingadores", 29.99, 2, "3");
        product[3] = new
        System.out.println(l1.toString());
    }
}
