/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import config.FileConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    
    @Override
    public void cadastrarTermo(Termo termo) {
        List<Personagem> personagensNew = (List<Personagem>) retornaTermos();
        
        System.out.println("iniciando salvar personagem");
        personagensNew.add((Personagem) termo);
        
        fileConfig.salvarTermo(personagensNew);
        
        System.out.println("finalizando salvar personagem");    
    }

    @Override
    public List<? extends Termo> retornaTermos() {
        return fileConfig.retornaTermos(new Personagem());
    }

    @Override
    public List<? extends Termo> filtrarTermos(String termo) {
        System.out.println("iniciando pesquisa de personagens por termo");
        List<Personagem> personagens = (List<Personagem>) retornaTermos();
        List<Personagem> pesquisaPersonagens = new ArrayList<>();
        
        for(Personagem personagem: personagens){
            personagem.getAtores().forEach(a -> a.toLowerCase());
            
            if (personagem.caracteristicas.toLowerCase().contains(termo.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.feitos.toLowerCase().contains(termo.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.getNome().toLowerCase().contains(termo.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.getDescricao().toLowerCase().contains(termo.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.getAtores().contains(termo.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else {
                for(Obra obra : personagem.getObras()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    if (sdf.format(obra.getAnoLancamento()).contains(termo.toLowerCase())) {
                        pesquisaPersonagens.add(personagem);
                    } else if(obra.getNome().toLowerCase().contains(termo.toLowerCase())) {
                        pesquisaPersonagens.add(personagem);
                    } else if (obra.getCategoria().toString().toLowerCase().contains(termo.toLowerCase())) {
                        pesquisaPersonagens.add(personagem);
                    }
                }
            }
        }
        
        System.out.println("finalizando pesquisa de personagens por termo");
        
        return pesquisaPersonagens;
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
