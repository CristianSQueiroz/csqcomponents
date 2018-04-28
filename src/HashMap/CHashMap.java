/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;

import Util.Utilidades;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Cristian
 */
public class CHashMap extends HashMap {

    public int getValorAsInt(Object o) {
        return Utilidades.validaInt(get(o));
    }

    public String getValorAsString(Object o) {
        return Utilidades.validaString(get(o));
    }

    public Float getValorAsFloat(Object o) {
        return Utilidades.validaFloat(get(o));
    }

    public Double getValorAsDouble(Object o) {
        return Utilidades.validaDouble(get(o));
    }

    public static ArrayList<HashMap> converteCHashMap(ArrayList<CHashMap> lista) {
        ArrayList<HashMap> retorno = new ArrayList<HashMap>();
        for(int x = 0; x<lista.size();x++){            
            retorno.add(lista.get(x));
        }
        return retorno;
    }
}
