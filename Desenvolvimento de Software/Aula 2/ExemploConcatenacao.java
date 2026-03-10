public class ExemploConcatenacao{
    public static void main(String args[]){
        // O código vai aqui
        System.out.println("Hello world!");
        String texto1 = ">> O operador de concatenação (+) ";
        String texto2 = "é muito prático ";
        String texto3 = texto1 + texto2 + "!";
        System.out.println(texto3 + "<<");
        System.out.println(">> 2 + 5 = " + 2 + 5); //Incorreto
        System.out.println(">> 2 + 5 = " + (2 + 5));
    }
}
/*Para executar
javac Arquivo.java
java Arquivo
*/