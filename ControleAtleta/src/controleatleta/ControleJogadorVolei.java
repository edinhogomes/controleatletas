package controleatleta;

import java.util.ArrayList;

public class ControleJogadorVolei {

    private ArrayList<JogadorVolei> listaJogadoresVolei;

    public ControleJogadorVolei() {
        this.listaJogadoresVolei = new ArrayList<JogadorVolei>();
    }
    
    public ArrayList<JogadorVolei> getListaJogadoresVolei() {
        return listaJogadoresVolei;
    }
    
    public void adicionar(JogadorVolei umJogadorVolei) {
        listaJogadoresVolei.add(umJogadorVolei);
    }
    
    public void remover(JogadorVolei umJogadorVolei) {
        listaJogadoresVolei.remove(umJogadorVolei);
    }
    
    public JogadorVolei pesquisar(String nome) {
        for (JogadorVolei b: listaJogadoresVolei) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
}
