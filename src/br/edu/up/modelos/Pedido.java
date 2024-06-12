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

    @Override
    public String toString() {
        return "Pedido \nCodigo: " + codigo + ", ValorTotal: " + valorTotal + ", TipoPagamento: " + tipoPagamento + ", Sessão: " + sessao;
    }

}
