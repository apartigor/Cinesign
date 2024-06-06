package br.edu.up.modelos;

public class Gerente {
    private String nome;
    private String codigo;

    public Gerente(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Gerente [nome=" + nome + ", codigo=" + codigo + "]";
    }
}

