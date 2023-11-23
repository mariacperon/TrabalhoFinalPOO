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
    
    public void cadastrarPersonagem(Personagem personagem) {
        List<Personagem> personagensNew = retornaPersonagens();
        
        System.out.println("iniciando salvar personagem");
        personagensNew.add(personagem);
        
        salvarPersonagem(personagensNew);
        
        System.out.println("finalizando salvar personagem");
    }
    
    private void salvarPersonagem(List<Personagem> personagens) {        
        File arquivo = new File("ect\\Personagem.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(personagens);
            oos.flush();
        } catch (Exception ex) {
            return;
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
    
    public List<Personagem> buscarPersonagens(String termo) {
        System.out.println("iniciando pesquisa de personagens por termo");
        List<Personagem> personagens = retornaPersonagens();
        List<Personagem> pesquisaPersonagens = new ArrayList<>();
        
        for(Personagem personagem: personagens){
            personagem.getAtores().forEach(a -> a.toLowerCase());
            
            if (personagem.caracteristicas.toLowerCase().contains(termo.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.feitos.toLowerCase().contains(termo.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.getNome().toLowerCase().contains(termo.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.getDescricao().toLowerCase().contains(termo.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else if (personagem.getAtores().contains(termo.toLowerCase())) {
                pesquisaPersonagens.add(personagem);
            } else {
                for(Obra obra : personagem.getObras()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    if (sdf.format(obra.getAnoLancamento()).contains(termo.toLowerCase())) {
                        pesquisaPersonagens.add(personagem);
                    } else if(obra.getNome().toLowerCase().contains(termo.toLowerCase())) {
                        pesquisaPersonagens.add(personagem);
                    } else if (obra.getCategoria().toString().toLowerCase().contains(termo.toLowerCase())) {
                        pesquisaPersonagens.add(personagem);
                    }
                }
            }
        }
        
        System.out.println("finalizando pesquisa de personagens por termo");
        
        return pesquisaPersonagens;
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
