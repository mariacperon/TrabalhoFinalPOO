/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import entity.Lugar;
import entity.Obra;
import entity.Personagem;
import entity.TermoGeral;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author note-maria
 */
public class ConfigArquivos {
    
    public void salvarPersonagem(Personagem personagem) {        
        File arquivo = new File("ect\\Personagem.csv");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(personagem);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    public void salvarGeral(TermoGeral termoGeral) {        
        File arquivo = new File("ect\\Geral.csv");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(termoGeral);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void salvarObra(Obra obra) {        
        File arquivo = new File("ect\\Obra.csv");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(obra);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
