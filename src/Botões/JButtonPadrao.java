/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botões;

import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author csqueiroz
 */
public class JButtonPadrao extends JButton{
    
    Dimension d = new Dimension();
    
    public JButtonPadrao(){
        d.height = 45;
        d.width = 120;
        this.setPreferredSize(d);
        
    }
    
    public void setIcon(String path){
        setIcon(new javax.swing.ImageIcon(getClass().getResource(path)));
    }
}
