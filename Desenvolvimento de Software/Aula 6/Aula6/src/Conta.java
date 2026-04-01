public class Conta {
    // Atributos da classe
    double saldo;
    String nome;
    int numero;
    double limite;

    public void saque(double valor){
        if (saldo >= valor && valor >0){
            //this.saldo = this.saldo - valor;
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        } else{
            System.out.println("Saldo insuficiente ou valor de saque inválido");
        }
        System.out.println("Seu saldo atual é: "+ this.saldo);
    }
            boolean sacarVerifica(double quantidade){
            if (quantidade > this.saldo && quantidade <= 0) {
                return false;
            } else{
                double novoSaldo = this.saldo - quantidade;
                this.saldo = novoSaldo;
                return true;
            }
        }
    public String toString(){
        return "Nome: "+ this.nome
                + " | Num.: " + this.numero
                + " | Saldo: " + this.saldo
                + " | Limite: " + this.limite;
    }
    public void depositar(double valor) {
    if (valor > 0) {
        this.saldo += valor;
        System.out.println("Depósito realizado!");
    } else {
        System.out.println("Depósito inválido!");
    }
}
}
