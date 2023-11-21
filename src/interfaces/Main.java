package interfaces;

import entity.Categoria;
import entity.Lugar;
import entity.Obra;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        Lugar lugarConfig = new Lugar();
       
        Lugar lugar = new Lugar("teste", "teste teste", "testetestetestes");
        Lugar lugar2 = new Lugar("teste2", "teste", "teixte");
        
        Obra obr1 = new Obra("teste", new Date(2023, 1, 1), 
                Categoria.JOGOS);
        Obra obr2 = new Obra("teste2", new Date(2023, 1, 1), 
                Categoria.FILME);
        
        lugar.setObras(List.of(obr1, obr2));
        
        lugarConfig.cadastrarLugares(List.of(lugar, lugar2));
        
        System.out.println(lugar.retornaLugares());
    }
}
