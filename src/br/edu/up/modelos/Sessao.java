package br.edu.up.modelos;

public class Sessao {

    private String nomeFilme;
    private int sala;
    private String data;
    private String horario;
    private String legenda;
    private String audio;
    private String assento;
    
    public Sessao(String nomeFilme, int sala, String data, String horario, String legenda, String audio, String assento) {
        this.nomeFilme = nomeFilme;
        this.sala = sala;
        this.data = data;
        this.horario = horario;
        this.legenda = legenda;
        this.audio = audio;
        this.assento = assento;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
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

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    @Override
    public String toString() {
        return "Ingresso [nomeFilme=" + nomeFilme + ", sala=" + sala + ", data=" + data + ", horario=" + horario
                + ", legenda=" + legenda + ", audio=" + audio + ", assento=" + assento + "]";
    }
}
