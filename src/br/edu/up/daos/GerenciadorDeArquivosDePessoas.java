package br.edu.up.daos;

import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.Gerente;
import br.edu.up.modelos.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeArquivosDePessoas {
    private String header = "";
    private static final String CSV_FILE = "src\\br\\edu\\up\\resources\\pessoas.csv";
    private static final String DELIMITER = ";";

    public List<Pessoa> lerArquivoPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        try {
            File arquivoLeitura = new File(CSV_FILE);
            Scanner leitor = new Scanner(arquivoLeitura);

            // Armazeno cabeçalho
            if (leitor.hasNextLine()) {
                header = leitor.nextLine();
            }

            // Enquanto tiver linha no arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(DELIMITER);

                if (dados.length > 4 && dados[4].isEmpty()) {
                    // Gerente
                    pessoas.add(new Gerente(dados[1], dados[0], dados[2], dados[5]));
                } else if (dados.length > 4) {
                    // Cliente
                    pessoas.add(new Cliente(dados[1], dados[0], dados[2], dados[3], dados[4]));
                }
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! " + e.getMessage());
        }

        return pessoas;
    }

    public boolean gravarArquivoPessoas(List<Pessoa> pessoas) {
        try {
            FileWriter arquivoGravar = new FileWriter(CSV_FILE);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            // Gravar cabeçalho
            gravador.println(header);

            for (Pessoa pessoa : pessoas) {
                if (pessoa instanceof Gerente) {
                    Gerente gerente = (Gerente) pessoa;
                    gravador.println(String.join(DELIMITER, gerente.getNome(), gerente.getCpf(), gerente.getEmail(), "", "", gerente.getCodigo()));
                } else if (pessoa instanceof Cliente) {
                    Cliente cliente = (Cliente) pessoa;
                    gravador.println(String.join(DELIMITER, cliente.getNome(), cliente.getCpf(), cliente.getEmail(), cliente.getCelular(), cliente.getDataNasc(), ""));
                }
            }

            gravador.close();
            return true;
        } catch (IOException e) {
            System.out.println("Não foi possível gravar o arquivo!");
        }

        return false;
    }
}
