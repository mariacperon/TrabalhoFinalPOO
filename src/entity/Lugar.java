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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    
    public void cadastrarLugares(List<Lugar> lugares) {        
        List<Lugar> lugaresNew = retornaLugares();
        
        System.out.println("iniciando salvar lugares");
        lugaresNew.addAll(lugares);
        
        salvarLugar(lugaresNew);
        
        System.out.println("finalizando salvar lugares");
    }
    
    private void salvarLugar(List<Lugar> lugares) {        
        File arquivo = new File("ect\\Lugar.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(lugares);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
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
                "nome=" + getNome() +
                ", descricao=" + getDescricao() +
                ", obras=" + getObras() +
                ", descricaoDetalhada=" + descricaoDetalhada + 
                '}';
    }
    
}
