/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLUtil;

import Util.UtilSql;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Cristian
 */
public class ComponetsDb {

    public static ArrayList<HashMap> getAtributosColumns(String nmTableName) {
        String cmd = "select NM_ATRIBUTO,POS_X,POS_Y,LARGURA_GRID,LARGURA_DESIGN,ALTURA_DESIGN,TIPO_COMPONENTE,DS_ATRIBUTO from ATRIBUTOS_TABELA WHERE CD_TABELA = (SELECT CD_TABELA FROM TABELA WHERE NM_TABELA = " + UtilSql.aplicarApostofo(nmTableName) + ")";
        return MySqlConnectComponente.getInstance().executaConsultaPadrao(cmd);
    }

    public static ArrayList<HashMap> getDadosDGPanel(HashMap atributos, String nmTabela, String orderby) {
        String cmd = UtilSql.montaQuery(atributos, nmTabela, orderby);
        return MySqlConnectComponente.getInstance().executaConsultaPadrao(cmd);
    }
}
