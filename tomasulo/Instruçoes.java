/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomasulo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import static javax.xml.bind.DatatypeConverter.parseInteger;

/**
 *
 * @author MARIANA
 */
public class Instruçoes {

       
    public enum TipoInstrucao {
        ADD, ADDI, SUB, SUBI, MUL, DIV, AND, OR, NOT, BLT, BGT, BEQ, JUMP, LOAD, STORE;
    }
    public enum InstrucaoEnum{    
        ADD(0), ADDI(1), SUB(2), SUBI(3), MUL(4), DIV(5),AND(6), OR(7), NOT(8), BLT(9), BGT(10), BEQ(11), JUMP(12), LOAD(13), STORE(14);
        
        public int valorInstrucao;
        InstrucaoEnum(int valor){
            valorInstrucao = valor;
        }   
        public int getValor(){
            return valorInstrucao;
        }
    }
    private int tipoInstr;
        
    public int transformaInstrucao( String tipoInstrucao ){
        
        switch(tipoInstrucao){
            case "ADD":
                tipoInstr = InstrucaoEnum.ADD.getValor();
                break;
            case "ADDI":
                tipoInstr = InstrucaoEnum.ADDI.getValor();
                break;
            case "SUB":
                tipoInstr = InstrucaoEnum.SUB.getValor();
                break;
            case "SUBI":
                tipoInstr = InstrucaoEnum.SUBI.getValor();
                break;
            case "MUL":
                tipoInstr = InstrucaoEnum.MUL.getValor();
                break;
            case "DIV":
                tipoInstr = InstrucaoEnum.DIV.getValor();
                break;
            case "AND":
                tipoInstr = InstrucaoEnum.AND.getValor();
                break;
            case "OR":
                tipoInstr = InstrucaoEnum.OR.getValor();
                break;
            case "NOT":
                tipoInstr = InstrucaoEnum.NOT.getValor();
                break;
            case "BLT":
                tipoInstr = InstrucaoEnum.BLT.getValor();
                break;
            case "BGT":
                tipoInstr = InstrucaoEnum.BGT.getValor();
                break;
            case "BEQ":
                tipoInstr = InstrucaoEnum.BEQ.getValor();
                break;
            case "JUMP":
                tipoInstr = InstrucaoEnum.JUMP.getValor();
                break;
            case "LOAD":
                tipoInstr = InstrucaoEnum.LOAD.getValor();
                break;
            case "STORE":
                tipoInstr = InstrucaoEnum.STORE.getValor();
                break;
        }
        return tipoInstr;
    }
    
    private int tipoInstrucao1;
    private int op1;
    private int op2;
    private int dest;
    private int valorImediato;
    public ArrayList<String> listaInstrucoes = new ArrayList();
    
    Registrador r;
    
    public ArrayList<String> lerArqInstrucoes() throws  IOException {
        
        Scanner leitor = new Scanner(new File("arqInstrucao.txt"));
        ArrayList<String> linhas = new ArrayList<>();
        
        while(leitor.hasNextLine()){
            linhas.add(leitor.nextLine()); // coloca as instruções lidas do arquivo em uma lista de instruções
        }
        leitor.close();
        return linhas;
    }
    
    public int[] decodificaInstr(ArrayList<String> instru){// aqui quebra cada linha do array de instruçoes e coloca nas variaveis
        for(int i=0; i< instru.size(); i++){
            String[] teste = null;
            String linha = instru.get(i);
            teste = linha.split(" ");
            
            if(teste.length == 4){
                
                this.tipoInstrucao1 = transformaInstrucao(teste[0]);
                this.dest = r.transformaRegistrador(teste[1]);
                this.op1 = r.transformaRegistrador(teste[2]);
                this.op2 = r.transformaRegistrador(teste[3]);
                return  insereInstr4(this.tipoInstrucao1, this.dest, this.op1, this.op2);
                
            }else{
                if(teste.length == 3){
                    this.tipoInstrucao1 = transformaInstrucao(teste[0]);                    
                    this.dest = r.transformaRegistrador(teste[1]);
                    this.op1 = r.transformaRegistrador(teste[2]);
                    return  insereInstr3(this.tipoInstrucao1, this.dest, this.op1);
                    
                }else{
                    if(teste.length == 2){
                        this.tipoInstrucao1 = transformaInstrucao(teste[0]);
                        this.dest = r.transformaRegistrador(teste[1]);
                        return  insereInstr2(this.tipoInstrucao1, this.dest);
                    }
                }
            }
        }
        return insereInstr0();
    }
    
    
    public int[] insereInstr4(int tipoInstrucao1,int op1, int op2, int dest){
        r = new Registrador();
        r.opcode = tipoInstrucao1;
        r.rd = dest;
        r.rs = op1;
        r.rt = op2;
        
        int[] vet = {r.opcode, r.rd, r.rs, r.rt};
        
        return vet;
    }
    
    public int[] insereInstr3(int tipoInstrucao1,int op1, int op2){
        r = new Registrador();
        r.opcode = tipoInstrucao1;
        r.rd = dest;
        r.rs = op1;
        
        int[] vet = {r.opcode, r.rd, r.rs};
        
        return vet;
    }
    
    public int[] insereInstr2(int tipoInstrucao1,int op1){
        r = new Registrador();
        r.opcode = tipoInstrucao1;
        r.rd = dest;
        
        int[] vet = {r.opcode, r.rd};
        
        return vet;
    }
    public int[] insereInstr0(){
        r = new Registrador();
        int[] vet = {};
        
        return vet;
    }
    
}
