/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author mcpgoncalves
 */
public class Obra implements Serializable{
    
    private String nome;
    private Date anoLancamento;
    private Categoria categoria;
    
    public Obra() {
    }

    public Obra(String nome, Date anoLancamento, Categoria categoria) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Date anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {    
        StringBuilder sb = new StringBuilder();
        sb.append("Obra={");
        sb.append("nome=").append(nome);
        sb.append(", anoLancamento=").append(anoLancamento);
        sb.append(", catergoria=").append(categoria);
        sb.append("}");
        
        return sb.toString();
    }
    
}
