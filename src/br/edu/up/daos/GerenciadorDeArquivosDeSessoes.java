package br.edu.up.daos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.edu.up.modelos.Sessao;

public class GerenciadorDeArquivosDeSessoes {

    private static final String nomeArquivo = "src\\br\\edu\\up\\resources\\sessoes.csv";

    public static void salvarSessao(Sessao sessao) {

        try {

            boolean arquivoExiste = new File(nomeArquivo).exists();

            FileWriter escritor = new FileWriter(nomeArquivo, true);

            if (!arquivoExiste) {
                escritor.write("codigo;nomeFilme;sala;data;horario;legenda;audio\n");
            }

            escritor.write(sessao.getCodigoSessao() + ";" + sessao.getNomeFilme() + ";" + sessao.getSala() + ";" + sessao.getData() + ";" + sessao.getHorario() + ";"
                    + sessao.getLegenda() + ";" + sessao.getAudio() + "\n");

            escritor.flush();

            escritor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Sessao> listaSessoesCsv() {
        ArrayList<Sessao> listaSessao = new ArrayList<>();

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
                String nomeFilme = dados[1];
                String sala = dados[2];
                String data = dados[3];
                String horario = dados[4];
                String legenda = dados[5];
                String audio = dados[6];

                Sessao sessao = new Sessao(codigo, nomeFilme, sala, data, horario, legenda, audio);

                listaSessao.add(sessao);

                System.out.println("Codigo Sessão: " + codigo + " - Nome Filme: " + nomeFilme + " - Sala: " + sala + " - Data: " + data
                        + " - Horário: " + horario + " - Legenda: " + legenda + " - Áudio: " + audio);
            }

            leitor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaSessao;
    }
}
