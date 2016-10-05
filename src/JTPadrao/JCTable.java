/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTPadrao;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JTable;

/**
 *
 * @author csqueiroz
 */
public class JCTable extends JTable {

    private ArrayList<HashMap> listaObjetos;
    private ArrayList<String> colunas;
    private HashMap nomesColunas;

    public JCTable() {
        this.setBackground(Color.white);
    }

    public JCTable(ArrayList<HashMap> lista) {
        if (lista.size() > 0) {
            listaObjetos = lista;
            preenchedoVariaveis();
            this.setModel(new JTPadrao(lista));
        }
        this.setBackground(Color.white);
    }

    public JCTable(ArrayList<HashMap> lista, HashMap nomesColunas) {
        if (lista.size() > 0) {
            listaObjetos = lista;
            this.nomesColunas = nomesColunas;
            preenchedoVariaveis();
            this.setModel(new JTPadrao(lista, nomesColunas));
        }
        this.setBackground(Color.white);
    }

    public JCTable(ArrayList<HashMap> lista, HashMap nomesColunas, String novaColuna) {
        ArrayList<HashMap> novalista = new ArrayList<>();
        for (HashMap hm : lista) {
            HashMap temporario = new HashMap();
            hm.get(novaColuna);
            temporario.put("Atributo", hm.get(novaColuna));
            novalista.add(temporario);
        }

        if (novalista.size() > 0) {
            listaObjetos = novalista;
            this.nomesColunas = nomesColunas;
            preenchedoVariaveis();
            this.setModel(new JTPadrao(novalista, nomesColunas));
        }
        this.setBackground(Color.white);
    }

    public int getColuna(String nomeColuna) {
        String nomeC = "";
        for (Object o : nomesColunas.keySet()) {
            if (o.toString().toUpperCase().contains(nomeColuna.toUpperCase())) {
                nomeC = nomesColunas.get(o).toString();
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

    private void preenchedoVariaveis() {
        colunas = new ArrayList<String>();
        HashMap hm = new HashMap();
        hm = listaObjetos.get(0);
        for (int x = 0; x < hm.keySet().size(); x++) {
            colunas.add((String) hm.keySet().toArray()[x]);
        }
    }

    public void pintarLinha(Color color, int linha) {
    }

    public boolean isLinhasSelecionadas() {
        return this.getSelectedRows().length > 0;
    }
}
