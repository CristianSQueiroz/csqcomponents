/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contantes;

/**
 *
 * @author Cristian
 */
public class Constantes {
    public enum TIPOVARIAVEIS {    
    STRING(1), INT(2), DOUBLE(3), FLOAT(4);
    
    private final int valor;
    
    TIPOVARIAVEIS(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
}
