package interfaces;

import entity.Lugar;

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
        
        System.out.println("iniciando salvar lugar");
        
        Lugar lugar = new Lugar("teste", "teste teste", "testetestetestes");
        lugar.cadastrarLugar(lugar);
        
        Lugar lugar2 = new Lugar("teste2", "teste", "teixte");
        lugar.cadastrarLugar(lugar2);
        
        System.out.println(lugar.retornaLugar());
        
        System.out.println("finalizando salvar lugar");
    }
}
