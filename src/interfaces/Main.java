package interfaces;

import entity.Categoria;
import entity.Lugar;
import entity.Obra;
import entity.Personagem;
import entity.Termo;
import entity.TermoGeral;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcpgoncalves
 */
public class Main {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("L - para lugar: \n"
                + "P - para personagem \n"
                + "G - para geral");
        String resp = sc.next();
        
        Termo termoConfig = null;
        
        if (resp.equalsIgnoreCase("l")) {
            termoConfig = new Lugar();
        } else if (resp.equalsIgnoreCase("p")) {
            termoConfig = new Personagem();
        } else {
            termoConfig = new TermoGeral();
        }
        
        Termo termo = cadastraTermo(termoConfig);
        termoConfig.cadastrarTermo(termo);
        
        System.out.println(termoConfig.retornaTermos());
        
        termoConfig.removerTermo(termo);
        
        System.out.println(termoConfig.retornaTermos());
    }
    
    private static Termo cadastraTermo(Termo termo) {
        if (termo instanceof Lugar) {
            return mockarLugar();
        } else if (termo instanceof Personagem) {
            return mockarPersonagem();
        }
        
        return mockarGeral();
    }
    
    private static Lugar mockarLugar() {
        Lugar lugar = new Lugar("jardim", "teste teste", "testetestetestes");
        Obra obr1 = new Obra("teste", Categoria.JOGOS, 2023, 1, 1);
        Obra obr2 = new Obra("teste2", Categoria.FILME, 2024, 1, 1);
        
        lugar.setObras(List.of(obr1, obr2));
        
        return lugar;
    }
    
    private static Personagem mockarPersonagem() {
        Personagem personagem = new Personagem("Teste Silva", "teste teste", 
                "Loiro chato", List.of("Aquele loirinho la"), "Ser chato e feio");
        Obra obr1 = new Obra("Livro 1", Categoria.LIVRO, 2023, 1, 1);
        Obra obr2 = new Obra("Filme 1", Categoria.FILME, 2024, 1, 1);
        
        personagem.setObras(List.of(obr1, obr2));
        
        return personagem;
    }
    
    private static TermoGeral mockarGeral() {
        TermoGeral geral = new TermoGeral("Livro", "Livro grandao");
        
        Obra obr1 = new Obra("Livro 2", Categoria.LIVRO, 2023, 1, 1);
        Obra obr2 = new Obra("Filme 3", Categoria.FILME, 2024, 1, 1);
        
        geral.setObras(List.of(obr1, obr2));
        
        return geral;
    }
}
