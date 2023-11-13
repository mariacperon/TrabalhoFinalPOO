/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import config.ConfigArquivos;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author note-maria
 */
public class TermoGeral extends Termo{
    
    private ConfigArquivos configArquivos;

    public TermoGeral(String nome, String descricao) {
        super(UUID.randomUUID(), nome, descricao);
    }
    
    public TermoGeral cadastrarTermo(String nome, String descricao) {
        TermoGeral termoGeral = new TermoGeral(nome, descricao);
        configArquivos.salvarGeral(termoGeral);
        return termoGeral;
    }
    
}
