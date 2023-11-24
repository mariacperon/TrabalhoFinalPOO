/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import config.FileConfig;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author mcpgoncalves
 */
public abstract class Termo implements Serializable{
    
    private String nome;
    private String descricao;
    private List<Obra> obras;
    
    FileConfig fileConfig = new FileConfig();
    
    public Termo() {}

    public Termo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public abstract void cadastrarTermo(Termo termo);
    
    public abstract List<? extends Termo> retornaTermos();
    
    public abstract List<? extends Termo> filtrarTermos(String termo);
    
    public abstract void removerTermo(Termo termo);

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

    @Override
    public String toString() {
        if (obras == null)
            return "null";
            
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i < obras.size(); i++) {
            sb.append(obras.get(i));
            
            if (obras.size() != (i-1)) {
                sb.append(", ");
            }
        }
        
        return sb.toString();
    }
    
}
