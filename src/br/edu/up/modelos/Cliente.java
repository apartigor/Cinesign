package br.edu.up.modelos;

public class Cliente extends Pessoa {
    private String celular;
    private String dataNasc;

    public Cliente(String cpf, String nome, String email, String celular, String dataNasc) {
        super(cpf, nome, email);
        this.celular = celular;
        this.dataNasc = dataNasc;
    }

    public String getCelular() {
        return celular;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    @Override
    public String toString() {
        return "Cliente \nNome: " + nome + ", CPF: " + cpf + ", Número Celular: " + celular + " Data de Nascimento: " + dataNasc + ", Email: "
                + email + "";
    }
}
