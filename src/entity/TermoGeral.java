/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author note-maria
 */
public class TermoGeral extends Termo implements Serializable{

    public TermoGeral(String nome, String descricao) {
        super(nome, descricao);
    }
    
    
    public void cadastrarTermosGerais(List<TermoGeral> termosGerais) {
        List<TermoGeral> termosGeraisNew = retornaTermosGerais();
        
        System.out.println("iniciando salvar TermoGeral");
        termosGeraisNew.addAll(termosGerais);
        
        salvarTermoGeral(termosGeraisNew);
        
        System.out.println("finalizando salvar TermoGeral");
    }
    
    private void salvarTermoGeral(List<TermoGeral> termosGerais) {        
        File arquivo = new File("ect\\Geral.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(termosGerais);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public List<TermoGeral> retornaTermosGerais() {
        List<TermoGeral> termosGerais = new ArrayList<>();
        File arquivo = new File("ect\\Geral.dat");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            List<TermoGeral> termosGeraisRetorno = (List<TermoGeral>) ois.readObject();
            
            for (TermoGeral termoGeral : termosGeraisRetorno) {
                termosGerais.add(termoGeral);
            }
        } catch (Exception ex) {
            return termosGerais;
        }
        
        return termosGerais;
    }
}
