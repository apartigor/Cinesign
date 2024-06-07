package br.edu.up.controles;

import br.edu.up.modelos.Filme;
// import br.edu.up.daos.GerenciadorDeAquivosDeFilmes;

import java.util.List;
import java.util.ArrayList;


public class ControleDeFilmes {

    private List<Filme> filmes = new ArrayList<>();
    // private GerenciadorDeAquivosDeFilmes gerenciadorDeArquivosFilmes;


    public List<Filme> listarFilmes() {
        return filmes;
    }

    public void salvarFilmes() {

    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }
}
