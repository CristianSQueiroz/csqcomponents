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
public class JButtonCancel extends JButtonPadrao{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public JButtonCancel(){
        defaultInit();
    }
    
    private void defaultInit(){
        this.setIcon("/Resources/CancelIcon.png");
        this.setLabel("Cancelar");
    }

}
