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
public abstract class Termo {
    
    private int id;
    private String nome;
    private String descricao;
    private List<Obra> obras;

    public Termo(int id, String nome, String descricao, List<Obra> obras) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.obras = obras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }
    
    
    
}
