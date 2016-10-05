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
public class JButtonRemover extends JButtonPadrao {

    public JButtonRemover() {
        defaultInit();
    }

    private void defaultInit() {
        setIcon("/Resources/ExcludeIcon.png");
        setLabel("Remover");
    }

}
