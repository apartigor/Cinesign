package br.edu.up.daos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import br.edu.up.modelos.Filme;

public class GerenciadorDeAquivosDeFilmes {

    private static final String nomeArquivo = "src\\br\\edu\\up\\resources\\filmes.csv";

    public static void salvarFilme(Filme filme) {

        try {

            boolean arquivoExiste = new File(nomeArquivo).exists();

            FileWriter escritor = new FileWriter(nomeArquivo, true);

            if (!arquivoExiste) {
                escritor.write("Codigo;Nome;Genero;Distribuidora\n");
            }

            escritor.write(filme.getCodFilme() + ";" + filme.getNomeFilme() + ";" + filme.getGeneroFilme() + ";"
                    + filme.getDistribuidora() + "\n");

            escritor.flush();

            escritor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Filme> listaFilmesCsv() {
        ArrayList<Filme> listaFilme = new ArrayList<>();

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
                String nome = dados[1];
                String genero = dados[2];
                String distribuidora = dados[3];

                Filme filme = new Filme(codigo, nome, genero, distribuidora);

                listaFilme.add(filme);

                System.out.println("Codigo: " + codigo + " - Nome: " + nome + " - Genero: " + genero
                        + " - Distribuidora: " + distribuidora);
            }

            leitor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaFilme;
    }
}
