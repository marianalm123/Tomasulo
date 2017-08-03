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
public class Registrador {
   
    public enum TipoRegistrador {
        ZERO, R1, R2, R3, R4, R5, R6, R7, R8;
    }
    public enum RegistradorEnum{    
       ZERO(0), R1(1), R2(2), R3(3), R4(4), R5(5), R6(6), R7(7), R8(8);
        
        public int valorRegistrador;
        RegistradorEnum(int valor){
            valorRegistrador = valor;
        }    
        public int getValorReg(){
            return valorRegistrador;
        }
    }
    public String tipoRegistrador;
    public int tipoReg;
    
    public int transformaRegistrador(){
        switch(tipoRegistrador){
            case "ZERO":
                tipoReg = RegistradorEnum.ZERO.getValorReg();
                break;
            case "R1":
                tipoReg = RegistradorEnum.R1.getValorReg();
                break;
            case "R2":
                tipoReg = RegistradorEnum.R2.getValorReg();
                break;
            case "R3":
                tipoReg = RegistradorEnum.R3.getValorReg();
                break;
            case "R4":
                tipoReg = RegistradorEnum.R4.getValorReg();
                break;
            case "R5":
                tipoReg = RegistradorEnum.R5.getValorReg();
                break;
            case "R6":
                tipoReg = RegistradorEnum.R6.getValorReg();
                break;
            case "R7":
                tipoReg = RegistradorEnum.R7.getValorReg();
                break;
            case "R8":
                tipoReg = RegistradorEnum.R8.getValorReg();
                break;
        }
        return tipoReg;
    }
    
    
    
}
