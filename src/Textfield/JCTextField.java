/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Textfield;

import Util.Utilidades;
import javax.swing.JTextField;

/**
 *
 * @author Cristian
 */
public class JCTextField extends JTextField {

    public boolean isVazio() {
        return getText().equalsIgnoreCase("");
    }

    public Double getAsDouble() {
        return Utilidades.validaDouble(getText());
    }

    public int getAsInt() {
        return Utilidades.validaInt(getText());
    }

    public Float getAsFloat() {
        return Utilidades.validaFloat(getText());
    }

    public String getAsString() {
        return Utilidades.validaString(getText());
    }
}
