/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Panel.DGPanel;

import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Cristian
 */
public class DBDesignPanel extends javax.swing.JPanel {

    private ArrayList<DBPanelAtributo> atributos = new ArrayList<DBPanelAtributo>();

    /**
     * Creates new form DBDesignPanel
     */
    public DBDesignPanel() {
        this.setLayout(null);
        initComponents();
    }

    public void setAtributos(ArrayList<DBPanelAtributo> atributos,ArrayList<HashMap> dados,int line) {
        this.atributos = atributos;
        montaPanel();
    }

    private void montaPanel() {
        for (DBPanelAtributo atributo : atributos) {
            montaAtributo(atributo);
        }
    }

    private void montaAtributo(DBPanelAtributo atributo) {
        switch (atributo.getTipoComponente().toLowerCase()) {
            case "label": {
                montaLabel(atributo);
                break;
            }
            case "textfield": {
                montaTextField(atributo);
                break;
            }
            case "textarea": {
                montaTextArea(atributo);
                break;
            }
        }
    }

    private void montaLabel(DBPanelAtributo atributo) {
        JLabel label = new JLabel(atributo.getDsAtributo());
        add(label);
        label.setBounds(atributo.getPosX(), atributo.getPosY(), atributo.getPosX() + atributo.getLarguraDesign(), atributo.getAlturaDesign());
    }

    private void montaTextField(DBPanelAtributo atributo) {
        JTextField jTextField = new JTextField(atributo.getDsAtributo());
        add(jTextField);
        jTextField.setBounds(atributo.getPosX(), atributo.getPosY(), atributo.getLarguraDesign(),atributo.getAlturaDesign());
    }

    private void montaTextArea(DBPanelAtributo atributo) {
        JTextArea jTextArea = new JTextArea(atributo.getDsAtributo());
        add(jTextArea);
        jTextArea.setBounds(atributo.getPosX(), atributo.getPosY(), atributo.getPosX() + atributo.getLarguraDesign(), atributo.getPosY() + atributo.getAlturaDesign());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
