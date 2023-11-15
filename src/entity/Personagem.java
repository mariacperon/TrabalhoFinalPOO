/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import config.ConfigArquivos;
import java.io.Serializable;
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
    
    private ConfigArquivos configArquivos;

    public Personagem(String nome, String descricao, 
            String caracteristicas, List<String> atores, String feitos) {
        super(UUID.randomUUID(), nome, descricao);
        this.caracteristicas = caracteristicas;
        this.atores = atores;
        this.feitos = feitos;
    }

    public Personagem cadastrarPersonagem(String nome, String descricao, List<Obra> obras,
            String caracteristicas, List<String> atores, String feitos) {
        Personagem personagem = 
                new Personagem(nome, descricao, caracteristicas, atores, feitos);
        configArquivos.salvarPersonagem(personagem);
        return personagem;
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
    
}
