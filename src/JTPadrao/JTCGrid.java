/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTPadrao;

import Swing.Panel.DGPanel.DBPanelAtributo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JTable;

/**
 *
 * @author csqueiroz
 */
public class JTCGrid extends JTable {

    private ArrayList<HashMap> listaObjetos;
    private ArrayList<DBPanelAtributo> atributos = new ArrayList<DBPanelAtributo>();

    public JTCGrid() {
        this.setBackground(Color.white);
    }

    public JTCGrid(ArrayList<HashMap> lista) {
        if (lista.size() > 0) {
            listaObjetos = lista;
            this.setModel(new JTPadrao(lista));
        }
        this.setBackground(Color.white);
    }

    public JTCGrid(ArrayList<HashMap> lista, ArrayList<DBPanelAtributo> atributos) {

        if (lista.size() > 0) {
            listaObjetos = lista;
            for (int x = 0; x < atributos.size(); x++) {
                if ((atributos.get(x).getLarguraGrid() > 0)) {
                    this.atributos.add(atributos.get(x));
                }
            }
            this.setModel(new JTPadrao(lista, getNomeColunas(this.atributos)));
        }
        this.setBackground(Color.white);
        this.setSelectionMode(0);
        this.setRowSelectionInterval(0, 0);
        
    }

    public int getColuna(String nomeColuna) {
        String nomeC = "";

        for (String colunaAtributo : getNomeColunas(atributos)) {
            if (colunaAtributo.toUpperCase().contains(nomeColuna.toUpperCase())) {
                nomeC = colunaAtributo;
            }
        }
        if (!nomeC.equalsIgnoreCase("")) {
            return ((JTPadrao) this.getModel()).getColuna(nomeC);
        }
        return 0;
    }

    public String getValorAsString(String coluna) {
        return Util.Utilidades.validaString(getValueAt(this.getSelectedRow(), getColuna(coluna)).toString());
    }

    public String getValorAsString(String coluna, Integer linhaselecionada) {
        return Util.Utilidades.validaString(getValueAt(linhaselecionada, getColuna(coluna)).toString());
    }

    public ArrayList<Object> getValoresLinhasSelecionadas(String coluna) {
        ArrayList<Object> retorno = new ArrayList<>();
        int intColuna = getColuna(coluna);
        getSelectedRows();
        for (Integer linha : getSelectedRows()) {
            retorno.add(getValueAt(linha, intColuna));
        }
        return retorno;
    }

    public ArrayList<HashMap> getValoresLinhasSelecionadas(HashMap colunas) {
        ArrayList<HashMap> retorno = new ArrayList<>();
        for (Integer intLinha : getSelectedRows()) {
            HashMap linha = new HashMap();
            for (Object keySet : colunas.keySet()) {
                int intColuna = getColuna(keySet.toString());
                linha.put(keySet.toString(), getValueAt(intLinha, intColuna));
            }
            retorno.add(linha);
        }

        return retorno;
    }

    public ArrayList<HashMap> getValoresLinhasSelecionadas() {
        return listaObjetos;
    }

    public ArrayList<Object> getValoresLinhasSelecionadas(String coluna, String colunaRestricao, String valor) {
        ArrayList<Object> retorno = new ArrayList<>();
        int intColuna = getColuna(coluna);
        for (Integer linha : getSelectedRows()) {
            if (getValorAsString(colunaRestricao, linha).equalsIgnoreCase(valor)) {
                retorno.add(getValueAt(linha, intColuna));
            }
        }
        return retorno;
    }

    public void pintarLinha(Color color, int linha) {
    }

    public boolean isLinhasSelecionadas() {
        return this.getSelectedRows().length > 0;
    }

    public ArrayList<String> getNomeColunas(ArrayList<DBPanelAtributo> atributos) {
        ArrayList<String> nomes = new ArrayList<String>();
        for (int x = 0; x < atributos.size(); x++) {
            nomes.add(atributos.get(x).getDsAtributo());
        }
        return nomes;
    }
}
