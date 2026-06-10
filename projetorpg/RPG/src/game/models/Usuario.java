package game.models;

public class Usuario {

    private String login;
    private String senhaAtual;
    private String senhaAntiga1;
    private String senhaAntiga2;
    private String senhaAntiga3;

    public Usuario(String login,String senhaAtual) {
        this.login = login;
        this.senhaAtual = senhaAtual;
        this.senhaAntiga1 = "";
        this.senhaAntiga2 = "";
        this.senhaAntiga3 = "";
    }

    public Usuario(
            String login,
            String senhaAtual,
            String senhaAntiga1,
            String senhaAntiga2,
            String senhaAntiga3) {

        this.login = login;
        this.senhaAtual = senhaAtual;
        this.senhaAntiga1 = senhaAntiga1;
        this.senhaAntiga2 = senhaAntiga2;
        this.senhaAntiga3 = senhaAntiga3;
    }

    public boolean alterarSenha(String novaSenha) {

        if (!senhaPermitida(novaSenha)) {
            return false;
        }

        senhaAntiga3 = senhaAntiga2;
        senhaAntiga2 = senhaAntiga1;
        senhaAntiga1 = senhaAtual;

        senhaAtual = novaSenha;
        return true;
    }

    private boolean senhaPermitida(String novaSenha) {

        return !novaSenha.equals(senhaAtual)
                && !novaSenha.equals(senhaAntiga1)
                && !novaSenha.equals(senhaAntiga2)
                && !novaSenha.equals(senhaAntiga3);
    }

    public boolean validarSenha(String senha) {
        return senhaAtual.equals(senha);
    }


    //Get e Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(
            String login) {

        this.login = login;
    }

    public String getSenhaAtual() {
        return senhaAtual;
    }

    public void setSenhaAtual(
            String senhaAtual) {

        this.senhaAtual = senhaAtual;
    }

    public String getSenhaAntiga1() {
        return senhaAntiga1;
    }

    public void setSenhaAntiga1(
            String senhaAntiga1) {

        this.senhaAntiga1 = senhaAntiga1;
    }

    public String getSenhaAntiga2() {
        return senhaAntiga2;
    }

    public void setSenhaAntiga2(
            String senhaAntiga2) {

        this.senhaAntiga2 = senhaAntiga2;
    }

    public String getSenhaAntiga3() {
        return senhaAntiga3;
    }

    public void setSenhaAntiga3(
            String senhaAntiga3) {

        this.senhaAntiga3 = senhaAntiga3;
    }

    @Override
    public String toString() {

        return "Usuario{" +
                "login='" + login + '\'' +
                '}';
    }
}
