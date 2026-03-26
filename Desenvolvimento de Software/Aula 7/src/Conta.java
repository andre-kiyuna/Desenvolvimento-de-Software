public class Conta {
  // Atributos da classe
  private double saldo;
  private String nome;
  private static int numero;
  private double limite;

    // getters e setters
    public void setNome(String nome){
        if (nome != null && nome.length() > 1){
            this.nome = nome;
        }
    }

    public String getNome(){
        return this.nome;
    }

    private void setSaldo(Double saldo){
        if (saldo != null && saldo > 0){
            this.saldo = saldo;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setNumero(int numero){
        if (numero != 0){
            this.numero = numero;
        }
    }

    public int getNumero(){
        return this.numero;
    }

    public void setLimite(double limite){
        if (limite > 0){
            this.limite = limite;
        }
    }

    public double getLimite(){
        return this.limite;
    }

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