/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomasulo;

import java.util.ArrayList;

/**
 *
 * @author MARIANA
 */
public class Ulas extends Registrador{
    EstacaoReserva[] RS; //vetor de estações de reserva que alimenta a ULA
    
    int RScount; //numero de estações de reserva
    int executionCount; //numero de ciclos executados pela unidade funcional
    int instrucaoAtual; // indice de RS representando a instrução atual que esta sendo executada
    boolean FUbusy; //flag indicando que a unidade funcional atual esta executando uma instrução
    int executionCycles; //numero de ciclos de execução restantes para as instruções em execução no momento
    
    
    
    public void somaSub(){
        RScount = 4;
        executionCount = 5;
        RS = new EstacaoReserva[RScount];
        for(int i = 0; i<RScount; i++){
            RS[i] = new EstacaoReserva("soma/sub" + i);
        }
        instrucaoAtual = 0;
        FUbusy = false;
    }
    
    public void multDiv(){
        RScount = 4;
        executionCount = 10;
        RS = new EstacaoReserva[RScount];
        for(int i = 0; i<RScount; i++){
            RS[i] = new EstacaoReserva("mult/div" + i);
        }
        instrucaoAtual = 0;
        FUbusy = false;
    }
    
    public void load(){
        RScount = 4;
        executionCount = 5;
        RS = new EstacaoReserva[RScount];
        for(int i = 0; i<RScount; i++){
            RS[i] = new EstacaoReserva("load" + i);
        }
        instrucaoAtual = 0;
        FUbusy = false;
    }
    
    public void store(){
        RScount = 4;
        executionCount = 5;
        RS = new EstacaoReserva[RScount];
        for(int i = 0; i<RScount; i++){
            RS[i] = new EstacaoReserva("store" + i);
        }
        instrucaoAtual = 0;
        FUbusy = false;
       
    }
    
    
    
    
}
