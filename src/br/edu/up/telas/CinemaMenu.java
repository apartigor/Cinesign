package br.edu.up.telas;

import java.util.Scanner;

public class CinemaMenu {
    private static final String SENHA_GERENTE = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Funcionários");
            System.out.println("2. Clientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (verificarSenha(scanner)) {
                        menuFuncionarios(scanner);
                    } else {
                        System.out.println("Senha incorreta!");
                    }
                    break;
                case 2:
                    menuClientes(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static boolean verificarSenha(Scanner scanner) {
        System.out.print("Digite a senha para acessar o menu de funcionários: ");
        String senha = scanner.nextLine();
        return SENHA_GERENTE.equals(senha);
        
    }

    public static void menuFuncionarios(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\nMenu Funcionários");
            System.out.println("1. Cadastrar Filmes");
            System.out.println("2. Cadastrar Seção");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de Filmes");
                    break;
                case 2:
                    System.out.println("Cadastro de Seção");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void menuClientes(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\nMenu Clientes");
            System.out.println("1. Cadastre-se");
            System.out.println("2. Login");
            System.out.println("3. Fazer pedido");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("teste");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
