/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentesVisuais;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;

/**
 *
 * @author csqueiroz
 */
public class JCBPadrao extends JComboBox {

    private ArrayList<HashMap> valores;

    public JCBPadrao() {
        super();
    }
    
    public JCBPadrao(ArrayList<HashMap> valores) {
        super();
        this.valores = valores;
    }

    public Object getValorChaveOculta(String chave) {
        for (HashMap hm : valores) {
            
            for (Object entrySet : hm.entrySet()) {
                if(entrySet.toString().toUpperCase().contains(this.getSelectedItem().toString().toUpperCase())){
                    return hm.get(chave);
                }
            }
        }
        return null;
    }

    public void limpar() {
        this.setSelectedItem(null);
    }

    public void addListeners(){
        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if((e.getKeyCode() == KeyEvent.VK_ESCAPE)){
                    limpar();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
}
