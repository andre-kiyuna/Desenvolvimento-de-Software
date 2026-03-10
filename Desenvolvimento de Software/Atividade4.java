public class Atividade4 {
    public static void main (String args[]){
        float lado1 = 10;
        float lado2 = 10;
        float lado3 = 10;
        if (lado1  == lado2 && lado2 == lado3){
            System.out.println("É um triângulo congruente");
        }
        else if(lado1 == lado2 && lado3 != lado1){
            System.out.println("É um triângulo Isósceles");
        }
        else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("É um triângulo Escaleno");
        }
        else{
            System.out.println("Não é um triângulo");
        }
    }
}
