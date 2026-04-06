public class Ave extends Animal {
    private String local;
    private boolean migracao;

public Ave(String nome, int recinto){
    super(nome, recinto);
}
public Ave(){}
public String getLocal(){
    return local;
}
public void setLocal(String local){
    this.local = local;
}
public boolean isMigracao(){
    return migracao;
}
public void setMigracao(boolean migracao){
    this.migracao = migracao;
}
@Override // Sobrescreve o método da classe mãe
public void andar(){
    setRecinto(getRecinto()+2);
}
public String toString(){
    return "Ave [local=" + local + ", migracao" + migracao + ", toString()=" +super.toString() + "]";
}
}