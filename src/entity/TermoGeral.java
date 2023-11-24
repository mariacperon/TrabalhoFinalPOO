/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import config.FileConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author note-maria
 */
public class TermoGeral extends Termo implements Serializable{
        
    public TermoGeral() {
    }

    public TermoGeral(String nome, String descricao) {
        super(nome, descricao);
    }  
    
    @Override
    public void cadastrarTermo(Termo termo) {
        List<TermoGeral> termosGeraisNew = (List<TermoGeral>) retornaTermos();
        
        System.out.println("iniciando salvar TermoGeral");
        termosGeraisNew.add((TermoGeral) termo);
        
        fileConfig.salvarTermo(termosGeraisNew);
        
        System.out.println("finalizando salvar TermoGeral");
    }

    @Override
    public List<? extends Termo> retornaTermos() {
        return fileConfig.retornaTermos(new TermoGeral());
    }

    @Override
    public List<? extends Termo> filtrarTermos(String termo) {
        System.out.println("iniciando pesquisa de lugares por termo");
        List<TermoGeral> termos = (List<TermoGeral>) retornaTermos();
        List<TermoGeral> pesquisaTermos = new ArrayList<>();
        
        for(TermoGeral termoGeral: termos){
            if (termoGeral.getNome().toLowerCase().contains(termo.toLowerCase())) {
                pesquisaTermos.add(termoGeral);
            } else if (termoGeral.getDescricao().toLowerCase().contains(termo.toLowerCase())) {
                pesquisaTermos.add(termoGeral);
            } else {
                for(Obra obra : termoGeral.getObras()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    if (sdf.format(obra.getAnoLancamento()).contains(termo.toLowerCase())) {
                        pesquisaTermos.add(termoGeral);
                    } else if(obra.getNome().toLowerCase().contains(termo.toLowerCase())) {
                        pesquisaTermos.add(termoGeral);
                    } else if (obra.getCategoria().toString().toLowerCase().contains(termo.toLowerCase())) {
                        pesquisaTermos.add(termoGeral);
                    }
                }
            }
        }
        
        System.out.println("finalizando pesquisa de lugares por termo");
        
        return pesquisaTermos;
    }
    
    @Override
    public String toString() {
        return "TermoGeral={" + 
                "nome=" + getNome() +
                ", descricao=" + getDescricao() +
                ", obras=" + getObras() + 
                '}';
    } 
    
}
