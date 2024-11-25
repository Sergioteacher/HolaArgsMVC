/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package holaargsmvc.unaVista;

import javax.swing.JPanel;

/**
 * Sin método main prefabricado.
 * @author Sergio Teacher
 */
public class UnaVista extends javax.swing.JFrame {

    /**
     * Creates new form UnaVista
     */
    public UnaVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCentral = new javax.swing.JPanel();
        txtEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Una Vista");

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setText("Iniciando ...");
        txtEstado.setToolTipText("Indicaciones de ayuda");
        getContentPane().add(txtEstado, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JLabel txtEstado;
    // End of variables declaration//GEN-END:variables

    /**
    * método que dá total control del objeto jPanelCentral
    */
    public JPanel getjPanelCentral() {
        return jPanelCentral;
    }

    /**
    * Método para dar datos dinámicos.
    * aquí NO se controla el objeto, sólo se permite la acción buscada
    */
    public void sms(String SMS){
        txtEstado.setText(SMS);
    }

}
