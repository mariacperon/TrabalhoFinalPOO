/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JOptionPane;

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

    public Obra(String nome, Categoria categoria, String ANO) {
        int anoInt = 0;
        try {
            anoInt = Integer.parseInt(ANO);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O ano é inválido");
            return;
        }
        
        if (nome.isBlank() || nome.isBlank()) {
            JOptionPane.showMessageDialog(null, "O nome da obra está inválido");
            return;
        }
        
        this.nome = nome;
        this.anoLancamento = new Date(anoInt-1900, 0, 0);
        this.categoria = categoria;
    }
    
    public Obra(String nome, Categoria categoria, int ANO){
        this.nome = nome;
        this.anoLancamento = new Date(ANO-1900, 0, 0);
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

    public void setAnoLancamento(int ANO, int MES, int DIA) {
        this.anoLancamento = new Date(ANO-1900, MES-1, DIA);
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
