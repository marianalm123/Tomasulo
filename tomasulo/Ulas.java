/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomasulo;

/**
 *
 * @author MARIANA
 */
public class Ulas extends Memoria{
    EstacaoReserva[] RS; //vetor de estações de reserva que alimenta a ULA
    int RScount; //numero de estações de reserva
    int executionCount; //numero de ciclos executados pela unidade funcional
    int instrucaoAtual; // indice de RS representando a instrução atual que esta sendo executada
    boolean FUbusy; //flag indicando que a unidade funcional atual esta executando uma instrução
    int executionCycles; //numero de ciclos de execução restantes para as instruções em execução no momento
    
    
    public void soma(){
        RScount = 4;
        executionCount = 5;
        RS = new EstacaoReserva[RScount];
        
        instrucaoAtual = 0;
        FUbusy = false;
    }
    
    public void subtracao(){
        RScount = 4;
        executionCount = 5;
        RS = new EstacaoReserva[RScount];
        
        instrucaoAtual = 0;
        FUbusy = false;
    }
    
    public void multiplicacao(){
        RScount = 8;
        executionCount = 10;
        RS = new EstacaoReserva[RScount];
        
        instrucaoAtual = 0;
        FUbusy = false;
    }
    
    public void divisao(){
        RScount = 8;
        executionCount = 20;
        RS = new EstacaoReserva[RScount];
        
        instrucaoAtual = 0;
        FUbusy = false;
    }
    
    public void loadStore(){
        RScount = 8;
        executionCount = 5;
        RS = new EstacaoReserva[RScount];
        
        instrucaoAtual = 0;
        FUbusy = false;
    }
    
}
