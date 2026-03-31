import java.util.Calendar;

public class Pessoa{
    private String nome;
    private String email;
    private Calendar nascimento;
    private String cpf;
    private String telefone;

public Pessoa(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
}

public String getNome(){
    return this.nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public String getEmail(){
    return this.email;
}
public void setEmail(String email){
    this.email = email;
}

public String getCpf(){
    return this.cpf;
}
public void setCpf(String cpf){
    this.cpf = cpf;
}

public String getTelefone(){
    return this.telefone;
}
public void setTelefone(String telefone){
    this.telefone = telefone;
}

public Calendar getNascimento(){
    return this.nascimento;
}
public void setNascimento(Calendar nascimento){
    this.nascimento = nascimento;
}

public String toString(){
   return "\nNome: " + this.nome +"\nEmail: " + this.email +"\nNascimento: " + this.nascimento + "\n Cpf: "+ this.cpf + "\nTelefone: " + this.telefone;
}
}