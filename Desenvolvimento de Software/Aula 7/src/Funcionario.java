public class Funcionario {
    private String nomeFun;
    private String departamento;
    private double salario;
    private String dataFun;
    private String rg;
    private boolean estado;
}

public void setNomeF(String nomeFun){
    if (nomeFun != null && nomeFun.length() > 1){
            this.nomeFun = nomeFun;
        }
}