package br.edu.up.telas;

// Tobias: Classe Pedido
// Gui: Classe Ingresso
// Igor Hey: Classe Filme
// Igor Viana: Classe Pessoa e Cliente
// Nicolas: TelaPrincipal e Classe Gerente

import java.util.Scanner;

import br.edu.up.controles.ControleDePessoas;
import br.edu.up.modelos.Pessoa;

public class TelaPrincipal {
    private static final String SENHA_GERENTE = "1234";
    private ControleDePessoas controleDePessoas;

    public TelaPrincipal() {
        this.controleDePessoas = new ControleDePessoas();
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Gerente");
            System.out.println("2. Clientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (verificarSenha(scanner)) {
                        menuGerente(scanner);
                    } else {
                        System.out.println("Senha incorreta!");
                    }
                    break;
                case 2:
                    menuPedido(scanner);
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

    private boolean verificarSenha(Scanner scanner) {
        System.out.print("Digite a senha para acessar o menu do gerente: ");
        String senha = scanner.nextLine();
        return SENHA_GERENTE.equals(senha);
    }

    private void menuGerente(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\nMenu Gerente");
            System.out.println("1. Cadastrar Filmes");
            System.out.println("2. Cadastrar Sessão");
            System.out.println("3. Listar Pessoas Cadastradas");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de Filmes");
                    break;
                case 2:
                    System.out.println("Cadastro de Sessão");
                    break;
                case 3:
                    listarPessoas();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void menuPedido(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\nMenu Pedido");
            System.out.println("1. Listar filmes disponíveis");
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

    private void listarPessoas() {
        System.out.println("\nLista de Pessoas:");
        for (Pessoa pessoa : controleDePessoas.listarPessoas()) {
            System.out.println(pessoa);
        }
    }

}
