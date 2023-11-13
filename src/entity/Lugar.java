/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import config.ConfigArquivos;
import java.util.UUID;

/**
 *
 * @author mcpgoncalves
 */
public class Lugar extends Termo{
    
    private String descricaoDetalhada;
    
    private ConfigArquivos configArquivos;

    public Lugar(String nome, String descricao, String descricaoDetalhada) {
        super(UUID.randomUUID(), nome, descricao);
        this.descricaoDetalhada = descricaoDetalhada;
    }
    
    public Lugar cadastrarLugar(String nome, String descricao, String descricaoDetalhada) {
        Lugar lugar = new Lugar(nome, descricao, descricaoDetalhada);
        configArquivos.salvarLugar(lugar);
        return lugar;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }
    
    
}
