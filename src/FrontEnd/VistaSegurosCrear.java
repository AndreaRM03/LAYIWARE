/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.Utilidades;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author red-p
 */
public class VistaSegurosCrear extends javax.swing.JFrame {

    /**
     * Creates new form SucursalesVistaAdmin
     */
    public VistaSegurosCrear() {
        initComponents();
        
        Utilidades.cargarLogo(this, "logoLAYIWARE.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblidAsegurado = new javax.swing.JLabel();
        txtfCantidadAsegurada = new javax.swing.JTextField();
        cmbIdAsegurado = new javax.swing.JComboBox<>();
        txtfVigencia = new javax.swing.JTextField();
        txtfFechaRecepcion = new javax.swing.JTextField();
        txtfFolio = new javax.swing.JTextField();
        txtfTelefono = new javax.swing.JTextField();
        btnCrearSeguro = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        cmbTipoSeguro = new javax.swing.JComboBox<>();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista Seguros Crear");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblidAsegurado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblidAsegurado.setText("Id Asegurado");
        lblidAsegurado.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblidAsegurado);
        lblidAsegurado.setBounds(340, 150, 150, 60);

        txtfCantidadAsegurada.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfCantidadAsegurada.setText("Cantidad asegurada");
        txtfCantidadAsegurada.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfCantidadAsegurada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCantidadAseguradaActionPerformed(evt);
            }
        });
        getContentPane().add(txtfCantidadAsegurada);
        txtfCantidadAsegurada.setBounds(340, 260, 350, 40);

        cmbIdAsegurado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbIdAsegurado.setPreferredSize(new java.awt.Dimension(300, 100));
        cmbIdAsegurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdAseguradoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbIdAsegurado);
        cmbIdAsegurado.setBounds(500, 160, 190, 40);

        txtfVigencia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfVigencia.setText("Vigencia");
        txtfVigencia.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfVigenciaActionPerformed(evt);
            }
        });
        getContentPane().add(txtfVigencia);
        txtfVigencia.setBounds(340, 360, 350, 40);

        txtfFechaRecepcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfFechaRecepcion.setText("Fecha recepción");
        txtfFechaRecepcion.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfFechaRecepcion);
        txtfFechaRecepcion.setBounds(730, 360, 350, 40);

        txtfFolio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfFolio.setText("Folio");
        txtfFolio.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfFolio);
        txtfFolio.setBounds(730, 260, 350, 40);

        txtfTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfTelefono.setText("Teléfono");
        txtfTelefono.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfTelefono);
        txtfTelefono.setBounds(340, 460, 350, 40);

        btnCrearSeguro.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        btnCrearSeguro.setText("Crear Seguro");
        btnCrearSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearSeguroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearSeguro);
        btnCrearSeguro.setBounds(510, 570, 370, 60);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(1160, 30, 90, 90);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Seguros");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(940, 80, 330, 48);

        cmbTipoSeguro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbTipoSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automóvil", "Vida", "Desempleo" }));
        cmbTipoSeguro.setPreferredSize(new java.awt.Dimension(300, 100));
        cmbTipoSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoSeguroActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoSeguro);
        cmbTipoSeguro.setBounds(730, 460, 350, 40);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, -30, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfCantidadAseguradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCantidadAseguradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfCantidadAseguradaActionPerformed

    private void cmbIdAseguradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdAseguradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIdAseguradoActionPerformed

    private void txtfVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfVigenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfVigenciaActionPerformed

    private void btnCrearSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearSeguroActionPerformed
        
        
        int idAsegurado = cmbIdAsegurado.getSelectedIndex();
        double cantidadAsegurada = Double.parseDouble(txtfCantidadAsegurada.getText());
        String folio = txtfFolio.getText();
        String vigencia = txtfVigencia.getText();
        String fechaRecepcion = txtfFechaRecepcion.getText();
        String telefono = txtfTelefono.getText();
        String tipoSeguro = (String) cmbTipoSeguro.getSelectedItem();
        
        
        System.out.println(idAsegurado);
        System.out.println(cantidadAsegurada);
        System.out.println(folio);
        System.out.println(vigencia);
        System.out.println(fechaRecepcion);
        System.out.println(telefono);
        System.out.println(tipoSeguro);

        
        int result = JOptionPane.showConfirmDialog(
                new JFrame(),
                "¿Estas seguro de crear esta sucursal?", 
                "Aseguradora - confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

        if(result == JOptionPane.YES_OPTION){
            System.out.println(1);
           
        }else if (result == JOptionPane.NO_OPTION){
            System.out.println(2);
           
        }else {
            System.out.println(3);
        }
    }//GEN-LAST:event_btnCrearSeguroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VistaSeguros vistaSeguros = new VistaSeguros();
        vistaSeguros.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbTipoSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoSeguroActionPerformed

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
            java.util.logging.Logger.getLogger(VistaSegurosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSegurosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSegurosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSegurosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaSegurosCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearSeguro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbIdAsegurado;
    private javax.swing.JComboBox<String> cmbTipoSeguro;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblidAsegurado;
    private javax.swing.JTextField txtfCantidadAsegurada;
    private javax.swing.JTextField txtfFechaRecepcion;
    private javax.swing.JTextField txtfFolio;
    private javax.swing.JTextField txtfTelefono;
    private javax.swing.JTextField txtfVigencia;
    // End of variables declaration//GEN-END:variables
}
