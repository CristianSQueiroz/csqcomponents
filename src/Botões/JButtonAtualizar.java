/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botões;

/**
 *
 * @author csqueiroz
 */
public class JButtonAtualizar extends JButtonPadrao{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public JButtonAtualizar(){
        defaultInit();
    }
    
    private void defaultInit(){
        this.setIcon("/Resources/AtualizarIcon.png");
        this.setLabel("Atualizar");
    }

}
