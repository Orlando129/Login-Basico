package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginBasico {
    private static final Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar\n2. Login\n3. Sair");
            System.out.print("Escolha uma opçao: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Digite um nome de usuario: ");
                    String newUsername = sc.nextLine();
                    System.out.print("Digite uma senha: ");
                    String newPassword = sc.nextLine();
                    registerUser(newUsername, newPassword);
                    break;
                case 2:
                    System.out.print("Usuario: ");
                    String username = sc.nextLine();
                    System.out.print("Senha: ");
                    String password = sc.nextLine();
                    if (authenticateUser(username, password)) {
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

    private static void registerUser(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Usuario já existe!");
        } else {
            users.put(username, password);
            System.out.println("Usuario registrado com sucesso!");
        }
    }

    private static boolean authenticateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
