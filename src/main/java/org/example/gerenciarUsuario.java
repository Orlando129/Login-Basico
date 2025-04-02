package org.example;

import java.util.HashMap;
import java.util.Map;

public class gerenciarUsuario {
    private Map<String, Usuario> usuarios = new HashMap<>();

    public void registrarUsuario(String apelido, String senha){
        if (usuarios.containsKey(apelido)) {
            System.out.println("Usuário já existe!");
        } else {
            usuarios.put(apelido, new Usuario(apelido, senha));
            System.out.println("Usuário registrado com sucesso!");
        }
    }

    public boolean autenticarUsuario(String apelido, String senha) {
        return usuarios.containsKey(apelido) && usuarios.get(apelido).checarSenha(senha);
    }
}
