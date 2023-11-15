/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import config.ConfigArquivos;
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
    private UUID uuidTermo;
    
    private ConfigArquivos configArquivos;
    
    public Obra() {
    }

    public Obra(String nome, Date anoLancamento, Categoria categoria, UUID uuidTermo) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
        this.uuidTermo = uuidTermo;
    }
    
    public Obra cadastrarObra(String nome, Date anoLancamento, Categoria categoria, UUID uuidTermo) {
        Obra newObra = new Obra(nome, anoLancamento, categoria, uuidTermo);
        configArquivos.salvarObra(newObra);
        return newObra;
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

    public UUID getUuidTermo() {
        return uuidTermo;
    }

    public void setUuidTermo(UUID uuidTermo) {
        this.uuidTermo = uuidTermo;
    }
    
    
    
}
