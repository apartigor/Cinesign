package br.edu.up.modelos;

public class Ingresso {

    private Filme nomeFilme;
    private int sala;
    private String data;
    private String horario;
    private String idiomaLegenda;
    private String idiomaAudio;
    private String assento;
    
    public Ingresso(Filme nomeFilme, int sala, String data, String horario, String idiomaLegenda, String idiomaAudio, String assento) {
        this.nomeFilme = nomeFilme;
        this.sala = sala;
        this.data = data;
        this.horario = horario;
        this.idiomaLegenda = idiomaLegenda;
        this.idiomaAudio = idiomaAudio;
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

    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }

    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    public String getIdiomaAudio() {
        return idiomaAudio;
    }

    public void setIdiomaAudio(String idiomaAudio) {
        this.idiomaAudio = idiomaAudio;
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
                + ", idiomaLegenda=" + idiomaLegenda + ", idiomaAudio=" + idiomaAudio + ", assento=" + assento + "]";
    }
}
