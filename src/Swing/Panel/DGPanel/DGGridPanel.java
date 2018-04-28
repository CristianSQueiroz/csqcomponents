/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Panel.DGPanel;

import JTPadrao.JCTable;
import JTPadrao.JTCGrid;
import SQLUtil.ComponetsDb;
import Util.Utilidades;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Cristian
 */
public class DGGridPanel extends javax.swing.JPanel {

    private ArrayList<DBPanelAtributo> atributos = new ArrayList<DBPanelAtributo>();
    private String nmTabela;

    /**
     * Creates new form DGGridPanel
     */
    public DGGridPanel() {
        initComponents();

    }

    public void setAtributos(ArrayList<DBPanelAtributo> atributos, String nmTabela) {
        this.atributos = atributos;
        this.nmTabela = nmTabela;
        montaPanel();
    }

    private void montaPanel() {

        jTCGrid1 = new JTCGrid(ComponetsDb.getDadosDGPanel(getCamposSelect(), nmTabela, null), atributos);
        jScrollPane1.setViewportView(jTCGrid1);
        jTCGrid1.validate();
    }

    private HashMap getCamposSelect() {
        HashMap hashMap = new HashMap();
        for (int x = 0; x < atributos.size(); x++) {
            if ((!Utilidades.validaString(atributos.get(x).getNmAtributo()).equalsIgnoreCase(""))
                    && !atributos.get(x).getTipoComponente().equalsIgnoreCase("Label")) {
                hashMap.put(atributos.get(x).getNmAtributo(), null);
            }
        }
        return hashMap;
    }

    public JTCGrid getGrid() {
        return jTCGrid1;
    }

    private ArrayList<HashMap> getListaTeste() {
        ArrayList<HashMap> listaTeste = new ArrayList<HashMap>();
        for (int x = 0; x < 10; x++) {
            HashMap hm = new HashMap();
            hm.put("TESTE" + x, x);
            listaTeste.add(hm);
        }
        return listaTeste;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTCGrid1 = new JTPadrao.JTCGrid();

        setLayout(new java.awt.BorderLayout());

        jTCGrid1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTCGrid1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private JTPadrao.JTCGrid jTCGrid1;
    // End of variables declaration//GEN-END:variables

}
