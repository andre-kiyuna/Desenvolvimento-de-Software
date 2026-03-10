import javax.swing.JOptionPane;

public class Whiledowhile {
    public static void main(String[] args)  {
        int num1 = 0;
        while ( num1 < 10) {
            System.out.println("- "+(num1++));
        }

        int num3 = 0, soma1 = 0;
        do{
            num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor?"));
            soma1 += num3;
        } while (num3 > 0);

        for (int cont = 0; cont <= 100; cont++){
            System.out.println(cont);
        }
        System.out.println("Soma total: " + soma1);
    }
}
