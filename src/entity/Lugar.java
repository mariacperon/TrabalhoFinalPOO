/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author mcpgoncalves
 */
public class Lugar extends Termo{
    
    private String descricaoDetalhada;

    public Lugar(String descricaoDetalhada, Termo termo) {
        super(termo);
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }
    
    
}
