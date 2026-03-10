public class Atividade1 {
    public static void main (String args[]){
        int i = 10;
        int j = 2;
        int x = 0;
        int y = 0;
        j++;
        ++i;
        x = i++ + j;
        y = ++j + ++i;
        System.out.println("O valor de i é = " + i);
        System.out.println("O valor de j é = " + j);
        System.out.println("O valor de x é = " + x);
        System.out.println("O valor de y é = " + y);
    }
}
