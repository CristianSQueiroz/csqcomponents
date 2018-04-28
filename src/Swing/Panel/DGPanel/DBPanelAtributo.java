/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Panel.DGPanel;

/**
 *
 * @author Cristian
 */
public class DBPanelAtributo {

    private String tipoComponente;
    private String nmAtributo;
    private String dsAtributo;

    //Posicionamento Design
    private int posX;
    private int posY;
    private int larguraGrid;
    private int larguraDesign;
    private int alturaDesign;

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public String getNmAtributo() {
        return nmAtributo;
    }

    public void setNmAtributo(String nmAtributo) {
        this.nmAtributo = nmAtributo;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getLarguraGrid() {
        return larguraGrid;
    }

    public void setLarguraGrid(int larguraGrid) {
        this.larguraGrid = larguraGrid;
    }

    public int getLarguraDesign() {
        return larguraDesign;
    }

    public void setLarguraDesign(int larguraDesign) {
        this.larguraDesign = larguraDesign;
    }

    public int getAlturaDesign() {
        return alturaDesign;
    }

    public void setAlturaDesign(int alturaDesign) {
        this.alturaDesign = alturaDesign;
    }

    public String getDsAtributo() {
        return dsAtributo;
    }

    public void setDsAtributo(String dsAtributo) {
        this.dsAtributo = dsAtributo;
    }

}
