package br.edu.up.controles;
import br.edu.up.modelos.Pedido;
import java.util.ArrayList;
import java.util.List;

public class ControleDePedidos {

    private final List<Pedido> pedidos = new ArrayList<>();

    
    public List<Pedido> listarPedidos(){
        return pedidos;
        }
        
    public void salvarPedidos(){
         
    }
        
    public void adicionarpedido(Pedido objPedido){
        pedidos.add(objPedido);
    }
}
