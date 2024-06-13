package br.edu.up.modelos;

public class Cliente extends Pessoa {
    private String celular;
    private String dataNasc;

    public Cliente(){

    }
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

    public void setCelular(String celular) {
        this.celular = celular;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "\nCliente  \nNome: " + nome + "\nCPF: " + cpf + "\nNúmero Celular: " + celular + "\nData de Nascimento: " + dataNasc + "\nEmail: "
                + email + "";
    }
}
