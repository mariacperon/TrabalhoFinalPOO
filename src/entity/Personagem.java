/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;

/**
 *
 * @author mcpgoncalves
 */
public class Personagem extends Termo{
    
    private String caracteristicas;
    private List<String> atores;
    private String feitos;

    public Personagem(int id, String nome, String descricao, List<Obra> obras,
            String caracteristicas, List<String> atores, String feitos) {
        super(id, nome, descricao, obras);
        this.caracteristicas = caracteristicas;
        this.atores = atores;
        this.feitos = feitos;
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
