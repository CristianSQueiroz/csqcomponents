/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTPadrao;

import Util.Utilidades;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author csqueiroz
 */
public class JTPadrao extends AbstractTableModel {

    private ArrayList<HashMap> listaObjetos;
    private ArrayList<String> colunas;
    private HashMap nomesColunas;
    private HashMap indexColunas;

    public JTPadrao(ArrayList<HashMap> lista) {
        listaObjetos = lista;
        preenchedoVariaveis();
        indexColunas = new HashMap();
    }

    public JTPadrao() {
        listaObjetos = new ArrayList<HashMap>();
    }

    public JTPadrao(ArrayList<HashMap> lista, HashMap nomesColunas) {
        listaObjetos = lista;
        this.nomesColunas = nomesColunas;
        preenchedoVariaveis();
        indexColunas = new HashMap();
    }

    @Override
    public int getRowCount() {
        return listaObjetos.size();
    }

    @Override
    public int getColumnCount() {
        return listaObjetos.get(0).keySet().size();
    }

    @Override
    public String getColumnName(int arg0) {
        String retorno = colunas.get(arg0).toUpperCase();
        if (nomesColunas != null) {
            if (retorno.contains("DATE_FORMAT")) {
                retorno = retorno.substring(retorno.indexOf(".", retorno.indexOf("("))+1, retorno.indexOf(",", retorno.indexOf("(")));
            }
            if (nomesColunas.containsKey(retorno)) {
                indexColunas.put(nomesColunas.get(retorno).toString(), arg0);
                return nomesColunas.get(retorno).toString();
            }
        }
        indexColunas.put(retorno, arg0);
        return retorno;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        HashMap hm = listaObjetos.get(rowIndex);
        return hm.get(colunas.get(columnIndex));
    }

    public void preenchedoVariaveis() {
        colunas = new ArrayList<String>();
        HashMap hm = new HashMap();
        hm = listaObjetos.get(0);
        for (int x = 0; x < hm.keySet().size(); x++) {
            colunas.add((String) hm.keySet().toArray()[x]);
        }
    }

    public int getColuna(String nomeColuna) {
        return new Utilidades().validaInt(indexColunas.get(nomeColuna));
    }

}
