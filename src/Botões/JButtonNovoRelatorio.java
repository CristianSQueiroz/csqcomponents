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
public class JButtonNovoRelatorio extends JButtonPadrao {

    public JButtonNovoRelatorio() {
        defaultInit();
    }

    private void defaultInit() {
        setIcon("/Resources/NovoRelatorioIcon.png");
        setLabel("Novo");
    }

}
