/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mcpgoncalves
 */
public class Personagem extends Termo implements Serializable{
    
    private String caracteristicas;
    private List<String> atores;
    private String feitos;
    
    public Personagem(){
        super();
    }

    public Personagem(String nome, String descricao, 
            String caracteristicas, List<String> atores, String feitos) {
        super(nome, descricao);
        this.caracteristicas = caracteristicas;
        this.atores = atores;
        this.feitos = feitos;
    }
    
    /**
     * Este método recebe um Personagem para ser cadastrado no arquivo Personagem.dat
     * 
     * @param termo instanceof Personagem
     */
    @Override
    public void cadastrarTermo(Termo termo) {
        List<Personagem> personagensNew = (List<Personagem>) retornaTermos();
        
        System.out.println("iniciando salvar personagem");
        personagensNew.add((Personagem) termo);
        
        cadastrarPersonagens(personagensNew);
        
        System.out.println("finalizando salvar personagem");    
    }

    /**
     * Este método retorna todos os personagens já cadastrados no arquivo Personagem.dat
     * 
     * @return lista de termos instanceof Personagem
     */
    @Override
    public List<? extends Termo> retornaTermos() {
        return fileConfig.retornaTermos(new Personagem());
    }

    /**
     * Este método recebe uma string que remete ao campo desejado para filtrar 
     * e retorna uma lista de termos instanceof Personagem que se adequam ao filtro
     * 
     * @param filtro
     * @return lista de termos instanceof Personagem que se adequam ao filtro inserido
     */
    @Override
    public List<? extends Termo> filtrarTermos(String filtro) {
        System.out.println("iniciando pesquisa de personagens por termo");
        List<Personagem> personagens = (List<Personagem>) retornaTermos();
        List<Personagem> pesquisaPersonagens = new ArrayList<>();
        
        for(Personagem personagem: personagens){
            personagem.getAtores().forEach(a -> a.toLowerCase());
            
            if (personagem.caracteristicas.toLowerCase().contains(filtro.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.feitos.toLowerCase().contains(filtro.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.getNome().toLowerCase().contains(filtro.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.getDescricao().toLowerCase().contains(filtro.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.getAtores().contains(filtro.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else {
                for(Obra obra : personagem.getObras()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    if (sdf.format(obra.getAnoLancamento()).contains(filtro.toLowerCase())) {
                        pesquisaPersonagens.add(personagem);
                    } else if(obra.getNome().toLowerCase().contains(filtro.toLowerCase())) {
                        pesquisaPersonagens.add(personagem);
                    } else if (obra.getCategoria().toString().toLowerCase().contains(filtro.toLowerCase())) {
                        pesquisaPersonagens.add(personagem);
                    }
                }
            }
        }
        
        System.out.println("finalizando pesquisa de personagens por termo");
        
        return pesquisaPersonagens;
    }
    
    
    /**
     * Recebe o personagem a ser excluido e o remove do arquivo Personagem.dat
     * 
     * @param termo instanceof Personagem
     */
    @Override
    public void removerTermo(Termo termo) {
        List<Personagem> personagens = (List<Personagem>) retornaTermos();
        Personagem p = (Personagem) termo;
        
        personagens.removeIf(x -> ehIgual(p, x));
        
        cadastrarPersonagens(personagens);
    }
    
    private void cadastrarPersonagens(List<Personagem> personagens) {
        fileConfig.salvarTermo(personagens);
    }
    
    private boolean ehIgual (Personagem p, Personagem x) {
        return x.getNome().equals(p.getNome()) &&
                    x.getCaracteristicas().equals(p.getCaracteristicas()) &&
                    x.getDescricao().equals(p.getDescricao()) &&
                    x.getFeitos().equals(x.getFeitos());
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }

    public String getFeitos() {
        return feitos;
    }

    public void setFeitos(String feitos) {
        this.feitos = feitos;
    }    
    
    @Override
    public String toString() {
        return "Personagem={" + 
                "nome=" + getNome() +
                ", descricao=" + getDescricao() +
                ", caracteristicas=" + caracteristicas + 
                ", atores=" + atores + 
                ", feitos=" + feitos + 
                ", obras=" + getObras() +
                '}';
    } 
    
}
