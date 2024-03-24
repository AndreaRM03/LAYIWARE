/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author red-p
 */
public class VistaEmpleadosCrear extends javax.swing.JFrame {

    /**
     * Creates new form SucursalesVistaAdmin
     */
    public VistaEmpleadosCrear() {
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

        lblNombreSucursal = new javax.swing.JLabel();
        lblComision = new javax.swing.JLabel();
        txtfNombre = new javax.swing.JTextField();
        txtfIdEmpleado = new javax.swing.JTextField();
        txtfComision = new javax.swing.JTextField();
        btnCrearEmpleados = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtfSalario = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtfApellidoMaterno = new javax.swing.JTextField();
        txtfApellidoPaterno = new javax.swing.JTextField();
        txtfEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtpPassword = new javax.swing.JPasswordField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista Empleados Crear");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblNombreSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNombreSucursal.setText("Id Empleado");
        lblNombreSucursal.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblNombreSucursal);
        lblNombreSucursal.setBounds(190, 140, 240, 60);

        lblComision.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblComision.setText("Comisión");
        lblComision.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblComision);
        lblComision.setBounds(700, 440, 190, 40);

        txtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNombre.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(700, 190, 410, 40);

        txtfIdEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfIdEmpleado.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfIdEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIdEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfIdEmpleado);
        txtfIdEmpleado.setBounds(190, 190, 410, 40);

        txtfComision.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfComision.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfComision);
        txtfComision.setBounds(700, 480, 410, 40);

        btnCrearEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        btnCrearEmpleados.setText("Crear Empleado");
        btnCrearEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearEmpleados);
        btnCrearEmpleados.setBounds(460, 570, 370, 60);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(1160, 30, 90, 90);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Empleados");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(940, 80, 330, 48);

        txtfSalario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfSalario.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfSalarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtfSalario);
        txtfSalario.setBounds(190, 480, 410, 40);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNombre.setText("Nombre");
        lblNombre.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblNombre);
        lblNombre.setBounds(700, 150, 130, 40);

        lblSalario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSalario.setText("Salario");
        lblSalario.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblSalario);
        lblSalario.setBounds(190, 440, 190, 40);

        lblApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApellidoPaterno.setText("Apellido Paterno");
        lblApellidoPaterno.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblApellidoPaterno);
        lblApellidoPaterno.setBounds(190, 240, 190, 40);

        lblApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApellidoMaterno.setText("Apellido Materno");
        lblApellidoMaterno.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblApellidoMaterno);
        lblApellidoMaterno.setBounds(700, 240, 190, 40);

        txtfApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfApellidoMaterno.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfApellidoMaterno);
        txtfApellidoMaterno.setBounds(700, 280, 410, 40);

        txtfApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfApellidoPaterno.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfApellidoPaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfApellidoPaterno);
        txtfApellidoPaterno.setBounds(190, 280, 410, 40);

        txtfEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfEmail.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtfEmail);
        txtfEmail.setBounds(190, 380, 410, 40);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEmail.setText("Email");
        lblEmail.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblEmail);
        lblEmail.setBounds(190, 340, 190, 40);

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPassword.setText("Contraseña");
        lblPassword.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblPassword);
        lblPassword.setBounds(700, 340, 190, 40);

        txtpPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtpPassword.setText("jPasswordField1");
        getContentPane().add(txtpPassword);
        txtpPassword.setBounds(700, 380, 410, 40);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreActionPerformed

    private void txtfIdEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIdEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIdEmpleadoActionPerformed

    private void btnCrearEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpleadosActionPerformed
       String nombre = txtfNombre.getText();
       System.out.println(nombre);
       String apellidoPaterno = txtfApellidoPaterno.getText();
       System.out.println(apellidoPaterno);
       String apellidoMaterno = txtfApellidoMaterno.getText();
       System.out.println(apellidoMaterno);
       String email = txtfEmail.getText();
       System.out.println(email);
       String password = String.valueOf(txtpPassword.getPassword());
       System.out.println(password);
       double salario = Double.valueOf(txtfSalario.getText());
       System.out.println(salario);
       double comision = Double.valueOf(txtfComision.getText());
       System.out.println(comision);
       
       
       
        /*
        int idSucursal = cmbNombreSucursal.getSelectedIndex();
        String calle = txtfNombre.getText();
        int numero = Integer.valueOf(txtfNumero.getText());
        int cp = Integer.valueOf(txtfIdEmpleado.getText());
        String colonia = txtfComisión.getText();
        String municipio = txtfMunicipio.getText();
        String estado = txtfEstado.getText();
        String pais = txtfPais.getText();
        int telefono1 = Integer.valueOf(txtfTelefono1.getText());
        int telefono2 = Integer.valueOf(txtfTelefono2.getText());
        System.out.println(idSucursal);
        System.out.println(calle);
        System.out.println(numero);
        System.out.println(cp);
        System.out.println(colonia);
        System.out.println(municipio);
        System.out.println(estado);
        System.out.println(pais);
        System.out.println(telefono1);
        System.out.println(telefono2);
        */
        
        
        
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
    }//GEN-LAST:event_btnCrearEmpleadosActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VistaEmpleados vistaEmpleados = new VistaEmpleados();
        vistaEmpleados.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtfSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfSalarioActionPerformed

    private void txtfApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfApellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfApellidoPaternoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEmpleadosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaEmpleadosCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearEmpleados;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblComision;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreSucursal;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtfApellidoMaterno;
    private javax.swing.JTextField txtfApellidoPaterno;
    private javax.swing.JTextField txtfComision;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JTextField txtfIdEmpleado;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfSalario;
    private javax.swing.JPasswordField txtpPassword;
    // End of variables declaration//GEN-END:variables
}
