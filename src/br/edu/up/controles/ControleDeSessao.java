package br.edu.up.controles;
import br.edu.up.modelos.Sessao;
import java.util.ArrayList;
import java.util.List;

public class ControleDeSessao {
    
    private final List<Sessao> sessoes = new ArrayList<>();

    
    public List<Sessao> listarSessao(){
        return sessoes;
        }
        
    public void salvarFilmes(){
         
    }
        
    public void adicionarSessao(Sessao objSessao){
        sessoes.add(objSessao);
    }

    public void excluirSessao(String codigo){
        for (Sessao sessao : sessoes) {
            if(codigo.equals(sessao.getCodigoSessao())){
                sessoes.remove(sessao);
            }
            else{
                System.out.println("Digite um código válido!");
            }
        }
    }

}
