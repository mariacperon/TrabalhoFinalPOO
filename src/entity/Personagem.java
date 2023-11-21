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
public class Personagem extends Termo implements Serializable{
    
    private String caracteristicas;
    private List<String> atores;
    private String feitos;
    
    public Personagem(){
        super();
    }

    public Personagem(String nome, String descricao, 
            String caracteristicas, List<String> atores, String feitos) {
        super(nome, descricao);
        this.caracteristicas = caracteristicas;
        this.atores = atores;
        this.feitos = feitos;
    }
    
    public void cadastrarPersonagens(List<Personagem> personagens) {
        List<Personagem> personagensNew = retornaPersonagens();
        
        System.out.println("iniciando salvar personagem");
        personagensNew.addAll(personagens);
        
        salvarPersonagem(personagensNew);
        
        System.out.println("finalizando salvar personagem");
    }
    
    private void salvarPersonagem(List<Personagem> personagens) {        
        File arquivo = new File("ect\\Personagem.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(personagens);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public List<Personagem> retornaPersonagens() {
        List<Personagem> personagens = new ArrayList<>();
        File arquivo = new File("ect\\Personagem.dat");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) {
            List<Personagem> personagensRetorno = (List<Personagem>) ois.readObject();
            
            for (Personagem personagem : personagensRetorno) {
                personagens.add(personagem);
            }
        } catch (Exception ex) {
            return personagens;
        }
        
        return personagens;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }

    public String getFeitos() {
        return feitos;
    }

    public void setFeitos(String feitos) {
        this.feitos = feitos;
    }    
    
}
