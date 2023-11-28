/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
    
    /**
     * Este método recebe um TermoGeral para ser cadastrado no arquivo Geral.dat
     * 
     * @param termo instanceof TermoGeral
     */
    @Override
    public void cadastrarTermo(Termo termo) {
        List<TermoGeral> termosGeraisNew = (List<TermoGeral>) retornaTermos();
        
        System.out.println("iniciando salvar TermoGeral");
        termosGeraisNew.add((TermoGeral) termo);
        
        cadastrarGeral(termosGeraisNew);
        
        System.out.println("finalizando salvar TermoGeral");
    }

    /**
     * Este método retorna todos os termos gerais já cadastrados no arquivo Geral.dat
     * 
     * @return lista de termos instanceof TermoGeral
     */
    @Override
    public List<? extends Termo> retornaTermos() {
        return fileConfig.retornaTermos(new TermoGeral());
    }

    /**
     * Este método recebe uma string que remete ao campo desejado para filtrar 
     * e retorna uma lista de termos instanceof TermoGeral que se adequam ao filtro
     * 
     * @param filtro
     * @return lista de termos instanceof TermoGeral que se adequam ao filtro inserido
     */
    @Override
    public List<? extends Termo> filtrarTermos(String filtro) {
        System.out.println("iniciando pesquisa de lugares por termo");
        List<TermoGeral> termos = (List<TermoGeral>) retornaTermos();
        List<TermoGeral> pesquisaTermos = new ArrayList<>();
        
        for(TermoGeral termoGeral: termos){
            if (termoGeral.getNome().toLowerCase().contains(filtro.toLowerCase())) {
                pesquisaTermos.add(termoGeral);
            } else if (termoGeral.getDescricao().toLowerCase().contains(filtro.toLowerCase())) {
                pesquisaTermos.add(termoGeral);
            }
        }
        
        System.out.println("finalizando pesquisa de lugares por termo");
        
        return pesquisaTermos;
    }
    
    /**
     * Recebe o termo geral a ser excluido e o remove do arquivo TermoGeral.dat
     * 
     * @param termo instanceof TermoGeral
     */
    @Override
    public void removerTermo(Termo termo) {
        List<TermoGeral> termosGerais = (List<TermoGeral>) retornaTermos();
        TermoGeral p = (TermoGeral) termo;
        
        termosGerais.removeIf(x -> ehIgual(p, x));
        
        cadastrarGeral(termosGerais);
    }
    
    private void cadastrarGeral(List<TermoGeral> gerais) {
        fileConfig.salvarTermo(gerais, new TermoGeral());
    }
    
    private boolean ehIgual (TermoGeral p, TermoGeral x) {
        return x.getNome().equals(p.getNome()) &&
                    x.getDescricao().equals(p.getDescricao());
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
