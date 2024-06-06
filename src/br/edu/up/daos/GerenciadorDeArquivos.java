package br.edu.up.daos;

import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.Gerente;
import br.edu.up.modelos.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeArquivos {
    private static final String CSV_FILE = "src\\br\\edu\\up\\resources\\pessoas.csv";
    private static final String DELIMITER = ";";

    public List<Pessoa> lerArquivoCSV() {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String linha;
            br.readLine();
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(DELIMITER);
                if (dados.length > 4 && dados[4].isEmpty()) {
                    // Gerente
                    pessoas.add(new Gerente(dados[1], dados[0], dados[2], dados[5]));
                } else if (dados.length > 4) {
                    // Cliente
                    pessoas.add(new Cliente(dados[1], dados[0], dados[2], dados[3], dados[4]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pessoas;
    }

    public void gravarArquivoCSV(List<Pessoa> pessoas) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(CSV_FILE))) {
            for (Pessoa pessoa : pessoas) {
                if (pessoa instanceof Gerente) {
                    Gerente gerente = (Gerente) pessoa;
                    pw.println(String.join(DELIMITER, gerente.getNome(), gerente.getCpf(), gerente.getEmail(), "", "",
                            gerente.getCodigo()));
                } else if (pessoa instanceof Cliente) {
                    Cliente cliente = (Cliente) pessoa;
                    pw.println(String.join(DELIMITER, cliente.getNome(), cliente.getCpf(), cliente.getEmail(),
                            cliente.getCelular(), cliente.getDataNasc(), ""));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
