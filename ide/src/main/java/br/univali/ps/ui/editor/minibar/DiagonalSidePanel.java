/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.ps.ui.editor.minibar;

import br.univali.ps.nucleo.Configuracoes;
import br.univali.ps.ui.swing.ColorController;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;

/**
 *
 * @author 5663296
 */
public class DiagonalSidePanel extends javax.swing.JPanel {

    private boolean left = true;
    /**
     * Creates new form DiagonalSidePanel
     */
    public DiagonalSidePanel() {
        initComponents();
    }
    
    public void setLeft(){
        left = true;
    }
    
    public void setRight(){
        left = false;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D gd = (Graphics2D) grphcs;
        
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gd.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        
        gd.setColor(ColorController.COR_PRINCIPAL);
        gd.drawRect(0, 0, getWidth(), getHeight());
        if(Configuracoes.getInstancia().isTemaDark()){
            gd.setColor(ColorController.FUNDO_BOTOES_EXPANSIVEIS);
        }else{
            gd.setColor(ColorController.FUNDO_ESCURO);
        }
        
        if(left){
            int[] x = {0,getWidth(),getWidth()};
            int[] y = {0,0,getHeight()};
            Polygon tri = new Polygon(x, y, 3);
            gd.fillPolygon(tri);
        }else{
            int[] x = {0,getWidth(),0};
            int[] y = {0,0,getHeight()};
            Polygon tri = new Polygon(x, y, 3);
            gd.fillPolygon(tri);
        }
        
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
