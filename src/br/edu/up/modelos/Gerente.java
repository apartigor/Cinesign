package br.edu.up.modelos;

public class Gerente extends Pessoa {
    private String codigo;

    public Gerente() {
    }

    public Gerente(String cpf, String nome, String email, String codigo) {
        super(cpf, nome, email);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Gerente \nNome: " + nome + ", CPF: " + cpf + ", Código Gerente: " + codigo + "";
    }
}
