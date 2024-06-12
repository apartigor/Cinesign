package br.edu.up.modelos;

public class Sessao {

    private String codigoSessao;
    private String nomeFilme;
    private String sala;
    private String data;
    private String horario;
    private String legenda;
    private String audio;

    
    public Sessao(){
    }

    public Sessao(String codigoSessao, String nomeFilme, String sala, String data, String horario, String legenda, String audio) {
        this.codigoSessao = codigoSessao;
        this.nomeFilme = nomeFilme;
        this.sala = sala;
        this.data = data;
        this.horario = horario;
        this.legenda = legenda;
        this.audio = audio;
    }


    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getCodigoSessao() {
        return codigoSessao;
    }

    public void setCodigoSessao(String codigoSessao) {
        this.codigoSessao = codigoSessao;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "Ingresso [nomeFilme=" + nomeFilme + ", sala=" + sala + ", data=" + data + ", horario=" + horario
                + ", legenda=" + legenda + ", audio=" + audio + "]";
    }
}
