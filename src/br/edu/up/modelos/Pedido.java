package br.edu.up.modelos;

public class Pedido {
    private int codigo;
    private double valorTotal;
    private String tipoPagamento;
    
    public Pedido() {
    }

    public Pedido(int codigo, double valorTotal, String tipoPagamento) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Pedido [codigo=" + codigo + ", valorTotal=" + valorTotal + ", tipoPagamento=" + tipoPagamento + "]";
    }

}
