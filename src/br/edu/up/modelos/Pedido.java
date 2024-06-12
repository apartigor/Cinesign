package br.edu.up.modelos;

public class Pedido {
    private int codigo;
    private double valorTotal;
    private String tipoPagamento;
    private Sessao sessao;
    
    public Pedido() {
    }

    public Pedido(int codigo, double valorTotal, String tipoPagamento, Sessao sessao) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        this.tipoPagamento = tipoPagamento;
        this.sessao = sessao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return "Pedido \nCodigo: " + codigo + ", ValorTotal: " + valorTotal + ", TipoPagamento: " + tipoPagamento + ", Sessão: " + sessao;
    }

}
