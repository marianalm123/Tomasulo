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
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import tomasulo.Registrador;

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
        
    public int transformaInstrucao( ){
        
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
    
    private String tipoInstrucao;
    private String op1;
    private String op2;
    private String dest;
    private String valorImediato;
    public ArrayList<String> listaInstrucoes = new ArrayList();

    
    
    public ArrayList<String> lerArqInstrucoes() throws  IOException {
        
        Scanner leitor = new Scanner(new File("arqInstrucao.txt"));
        ArrayList<String> linhas = new ArrayList<>();
        
        while(leitor.hasNextLine()){
            linhas.add(leitor.nextLine()); // coloca as instruções lidas do arquivo em uma lista de instruções
        }
        leitor.close();
        return linhas;
    }
    
}
