/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import entity.Lugar;
import entity.Personagem;
import entity.Termo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author note-maria
 */
public class FileConfig implements Serializable{
    
    public static String FILE_PERSONAGEM = "Personagem.dat";
    public static String FILE_LUGAR = "Lugar.dat";
    public static String FILE_GERAL = "Geral.dat";
    
    /**
     * Recebe uma lista de termos e cadastra no arquivo de acordo com a sua 
     * instancia
     * 
     * @param termos 
     */
    public void salvarTermo(List<? extends Termo> termos) {        
        File arquivo = new File("ect\\"+  retornaFileName(termos));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(termos);
            oos.flush();
        } catch (Exception ex) {
            return;
        }
    }
    
    /**
     * Recebe uma instancia de termo e retorna a lista de termos cadastradas no
     * arquivo de acordo com a instancia
     * 
     * @param termo
     * @return lista de termos
     */
    public List<? extends Termo> retornaTermos(Termo termo) {
        List<? extends Termo> termos = new ArrayList<>();
        File arquivo = new File("ect\\"+ retornaFileName(List.of(termo)));
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            termos = (List<? extends Termo>) ois.readObject();

        } catch (Exception ex) {
            return termos;
        }
        
        return termos;
    }
    
    private String retornaFileName(List<? extends Termo> termo){
        if (termo instanceof Personagem) {
            return FILE_PERSONAGEM;
        } else if (termo instanceof Lugar) {
            return FILE_LUGAR;
        }
        
        return FILE_GERAL;
    }
    
}
