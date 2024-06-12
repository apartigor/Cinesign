package br.edu.up.controles;

import br.edu.up.daos.GerenciadorDeArquivosDePessoas;
import br.edu.up.modelos.Pessoa;

import java.util.List;

public class ControleDePessoas {
    private List<Pessoa> pessoas;
    private GerenciadorDeArquivosDePessoas gerenciadorDeArquivos;

    public ControleDePessoas() {
        gerenciadorDeArquivos = new GerenciadorDeArquivosDePessoas();
        pessoas = gerenciadorDeArquivos.lerArquivoPessoas();
    }

    public List<Pessoa> listarPessoas() {
        return pessoas;
    }

    public void salvarPessoas() {
        gerenciadorDeArquivos.gravarArquivoPessoas(pessoas);
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
}
