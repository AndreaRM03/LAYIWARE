/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.Utilidades;

/**
 *
 * @author user
 */
public class VistaLogin extends javax.swing.JFrame {

    /**
     * Creates new form VistaLogin
     */
    public VistaLogin() {
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

        lblImagenLogin = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        txtfEmail = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtpPassword = new javax.swing.JPasswordField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista Sucursales Ver");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblImagenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenLogin.png"))); // NOI18N
        getContentPane().add(lblImagenLogin);
        lblImagenLogin.setBounds(480, 0, 350, 340);

        lblContrasena.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblContrasena.setText("Contraseña");
        getContentPane().add(lblContrasena);
        lblContrasena.setBounds(280, 430, 240, 50);

        lblEmail1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblEmail1.setText("Email");
        getContentPane().add(lblEmail1);
        lblEmail1.setBounds(280, 340, 120, 50);

        txtfEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtfEmail);
        txtfEmail.setBounds(420, 340, 570, 50);

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnLogin.setText("Iniciar sesión");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(500, 550, 330, 80);

        txtpPassword.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtpPassword.setText("jPasswordField1");
        getContentPane().add(txtpPassword);
        txtpPassword.setBounds(540, 430, 450, 50);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = txtfEmail.getText();
        String password = String.valueOf( txtpPassword.getPassword());
        System.out.println(email);
        System.out.println(password);
        VistaMenu vistaMenu = new VistaMenu();
        vistaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfEmailActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagenLogin;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JPasswordField txtpPassword;
    // End of variables declaration//GEN-END:variables
}
