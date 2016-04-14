/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.ControladorRegistro;
import javax.swing.JOptionPane;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class RegistroParqueo extends javax.swing.JFrame {

    /**
     * Creates new form RegistroParqueo
     */
    
    ControladorRegistro controlador;
    
    public RegistroParqueo() {
        initComponents();
        this.setLocation(500, 200);
        setVisible(false);
        controlador=new ControladorRegistro(this);
        this.botones1.agregarEventos(controlador);
        
    }
    
    
    public String devolverRegistro()
    {
        return informacionParqueo1.devolverNumRegistro();
    }
    
    public String[] enviarInformacion()
    {
         return this.informacionParqueo1.enviarInformacion();
    }
    
    public void devolverInformacion(String informacion[])
    {
        this.informacionParqueo1.devolverInformacion(informacion);
    }
    
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Titulo = new javax.swing.JLabel();
        botones1 = new Vista.Botones();
        jl_Girasol = new javax.swing.JLabel();
        informacionParqueo1 = new Vista.InformacionParqueo();
        jl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(595, 500));
        getContentPane().setLayout(null);

        jl_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Titulo.png"))); // NOI18N
        getContentPane().add(jl_Titulo);
        jl_Titulo.setBounds(20, 10, 570, 130);
        getContentPane().add(botones1);
        botones1.setBounds(20, 320, 613, 153);

        jl_Girasol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GirasolUCR.png"))); // NOI18N
        getContentPane().add(jl_Girasol);
        jl_Girasol.setBounds(360, -20, 310, 520);
        getContentPane().add(informacionParqueo1);
        informacionParqueo1.setBounds(70, 120, 400, 309);

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoBlanco.png"))); // NOI18N
        getContentPane().add(jl_Fondo);
        jl_Fondo.setBounds(0, 0, 598, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroParqueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.Botones botones1;
    private Vista.InformacionParqueo informacionParqueo1;
    private javax.swing.JLabel jl_Fondo;
    private javax.swing.JLabel jl_Girasol;
    private javax.swing.JLabel jl_Titulo;
    // End of variables declaration//GEN-END:variables
}
