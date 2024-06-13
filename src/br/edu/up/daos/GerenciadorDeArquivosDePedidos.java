package br.edu.up.daos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.edu.up.modelos.Pedido;

public class GerenciadorDeArquivosDePedidos {

    private static final String nomeArquivo = "src\\br\\edu\\up\\resources\\pedidos.csv";

    public static void salvarPedido(Pedido pedido) {

        try {

            boolean arquivoExiste = new File(nomeArquivo).exists();

            FileWriter escritor = new FileWriter(nomeArquivo, true);

            if (!arquivoExiste) {
                escritor.write("codigo;valorTotal;tipoPagamento\n");
            }

            escritor.write(pedido.getCodigo() + ";" + pedido.getValorTotal() + ";" + pedido.getTipoPagamento() + "\n");

            escritor.flush();

            escritor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Pedido> listaPedidosCsv() {
        ArrayList<Pedido> listaPedido = new ArrayList<>();

        try {

            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            boolean primeiraLinha = true;

            while ((linha = leitor.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] dados = linha.split(";");

                String codigo = dados[0];
                String valorTotal = dados[1];
                String tipoPagamento = dados[2];

                Pedido pedido = new Pedido(codigo, valorTotal, tipoPagamento);

                listaPedido.add(pedido);

                System.out.println("Codigo: " + codigo + " - Valor Total: R$" + valorTotal + " - Tipo Pagamento: " + tipoPagamento);
            }

            leitor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaPedido;
    }
}

