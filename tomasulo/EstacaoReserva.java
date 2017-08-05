

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
public class EstacaoReserva {
    
    public String nome; //nome da estação de reserva
    public int Vj; //valor do operando
    public int Vk; //valor do operando
    public String Qj; //nome da estação de reserva produzindo Vj
    public String Qk; //nome da estação de reserva produzindo Vk
    public int operation; //tipo de operação
    public int A; //valor do valor imediato
    public boolean busy; //verifica se estação esta ocupada
    
    public boolean resultadoPronto; //flag que indica que o resultado está pronto para ser escrito
    public boolean resultadoEscrito; //flag que indica que o resultado foi escrito
    
    Registrador[] RegisterStat;
    
    public EstacaoReserva(String nome){
        this.nome = nome;
        busy = false;
        operation = 0;
        Vj = Vk = A = 0;
        Qj = Qk = null;
        resultadoPronto = false;
        resultadoEscrito = false;
    }
    
    public void limpaEstacao(){
        busy = false;
        operation = 0;
        Vj = Vk = A = 0;
        Qj = Qk = null;
        resultadoPronto = false;
        resultadoEscrito = false;
    }
    
    //verifica se os operandos estão disponiveis, e portanto prontos
    public boolean pronto(){ 
        return(busy == true && Qj == null && 
               Qk == null && resultadoPronto == false);
    }
    
    
    
}
