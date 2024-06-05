package br.edu.up.modelos;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String email;
    private String dataNasc;

    public Pessoa(String cpf, String nome, String email, String dataNasc) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
    }

}
