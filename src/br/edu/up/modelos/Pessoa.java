package br.edu.up.modelos;

public abstract class Pessoa {
    protected String cpf;
    protected String nome;
    protected String email;

    public Pessoa(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

}
