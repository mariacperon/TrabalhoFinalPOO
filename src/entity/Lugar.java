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
    
    public void cadastrarLugar(Lugar lugar) {        
        List<Lugar> lugaresNew = retornaLugares();
        
        System.out.println("iniciando salvar lugares");
        lugaresNew.add(lugar);
        
        salvarLugar(lugaresNew);
        
        System.out.println("finalizando salvar lugares");
    }
    
    private void salvarLugar(List<Lugar> lugares) {        
        File arquivo = new File("ect\\Lugar.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(lugares);
            oos.flush();
        } catch (Exception ex) {
            return;
        }
    }
    
    public List<Lugar> retornaLugares() {
        List<Lugar> lugares = new ArrayList<>();
        File arquivo = new File("ect\\Lugar.dat");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            List<Lugar> lugaresRetorno = (List<Lugar>) ois.readObject();
            
            for (Lugar lugar : lugaresRetorno) {
                lugares.add(lugar);
            }
        } catch (Exception ex) {
            return lugares;
        }
        
        return lugares;
    }
    
    public List<Lugar> buscarLugares(String termo) {
        System.out.println("iniciando pesquisa de lugares por termo");
        List<Lugar> lugares = retornaLugares();
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
        return "Lugar{" + 
                "nome=" + getNome() +
                ", descricao=" + getDescricao() +
                ", obras=" + getObras() +
                ", descricaoDetalhada=" + descricaoDetalhada + 
                '}';
    }
    
}
