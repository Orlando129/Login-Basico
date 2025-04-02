package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gerenciarUsuario gerenciarUsuario = new gerenciarUsuario();
        int escolha;
        String novoApelido;
        String novaSenha;
        String apelido;
        String senha;

        while (true) {
            System.out.println("1. Registrar\n2. Login\n3. Sair");
            System.out.print("Escolha uma opcao: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um nome de usuario: ");
                    novoApelido = sc.nextLine();
                    System.out.print("Digite uma senha: ");
                    novaSenha = sc.nextLine();
                    gerenciarUsuario.registrarUsuario(novoApelido, novaSenha);
                    break;
                case 2:
                    System.out.print("Usuario: ");
                    apelido = sc.nextLine();
                    System.out.print("Senha: ");
                    senha = sc.nextLine();
                    if (gerenciarUsuario.autenticarUsuario(apelido, senha)) {
                        System.out.println("Login bem-sucedido!");
                    } else {
                        System.out.println("Usuario ou senha incorretos.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção invalida!");
            }
        }
    }
}
