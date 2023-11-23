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
import java.text.SimpleDateFormat;
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
    
    public void cadastrarTermoGeral(TermoGeral termoGeral) {
        List<TermoGeral> termosGeraisNew = retornaTermosGerais();
        
        System.out.println("iniciando salvar TermoGeral");
        termosGeraisNew.add(termoGeral);
        
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
    
    public List<TermoGeral> buscarLugares(String termo) {
        System.out.println("iniciando pesquisa de lugares por termo");
        List<TermoGeral> termos = retornaTermosGerais();
        List<TermoGeral> pesquisaTermos = new ArrayList<>();
        
        for(TermoGeral termoGeral: termos){
            if (termoGeral.getNome().toLowerCase().contains(termo.toLowerCase())) {
                pesquisaTermos.add(termoGeral);
            } else if (termoGeral.getDescricao().toLowerCase().contains(termo.toLowerCase())) {
                pesquisaTermos.add(termoGeral);
            } else {
                for(Obra obra : termoGeral.getObras()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    if (sdf.format(obra.getAnoLancamento()).contains(termo.toLowerCase())) {
                        pesquisaTermos.add(termoGeral);
                    } else if(obra.getNome().toLowerCase().contains(termo.toLowerCase())) {
                        pesquisaTermos.add(termoGeral);
                    } else if (obra.getCategoria().toString().toLowerCase().contains(termo.toLowerCase())) {
                        pesquisaTermos.add(termoGeral);
                    }
                }
            }
        }
        
        System.out.println("finalizando pesquisa de lugares por termo");
        
        return pesquisaTermos;
    }
}
