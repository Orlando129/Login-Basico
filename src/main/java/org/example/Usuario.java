package org.example;

public class Usuario {
    private String apelido;
    private String senha;

    public Usuario(String apelido, String senha) {
        this.apelido = apelido;
        this.senha = senha;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean checarSenha(String senha){
        return this.senha.equals(senha);
    }
}
