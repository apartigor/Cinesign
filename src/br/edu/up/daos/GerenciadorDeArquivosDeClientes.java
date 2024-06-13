package br.edu.up.daos;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.edu.up.modelos.Cliente;

public class GerenciadorDeArquivosDeClientes {

    private static final String nomeArquivo = "src\\br\\edu\\up\\resources\\clientes.csv";

    public static void salvarCliente(Cliente cliente) {
        
        try {
            
            boolean arquivoExiste = new File(nomeArquivo).exists();
            
            FileWriter escritor = new FileWriter(nomeArquivo, true); 

            if (!arquivoExiste) {
                
                escritor.write("Nome;CPF;Numero;Email;DatadeNascimento\n");
            }

            escritor.write(cliente.getNome() + ";" + cliente.getCpf() + ";" + cliente.getCelular() + ";" + cliente.getEmail() + ";" + cliente.getDataNasc() + "\n");

            escritor.flush();
            
            escritor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Cliente> listarClientesCsv() {

        ArrayList<Cliente> listaCLiente = new ArrayList<>();

        try {
            
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));

            String linha;
            boolean primeiraLinha = true;

            while ((linha = leitor.readLine()) != null) {
                
                if (primeiraLinha) {
                    
                    primeiraLinha = false;
                    continue;

                }

                String[] dados = linha.split(";");

                String nome = dados[0];
                String cpf = dados[1];
                String celular = dados[2];
                String email = dados[3];
                String dataNasc = dados[4];

                Cliente cliente = new Cliente(nome, cpf, celular, email, dataNasc);

                listaCLiente.add(cliente);

                    System.out.println("Nome: " + nome + " - CPF: " + cpf + " - Celular: " + celular + " - Email: " + email + " - Data de Nascimento: " + dataNasc);
                }

                leitor.close();
                } catch (IOException e) {
                    e.printStackTrace();
        }

        return listaCLiente;
    }
}
