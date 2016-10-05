package ComponentesVisuais;

import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csqueiroz
 */
public class JCPanel extends JPanel{
    
    public void limparTela(){
        Util.UtilPanel.limpaCampos(this);
    }
}
