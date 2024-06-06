package br.edu.up.controles;

import br.edu.up.daos.GerenciadorDeArquivos;
import br.edu.up.modelos.Pessoa;

import java.util.List;

public class ControleDePessoas {
    private List<Pessoa> pessoas;
    private GerenciadorDeArquivos gerenciadorDeArquivos;

    public ControleDePessoas() {
        gerenciadorDeArquivos = new GerenciadorDeArquivos();
        pessoas = gerenciadorDeArquivos.lerArquivoCSV();
    }

    public List<Pessoa> listarPessoas() {
        return pessoas;
    }

    public void salvarPessoas() {
        gerenciadorDeArquivos.gravarArquivoCSV(pessoas);
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
}
