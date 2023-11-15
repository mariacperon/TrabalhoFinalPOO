/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author mcpgoncalves
 */
public abstract class Termo implements Serializable{
    
    private UUID id;
    private String nome;
    private String descricao;
    private List<Obra> obras;

    public Termo(UUID id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public void cadastrarObra(String nome, Date anoLancamento, Categoria categoria, UUID uuidTermo) {
        Obra newObra = new Obra();
        newObra.cadastrarObra(nome, anoLancamento, categoria, uuidTermo);
        obras.add(newObra);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
