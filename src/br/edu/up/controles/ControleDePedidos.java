package br.edu.up.controles;
import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Pedido;

public class ControleDePedidos {

    private List<Pedido> pedidos = new ArrayList<>();

    
    public List<Pedido> listarPedidos(){
        return pedidos;
        }
        
    public void salvarPedidos(){
         
    }
        
    public void adicionarpedido(Pedido objPedido){
        pedidos.add(objPedido);
    }
}
