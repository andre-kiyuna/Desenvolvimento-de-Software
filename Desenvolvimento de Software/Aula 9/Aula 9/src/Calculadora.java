public class Calculadora{
    private int num1;
    private int num2;

    public int getNum1(){
        return this.num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }

    public int getNum2(){
        return this.num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int soma(){
        return this.num1 + this.num2;
    }
    public int subtracao(){
        return this.num1 - this.num2;
    }
    public int multiplicacao(){
        return this.num1 * this.num2;
    }
    public float divisao(){
        return this.num1 / this.num2;
    }

    public String toString(){
        return "\nSoma: " + soma() + "\nSubtração: " + subtracao() + "\nMultiplicação: " + multiplicacao() + "\nDivisão: " + divisao();
    }
}