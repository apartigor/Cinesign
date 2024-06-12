package br.edu.up.telas;

// Tobias: Classe Pedido
// Gui: Classe Ingresso
// Igor Hey: Classe Filme
// Igor Viana: Classe Pessoa e Cliente
// Nicolas: TelaPrincipal e Classe Gerente

import java.util.Scanner;

import br.edu.up.controles.ControleDeFilmes;
import br.edu.up.controles.ControleDePessoas;
import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Filme;

public class TelaPrincipal {
    private static final String SENHA_GERENTE = "1234";
    private ControleDePessoas controleDePessoas;
    private ControleDeFilmes controleDeFilmes;

    Scanner scanner = new Scanner(System.in);

    public TelaPrincipal() {
        this.controleDePessoas = new ControleDePessoas();
        this.controleDeFilmes = new ControleDeFilmes();
    }

    public void exibirMenu() {
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
                    String opt = "";
                    do {
                        cadastroDeFilmes();
                        System.out.println("\nFilme cadastrado com sucesso!!");
                        System.out.println("\nDeseja cadastrar mais um filme? ");
                        System.out.println("\nSim (S) / Não (N)");
                        System.out.print("\nDigite a opção desejada: ");
                        opt = scanner.nextLine();

                    } while (opt.equals("S") || opt.equals("Sim") || opt.equals("sim"));
                    listarFilmes();
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
            System.out.println("1. Escolher filmes disponíveis");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    menuFilme();
                    // Menu de selecionar o filme pelo código -> listar sessões -> fazer o pedido
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // Pessoas
    private void listarPessoas() {
        System.out.println("\nLista de Pessoas:");
        for (Pessoa pessoa : controleDePessoas.listarPessoas()) {
            System.out.println(pessoa);
        }
    }

    // Filme
    public void cadastroDeFilmes() {

        Filme filme = new Filme();

        System.out.println("\nCadastro de Filme");

        System.out.println("Digite o código do filme: ");
        filme.setCodFilme(scanner.nextLine());

        System.out.println("Digite o nome do filme: ");
        filme.setNomeFilme(scanner.nextLine());

        System.out.println("Digite o gênero do filme: ");
        filme.setGeneroFilme(scanner.nextLine());

        System.out.println("Digite a distribuidora do filme: ");
        filme.setDistribuidora(scanner.nextLine());

        controleDeFilmes.adicionarFilme(filme);
    }

    public void listarFilmes() {
        System.out.println("\nLista de Filmes: ");
        for (Filme filme : controleDeFilmes.listarFilmes()) {
            System.out.println(filme + "\n");
        }
    }

    private void menuFilme() {
        listarFilmes();
            System.out.println("Digite o código do filme: ");
            String codigoFilme = scanner.nextLine();
            for(Filme filme : controleDeFilmes.listarFilmes()){
                if(codigoFilme.equals(filme.getCodFilme())){
                    //Menu da sessão
                }
            }
    }
}
