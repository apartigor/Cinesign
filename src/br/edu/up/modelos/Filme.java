package br.edu.up.modelos;

public class Filme {
    private int codGerente;
    private String codFilme;
    private String nomeFilme;
    private String generoFilme;
    private String distribuidora;

    public Filme(){

    }

    public Filme(int codGerente, String codFilme, String nomeFilme, String generoFilme, String distribuidora) {
        this.codGerente = codGerente;
        this.codFilme = codFilme;
        this.nomeFilme = nomeFilme;
        this.generoFilme = generoFilme;
        this.distribuidora = distribuidora;
    }

    public int getCodGerente() {
        return codGerente;
    }

    public void setCodGerente(int codGerente) {
        this.codGerente = codGerente;
    }

    public String getCodFilme() {
        return codFilme;
    }

    public void setCodFilme(String codFilme) {
        this.codFilme = codFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    @Override
    public String toString() {
        return "Filme: " + nomeFilme + "\nCódigo: " + codFilme + "\nGênero: " + generoFilme + "\nDistribuidora: " + distribuidora;
    }
}
