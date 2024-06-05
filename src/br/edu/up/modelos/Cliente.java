package br.edu.up.modelos;

public class Cliente extends Pessoa {
    private String celular;
    private String dataNasc;

    public Cliente(String cpf, String nome, String email, String celular, String dataNasc) {
        super(cpf, nome, email);
        this.celular = celular;
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Cliente [nome= " + nome + ", cpf=" + cpf + ", celular=" + celular + " dataNasc=" + dataNasc + ", email="
                + email + "]";
    }

}
