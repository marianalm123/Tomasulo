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
public class Memoria {
    
    Instruçoes instr = new Instruçoes();
    private ArrayList<String> memInstrucao;
    
    int pc = 0;    
    
    public void criaMemInstr() throws IOException{
       memInstrucao = instr.lerArqInstrucoes();
       System.out.println(memInstrucao);
    }
    
    public void selecionaInstrucao(){
        instr.decodificaInstr(memInstrucao);
    }
    
    public int getPC(){
        for(int i=0; i <= memInstrucao.size(); i++){
            pc = i;
        }
        return pc;        
    }
    
    
    
    
    
}
