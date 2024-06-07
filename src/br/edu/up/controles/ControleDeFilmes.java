package br.edu.up.controles;

import br.edu.up.modelos.Filme;
// import br.edu.up.daos.GerenciadorDeAquivosDeFilmes;

import java.util.List;

public class ControleDeFilmes {

    private List<Filme> filmes;
    // private GerenciadorDeAquivosDeFilmes gerenciadorDeArquivosFilmes;

    public ControleDeFilmes() {

    }

    public List<Filme> listarFilmes() {
        return filmes;
    }

    public void salvarFilmes() {

    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }
}
