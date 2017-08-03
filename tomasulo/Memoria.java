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
public class Memoria  {
    private int[] memDados = new int[256];
    Instruçoes instr = new Instruçoes();
    private ArrayList<String> memInstrucao;
    int pc;    
    
    public void criaMemInstr() throws IOException{
       memInstrucao = instr.lerArqInstrucoes();
       System.out.println(memInstrucao);
    }
    
    public int retornaPC(){
        for(int i=0; i <= memInstrucao.size(); i++){
            pc = 1;
        }
        return pc;        
    }
    
    
    
}
