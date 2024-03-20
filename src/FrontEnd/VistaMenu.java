/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

/**
 *
 * @author user
 */
public class VistaMenu extends javax.swing.JFrame {

    /**
     * Creates new form VistaLogin
     */
    public VistaMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        btnSucursales = new javax.swing.JButton();
        btnSucursales1 = new javax.swing.JButton();
        btnSucursales2 = new javax.swing.JButton();
        btnSucursales3 = new javax.swing.JButton();
        zlblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenLogin.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 30, 330, 250);

        btnSucursales.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSucursales.setText("Seguros");
        btnSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursalesActionPerformed(evt);
            }
        });
        getContentPane().add(btnSucursales);
        btnSucursales.setBounds(130, 510, 370, 60);

        btnSucursales1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSucursales1.setText("Sucursales");
        btnSucursales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursales1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSucursales1);
        btnSucursales1.setBounds(130, 330, 370, 60);

        btnSucursales2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSucursales2.setText("Asegurados");
        btnSucursales2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursales2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSucursales2);
        btnSucursales2.setBounds(780, 510, 370, 60);

        btnSucursales3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSucursales3.setText("Empleados");
        btnSucursales3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursales3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSucursales3);
        btnSucursales3.setBounds(780, 330, 370, 60);

        zlblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(zlblFondo);
        zlblFondo.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSucursales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursales1ActionPerformed
        VistaSucursales vistaSucursales = new VistaSucursales();
        vistaSucursales.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSucursales1ActionPerformed

    private void btnSucursales3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursales3ActionPerformed
        VistaEmpleados vistaEmpleados = new VistaEmpleados();
        vistaEmpleados.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSucursales3ActionPerformed

    private void btnSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursalesActionPerformed
        VistaSeguros vistaSeguros = new VistaSeguros();
        vistaSeguros.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSucursalesActionPerformed

    private void btnSucursales2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursales2ActionPerformed
        VistaAsegurados vistaAsegurados = new VistaAsegurados();
        vistaAsegurados.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSucursales2ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSucursales;
    private javax.swing.JButton btnSucursales1;
    private javax.swing.JButton btnSucursales2;
    private javax.swing.JButton btnSucursales3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel zlblFondo;
    // End of variables declaration//GEN-END:variables
}
