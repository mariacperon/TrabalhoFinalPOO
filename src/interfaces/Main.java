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
        
        lugarConfig.cadastrarLugar(mockarLugar());
        
        System.out.println(lugarConfig.retornaLugares());
        
        List<Lugar> lugares = lugarConfig.buscarLugares("JOGO");
        
        System.out.println(lugares);
    }
    
    private static Lugar mockarLugar() {
        Lugar lugar = new Lugar("jardim", "teste teste", "testetestetestes");
        Obra obr1 = new Obra("teste", Categoria.JOGOS, 2023, 1, 1);
        Obra obr2 = new Obra("teste2", Categoria.FILME, 2024, 1, 1);
        
        lugar.setObras(List.of(obr1, obr2));
        
        return lugar;
    }
}
