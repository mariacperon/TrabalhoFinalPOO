/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
    
    @Override
    public void cadastrarTermo(Termo termo) {
        List<Lugar> lugaresNew = (List<Lugar>) retornaTermos();
        
        System.out.println("iniciando salvar lugares");
        lugaresNew.add((Lugar) termo);
        
        fileConfig.salvarTermo(lugaresNew);
        
        System.out.println("finalizando salvar lugares");
    }
    
    @Override
    public List<? extends Termo> retornaTermos() {
        return fileConfig.retornaTermos(new Lugar());
    }
    
    @Override
    public List<? extends Termo> filtrarTermos(String termo) {
        System.out.println("iniciando pesquisa de lugares por termo");
        List<Lugar> lugares = (List<Lugar>) retornaTermos();
        List<Lugar> pesquisaLugares = new ArrayList<>();
        
        for(Lugar lugar: lugares){
            if (lugar.descricaoDetalhada.toLowerCase().contains(termo.toLowerCase())) {
                pesquisaLugares.add(lugar);
            } else if (lugar.getNome().toLowerCase().contains(termo.toLowerCase())) {
                pesquisaLugares.add(lugar);
            } else if (lugar.getDescricao().toLowerCase().contains(termo.toLowerCase())) {
                pesquisaLugares.add(lugar);
            } else {
                for(Obra obra : lugar.getObras()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    if (sdf.format(obra.getAnoLancamento()).contains(termo.toLowerCase())) {
                        pesquisaLugares.add(lugar);
                    } else if(obra.getNome().toLowerCase().contains(termo.toLowerCase())) {
                        pesquisaLugares.add(lugar);
                    } else if (obra.getCategoria().toString().toLowerCase().contains(termo.toLowerCase())) {
                        pesquisaLugares.add(lugar);
                    }
                }
            }
        }
        
        System.out.println("finalizando pesquisa de lugares por termo");
        
        return pesquisaLugares;
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
