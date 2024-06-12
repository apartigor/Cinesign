package br.edu.up.controles;
import br.edu.up.modelos.Sessao;
import br.edu.up.modelos.Pedido;
import java.util.List;
import java.util.ArrayList;

public class ControleDeSessao {
    
    private ArrayList<Sessao> sessoes = new ArrayList<>();
    private Pedido pedido;

    public void adicionarSessao(Sessao sessao){
        sessoes.add(sessao);
    }

    public List<Sessao> listarSessao(){
        return sessoes;
    }

    public void excluirSessao(String codigo){
        for (Sessao sessao : sessoes) {
            if(codigo.equals(sessao.getCodigo())){
                sessoes.remove(sessao);
            }
            else{
                System.out.println("Digite um código válido!");
            }
        }
    }

    public void selecionarSessao(String codigo){
        for (Sessao sessao : sessoes) {
            if(codigo.equals(sessao.getCodigo())){
                pedido.setSessao(sessao);
            }
            else{
                System.out.println("Digite um código válido!");
            }
        }
    }
}
