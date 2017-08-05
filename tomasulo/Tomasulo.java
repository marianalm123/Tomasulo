/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomasulo;

import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author MARIANA
 */
public class Tomasulo {

    /**
     * @param args the command line arguments
     */
    
    public void despacho(){
        
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       Memoria memoriaInstrucao = new Memoria();
       memoriaInstrucao.criaMemInstr();
       memoriaInstrucao.selecionaInstrucao();
       
     
    }
    
    
    
}
