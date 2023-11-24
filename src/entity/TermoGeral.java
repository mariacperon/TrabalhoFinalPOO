/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

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
        
        fileConfig.salvarTermo(termosGeraisNew);
        
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
            } else {
                for(Obra obra : termoGeral.getObras()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    if (sdf.format(obra.getAnoLancamento()).contains(filtro.toLowerCase())) {
                        pesquisaTermos.add(termoGeral);
                    } else if(obra.getNome().toLowerCase().contains(filtro.toLowerCase())) {
                        pesquisaTermos.add(termoGeral);
                    } else if (obra.getCategoria().toString().toLowerCase().contains(filtro.toLowerCase())) {
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
