package br.edu.up.modelos;

public class Pedido {
    private String codigo;
    private String valorTotal;
    private String tipoPagamento;
    
    public Pedido() {
    }

    public Pedido(String codigo, String valorTotal, String tipoPagamento) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        this.tipoPagamento = tipoPagamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Pedido \nCodigo: " + codigo + ", ValorTotal: " + valorTotal + ", TipoPagamento: " + tipoPagamento;
    }

}
