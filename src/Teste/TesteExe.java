/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Swing.Panel.DGPanel.DGPanel;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Cristian
 */
public class TesteExe {
    public static void main(String[]args){
        JFrame frame = new JFrame("Teste");
        DGPanel panel = new DGPanel();
        frame.add(panel,BorderLayout.CENTER);
        frame.setSize(800,600);
        frame.pack();
        frame.setVisible(true);
    }
}
