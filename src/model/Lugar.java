/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mcpgoncalves
 */
public class Lugar extends Termo implements Serializable{
    
    private String descricaoDetalhada;
    
    public Lugar(){
        super();
    }

    public Lugar(String nome, String descricao, String descricaoDetalhada) {
        super(nome, descricao);
        this.descricaoDetalhada = descricaoDetalhada;
    }
    
    /**
     * Este método recebe um Lugar para ser cadastrado no arquivo Lugar.dat
     * 
     * @param termo instanceof Lugar
     */
    @Override
    public void cadastrarTermo(Termo termo) {
        List<Lugar> lugaresNew = (List<Lugar>) retornaTermos();
        
        System.out.println("iniciando salvar lugares");
        lugaresNew.add((Lugar) termo);
        
        cadastrarLugares(lugaresNew);
        
        System.out.println("finalizando salvar lugares");
    }
    
    /**
     * Este método retorna todos os lugares já cadastrados no arquivo Lugar.dat
     * 
     * @return lista de termos instanceof Lugar
     */
    @Override
    public List<? extends Termo> retornaTermos() {
        return fileConfig.retornaTermos(new Lugar());
    }
    
    /**
     * Este método recebe uma string que remete ao campo desejado para filtrar 
     * e retorna uma lista de termos instanceof Lugar que se adequam ao filtro
     * 
     * @param filtro
     * @return lista de termos instanceof Lugar que se adequam ao filtro inserido
     */
    @Override
    public List<? extends Termo> filtrarTermos(String filtro) {
        System.out.println("iniciando pesquisa de lugares por termo");
        List<Lugar> lugares = (List<Lugar>) retornaTermos();
        List<Lugar> pesquisaLugares = new ArrayList<>();
        
        for(Lugar lugar: lugares){
            if (lugar.descricaoDetalhada.toLowerCase().contains(filtro.toLowerCase())) {
                pesquisaLugares.add(lugar);
            } else if (lugar.getNome().toLowerCase().contains(filtro.toLowerCase())) {
                pesquisaLugares.add(lugar);
            } else if (lugar.getDescricao().toLowerCase().contains(filtro.toLowerCase())) {
                pesquisaLugares.add(lugar);
            } else {
                for(Obra obra : lugar.getObras()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    if (sdf.format(obra.getAnoLancamento()).contains(filtro.toLowerCase())) {
                        pesquisaLugares.add(lugar);
                    } else if(obra.getNome().toLowerCase().contains(filtro.toLowerCase())) {
                        pesquisaLugares.add(lugar);
                    } else if (obra.getCategoria().toString().toLowerCase().contains(filtro.toLowerCase())) {
                        pesquisaLugares.add(lugar);
                    }
                }
            }
        }
        
        System.out.println("finalizando pesquisa de lugares por termo");
        
        return pesquisaLugares;
    }
    
    /**
     * Recebe o lugar a ser excluido e o remove do arquivo Lugar.dat
     * 
     * @param termo instanceof Lugar
     */
    @Override
    public void removerTermo(Termo termo) {
        List<Lugar> lugares = (List<Lugar>) retornaTermos();
        Lugar p = (Lugar) termo;
        
        lugares.removeIf(x -> ehIgual(p, x));
        
        cadastrarLugares(lugares);
    }
    
    private void cadastrarLugares(List<Lugar> lugares) {
        fileConfig.salvarTermo(lugares);
    }
    
    private boolean ehIgual (Lugar p, Lugar x) {
        return x.getNome().equals(p.getNome()) &&
                    x.getDescricaoDetalhada().equals(p.getDescricaoDetalhada()) &&
                    x.getDescricao().equals(p.getDescricao());
    }
    
    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }

    @Override
    public String toString() {
        return "Lugar={" + 
                "nome=" + getNome() +
                ", descricao=" + getDescricao() +
                ", obras=" + getObras() +
                ", descricaoDetalhada=" + descricaoDetalhada + 
                '}';
    } 
    
}
