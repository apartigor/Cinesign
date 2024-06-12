package br.edu.up.controles;

import java.util.List;

import br.edu.up.modelos.Cliente;

import java.util.ArrayList;

public class ControleDeCadastroCliente {

    private List<Cliente> clientes = new ArrayList<>();

    
    public List<Cliente> listarClientes(){
        return clientes;
    }

    public void adicionarCliente(Cliente objCliente){

        clientes.add(objCliente);
    }

    

    
}
