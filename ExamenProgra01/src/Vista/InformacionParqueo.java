/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class InformacionParqueo extends javax.swing.JPanel {

    /**
     * Creates new form InformacionParqueo
     */
    public InformacionParqueo() {
        initComponents();
    }
    
    public String[] enviarInformacion()
    {
        String[] informacion;
        informacion=new String[3];
        informacion[0]=jt_Registro.getText();
        informacion[1]=this.jt_Nombre.getText();
        informacion[2]=this.jt_Cedula.getText();
        informacion[3]=this.jt_Placa.getText();
        
        return informacion;
    }
    
    public void devolverInformacion(String informacion[])
    {
        this.jt_Registro.setText(informacion[0]);
        this.jt_Nombre.setText(informacion[0]);
        this.jt_Cedula.setText(informacion[0]);
        this.jt_Placa.setText(informacion[0]);
    }
    
    public String devolverNumRegistro()
    {
        return this.jt_Registro.getText();
    }
    //enabled
    //setText blanquear y dar informacion
    //getText traer info
    //inicial
    //agregar
    //modificar

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_numRegistro = new javax.swing.JLabel();
        jl_NombreDuenio = new javax.swing.JLabel();
        jl_CedulaDuenio = new javax.swing.JLabel();
        jl_Placa = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jt_Registro = new javax.swing.JTextField();
        jt_Cedula = new javax.swing.JTextField();
        jt_Placa = new javax.swing.JTextField();

        setOpaque(false);

        jl_numRegistro.setText("Número de Registro");

        jl_NombreDuenio.setText("Nombre del Dueño");

        jl_CedulaDuenio.setText("Cédula del Dueño");

        jl_Placa.setText("Placa del Atomóvil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_numRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jl_NombreDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_Placa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_CedulaDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jt_Placa)
                        .addComponent(jt_Cedula)
                        .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numRegistro)
                    .addComponent(jt_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_NombreDuenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_CedulaDuenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Placa))
                .addGap(143, 143, 143))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_CedulaDuenio;
    private javax.swing.JLabel jl_NombreDuenio;
    private javax.swing.JLabel jl_Placa;
    private javax.swing.JLabel jl_numRegistro;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_Placa;
    private javax.swing.JTextField jt_Registro;
    // End of variables declaration//GEN-END:variables
}
