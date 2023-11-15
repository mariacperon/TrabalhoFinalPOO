/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import config.ConfigArquivos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author mcpgoncalves
 */
public class Lugar extends Termo implements Serializable{
    
    private String descricaoDetalhada;
    private int teste;

    public Lugar(String nome, String descricao, String descricaoDetalhada) {
        super(UUID.randomUUID(), nome, descricao);
        this.descricaoDetalhada = descricaoDetalhada;
    }
    
    public Lugar cadastrarLugar(Lugar lugar) {
        salvarLugar(lugar);
        return lugar;
    }
    
    private void salvarLugar(Lugar lugar) {        
        File arquivo = new File("ect\\Lugar.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(lugar);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public List<Lugar> retornaLugar() {
        List<Lugar> lugares = new ArrayList<>();
        File arquivo = new File("ect\\Lugar.dat");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            List<Lugar> lugaresRetorno = (ArrayList) ois.readObject();
            
            for (Lugar lugar : lugaresRetorno) {
                lugares.add(lugar);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return lugares;
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
                "id=" + getId() +
                ", nome=" + getNome() +
                ", descricao=" + getDescricao() +
                ", descricaoDetalhada=" + descricaoDetalhada + 
                '}';
    }
    
}
