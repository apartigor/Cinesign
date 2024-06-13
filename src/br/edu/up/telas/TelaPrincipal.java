package br.edu.up.telas;

// Rafael: CLasse Cadastro e CLiente
// Tobias: Classe Pedido
// Gui: Classe Sessao
// Igor Hey: Classe Filme
// Igor Viana: Classe Pessoa e Cliente
// Nicolas: TelaPrincipal e Classe Gerente

import br.edu.up.controles.ControleDeCadastroCliente;
import br.edu.up.controles.ControleDeFilmes;
import br.edu.up.controles.ControleDePedidos;
import br.edu.up.controles.ControleDePessoas;
import br.edu.up.controles.ControleDeSessao;
import br.edu.up.daos.GerenciadorDeAquivosDeFilmes;
import br.edu.up.daos.GerenciadorDeArquivosDePedidos;
import br.edu.up.daos.GerenciadorDeArquivosDeSessoes;
import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.Filme;
import br.edu.up.modelos.Pedido;
import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Sessao;
import java.util.Scanner;

public class TelaPrincipal {
    private static final String SENHA_GERENTE = "1234";
    private final ControleDePessoas controleDePessoas;
    private final ControleDeFilmes controleDeFilmes;
    private final ControleDeCadastroCliente controleDeCadastroCliente = new ControleDeCadastroCliente();
    private final ControleDeSessao controleDeSessao = new ControleDeSessao();
    private final ControleDePedidos controleDePedidos = new ControleDePedidos();

    Scanner scanner = new Scanner(System.in);

    public TelaPrincipal() {
        this.controleDePessoas = new ControleDePessoas();
        this.controleDeFilmes = new ControleDeFilmes();
    }

    public void exibirMenu() {
        int opcao;

        do {

            System.out.println("---------------------");
            System.out.println("Menu Principal");
            System.out.println("1. Gerente");
            System.out.println("2. Clientes");
            System.out.println("0. Sair");
            System.out.println("---------------------");
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
                    
                    System.out.println("--------------------");
                    System.out.println("Menu Cliente");
                    System.out.println("1. Cadastrar");
                    System.out.println("2. Sessão");
                    System.out.println("3. Listar");
                    System.out.println("0. Sair");
                    System.out.println("---------------------");
                    System.out.print("Escolha uma opção: ");
                    
                    int valor = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (valor) {
                        case 1:
                        
                        cadastroCliente();
                        
                        break;
                        case 2:
                        
                        menuPedido(scanner);
                        
                        break;
                        case 3:
                        
                        listarClientes();
                        
                        break;
                        case 0:
                        
                        break;
                        }
                        
                        
                        break;
                        case 0:
                        System.out.println("---------------------");
                        System.out.println("Saindo...");
                        break;
                        default:
                        System.out.println("---------------------");
                        System.out.println("Opção inválida!");
                        break;
                        }
                        } while (opcao != 0);
                        
                        }
                        
                        private boolean verificarSenha(Scanner scanner) {
                            System.out.println("---------------------");
                            System.out.print("Digite a senha para acessar o menu do gerente: ");
                            String senha = scanner.nextLine();
                            return SENHA_GERENTE.equals(senha);
                            
    }

    private void menuGerente(Scanner scanner) {
        int opcao;
        do {
            System.out.println("---------------------");
            System.out.println("\nMenu Gerente");
            System.out.println("1. Cadastrar Filmes");
            System.out.println("2. Cadastrar Sessão");
            System.out.println("3. Listar Pessoas Cadastradas");
            System.out.println("4. Listar Pedidos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    String opt;
                    do {
                        cadastroDeFilmes();
                        System.out.println("---------------------");
                        System.out.println("\nFilme cadastrado com sucesso!!");
                        System.out.println("\nDeseja cadastrar mais um filme? ");
                        System.out.println("\nSim (S) / Não (N)");
                        System.out.print("\nDigite a opção desejada: ");
                        opt = scanner.nextLine();

                    } while (opt.equals("S") || opt.equals("Sim") || opt.equals("sim"));
                    listarFilmes();
                    break;
                case 2:
                    String opc;
                    do {
                        cadastrarSessao();
                        System.out.println("---------------------");
                        System.out.println("\nSessão cadastrada com sucesso!!");
                        System.out.println("\nDeseja cadastrar mais uma sessão? ");
                        System.out.println("\nSim (S) / Não (N)");
                        System.out.print("\nDigite a opção desejada: ");
                        opc = scanner.nextLine();
                    } while (opc.equals("S") || opc.equals("Sim") || opc.equals("sim") || (opc.equals("s")));
                    break;
                case 3:
                    listarPessoas();
                    break;
                case 4:
                    listarPedidos();
                    break;
                case 0:
                System.out.println("---------------------");
                    System.out.println("Voltando...");
                break;
                default:
                System.out.println("---------------------");
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    private void menuPedido(Scanner scanner) {
        int opcao;
        do {
            System.out.println("---------------------");
            System.out.println("\nMenu Usuário");
            System.out.println("1. Selecionar Sessão");
            System.out.println("2. Listar Filmes");
            System.out.println("0. Voltar");
            System.out.println("---------------------");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    selecionarSessao();
                    // Menu de selecionar o filme pelo código -> listar sessões -> fazer o pedido
                    break;
                case 2:
                    listarFilmes();
                    break;
                case 0:
                System.out.println("---------------------");
                    System.out.println("Voltando...");
                    System.out.println("---------------------");
                break;    
                default:
                    System.out.println("---------------------");
                    System.out.println("Opção inválida!");
                    System.out.println("---------------------");
                    break;
            }
        } while (opcao != 0);
    }

    // Pessoas
    private void listarPessoas() {
        System.out.println("---------------------");
        System.out.println("\nLista de Pessoas:");
        for (Pessoa pessoa : controleDePessoas.listarPessoas()) {
            System.out.println(pessoa);
        }
    }

    // Filme
    public void cadastroDeFilmes() {

        Filme filme = new Filme();
        System.out.println("---------------------");

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

        GerenciadorDeAquivosDeFilmes.salvarFilme(filme);
    }

public void listarFilmes() {

    System.out.println("---------------------");
    System.out.println("\nLista de Filmes: ");
    for (Filme filme : controleDeFilmes.listarFilmes()) {
        System.out.println(filme + "\n");
    }
    GerenciadorDeAquivosDeFilmes.listaFilmesCsv();
    }
    
    private void selecionarSessao() {
        listarSessoes();
        System.out.println("---------------------");
        System.out.println("Digite o código da sessão que deseja fazer o pedido: ");
        String codigoSessao = scanner.nextLine();
        for(Sessao sessao : GerenciadorDeArquivosDeSessoes.listaSessoesCsv()){
            if(codigoSessao.equals(sessao.getCodigoSessao())){
                Pedido pedido = new Pedido();
                pedido.setCodigo(codigoSessao);
                if(sessao.getAudio() != "portugues"){
                    pedido.setValorTotal("25.00");
                }else{
                    pedido.setValorTotal("30.00");
                }
                System.out.println("---------------------");
                System.out.println("Esolha o tipo de pagamento: ");
                System.out.println("1. Crédito");
                System.out.println("2. Débito");
                System.out.println("3. Pix");
                int opcao = scanner.nextInt();
                
                switch (opcao) {
                            case 1:
                            System.out.println("---------------------");
                            pedido.setTipoPagamento("Credito");
                            System.out.println("Pedido finalizado!");
                            break;
                            case 2:
                            System.out.println("---------------------");
                            pedido.setTipoPagamento("Debito");
                            System.out.println("Pedido finalizado!");
                            break;
                            case 3:
                            System.out.println("---------------------");
                            pedido.setTipoPagamento("Pix");
                            System.out.println("Pedido finalizado!");
                            break;
                        default:
                        System.out.println("---------------------");
                            System.out.println("Opção inválida!");
                            break;
                    }
                    controleDePedidos.adicionarpedido(pedido);
                    GerenciadorDeArquivosDePedidos.salvarPedido(pedido);
                }
            }
    }
                            
private void cadastrarSessao() {
    
    Sessao sessao = new Sessao();
    System.out.println("---------------------");
    
    System.out.println("\nCadastro de Sessão");
    
    System.out.println("Digite o código da sessão: ");
    sessao.setCodigoSessao(scanner.nextLine());
    
    System.out.println("Digite o nome do filme: ");
    sessao.setNomeFilme(scanner.nextLine());
    
    System.out.println("Digite a sala da sessão: ");
    sessao.setSala(scanner.nextLine());

    System.out.println("Digite a data da sessão: ");
    sessao.setData(scanner.nextLine());
    
    System.out.println("Digite o horário da sessão: ");
    sessao.setHorario(scanner.nextLine());
    
    System.out.println("Digite o idioma da legenda da sessão: ");
    sessao.setLegenda(scanner.nextLine());
    
    System.out.println("Digite o idioma do áudio da sessão: ");
    sessao.setAudio(scanner.nextLine());
    
    controleDeSessao.adicionarSessao(sessao);
                        
    GerenciadorDeArquivosDeSessoes.salvarSessao(sessao);
}

public void listarSessoes() {
    System.out.println("---------------------");
    System.out.println("\nLista de Sessões: ");
    for (Sessao sessao : controleDeSessao.listarSessao()) {
        System.out.println(sessao + "\n");
        }
        GerenciadorDeArquivosDeSessoes.listaSessoesCsv();
        }
        
        public void listarPedidos() {
            System.out.println("---------------------");
            System.out.println("\nLista de Pedidos: ");
            for (Pedido pedido : controleDePedidos.listarPedidos()) {
                System.out.println(pedido + "\n");
                }
                GerenciadorDeArquivosDePedidos.listaPedidosCsv();
                }
                
//CADASTRO CLIENTE
public void cadastroCliente(){

Cliente objCliente = new Cliente();


System.out.println("-------------------------");
System.out.println("Castrar Cliente: ");
System.out.println("Digite o nome do cliente: ");
objCliente.setNome(scanner.nextLine());

System.out.println("Digite o CPF do cliente: ");
objCliente.setCpf(scanner.nextLine());

System.out.println("Digite o email do cliente: ");
objCliente.setEmail(scanner.nextLine());

System.out.println("Digite o número de celular do cliente: ");
objCliente.setCelular(scanner.nextLine());

System.out.println("Digite a data de nascimento do cliente: ");
objCliente.setDataNasc(scanner.nextLine());


controleDeCadastroCliente.adicionarCliente(objCliente);
}

public void listarClientes(){
    
    System.out.println("--------------------");
    System.out.println("\nLista de Clientes: ");
    for (Cliente cliente : controleDeCadastroCliente.listarClientes()) {
        System.out.println(cliente + "\n");
    }

    }

}
