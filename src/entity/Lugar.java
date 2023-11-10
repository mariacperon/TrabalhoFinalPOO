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
public class Lugar extends Termo{
    
    private String descricaoDetalhada;

    public Lugar(int id, String nome, String descricao, List<Obra> obras,
            String descricaoDetalhada, Termo termo) {
        super(id, nome, descricao, obras);
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }
    
    
}
