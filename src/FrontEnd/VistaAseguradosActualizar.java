/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.Asegurado;
import BackEnd.AseguradoDAO;
import BackEnd.Empleado;
import BackEnd.EmpleadoDAO;
import BackEnd.Sucursal;
import BackEnd.SucursalDAO;
import BackEnd.Utilidades;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author red-p
 */
public class VistaAseguradosActualizar extends javax.swing.JFrame {

    /**
     * Creates new form SucursalesVistaAdmin
     */
    
    //Atributos
    private int idAsegurado;
    private int idSucursal;

    public int getIdAsegurado() {
        return idAsegurado;
    }

    public void setIdAsegurado(int idAsegurado) {
        this.idAsegurado = idAsegurado;
    }
    
    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    public VistaAseguradosActualizar(){
        initComponents();
        Utilidades.cargarLogo(this, "logoLAYIWARE.png");
    }
    
    public VistaAseguradosActualizar(int idAsegurado) {
        initComponents();
        
        this.idAsegurado = idAsegurado;
        
        Utilidades.cargarLogo(this, "logoLAYIWARE.png");
        
        SucursalDAO sucursalDAO = new SucursalDAO();
        List<Sucursal> sucursales = sucursalDAO.obtenerSucursales();
        System.out.println(sucursales);
        
        for(Sucursal sucursal : sucursales){
            cmbIdSucursal.addItem(String.valueOf(sucursal.getIdSucursal()));
        }
        
        AseguradoDAO aseguradoDAO = new AseguradoDAO();
        Asegurado asegurado = aseguradoDAO.obtenerAseguradoPorId(idAsegurado);
        
        this.idSucursal = asegurado.getIdSucursal();
        
        cmbIdSucursal.setSelectedItem(asegurado.getIdSucursal());
        txtfNombre.setText(asegurado.getNombre());
        txtfApellidoPaterno.setText(asegurado.getApellidoPaterno());
        txtfApellidoMaterno.setText(asegurado.getApellidoMaterno());
        txtfRFC.setText(asegurado.getRFC());
        txtfCURP.setText(asegurado.getCURP());
        txtfTelefono.setText(asegurado.getTelefono());
        
        
        Sucursal sucursal = sucursalDAO.obtenerSucursalPorId(asegurado.getIdSucursal());
        txtfNombreSucursal.setText(sucursal.getNombreSucursal());
        
        cmbIdSucursal.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {

                        String id = (String) cmbIdSucursal.getSelectedItem();
                        System.out.println(id);
                        Sucursal sucursal = sucursalDAO.obtenerSucursalPorId(Integer.valueOf(id));
                        txtfNombreSucursal.setText(sucursal.getNombreSucursal());
                        
                    }
                }
            });
        
        Utilidades.limitarCaracteres(txtfNombre, 20, "letras");
        Utilidades.limitarCaracteres(txtfApellidoPaterno, 20, "letras");
        Utilidades.limitarCaracteres(txtfApellidoMaterno, 20, "letras");
        Utilidades.limitarCaracteres(txtfRFC, 13, "alfanumerico");
        Utilidades.limitarCaracteres(txtfCURP, 18, "alfanumerico");
        Utilidades.limitarCaracteres(txtfTelefono, 10, "numeros");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        lblIdSucursal = new javax.swing.JLabel();
        cmbIdSucursal = new javax.swing.JComboBox<>();
        txtfNombreSucursal = new javax.swing.JTextField();
        txtfNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        txtfApellidoPaterno = new javax.swing.JTextField();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtfApellidoMaterno = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        txtfRFC = new javax.swing.JTextField();
        lblCURP = new javax.swing.JLabel();
        txtfCURP = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtfTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnActualizarAsegurado = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista Asegurados Actualizar");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(1160, 30, 90, 90);

        lblIdSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIdSucursal.setText("Id Sucursal");
        lblIdSucursal.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblIdSucursal);
        lblIdSucursal.setBounds(340, 190, 140, 60);

        cmbIdSucursal.setEditable(true);
        cmbIdSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbIdSucursal.setPreferredSize(new java.awt.Dimension(300, 100));
        cmbIdSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(cmbIdSucursal);
        cmbIdSucursal.setBounds(490, 200, 210, 40);

        txtfNombreSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNombreSucursal.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfNombreSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNombreSucursal);
        txtfNombreSucursal.setBounds(740, 200, 360, 40);

        txtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNombre.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(340, 290, 360, 40);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNombre.setText("Nombre");
        lblNombre.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblNombre);
        lblNombre.setBounds(340, 250, 130, 40);

        lblApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApellidoPaterno.setText("Apellido Paterno");
        lblApellidoPaterno.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblApellidoPaterno);
        lblApellidoPaterno.setBounds(740, 250, 190, 40);

        txtfApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfApellidoPaterno.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfApellidoPaterno);
        txtfApellidoPaterno.setBounds(740, 290, 360, 40);

        lblApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApellidoMaterno.setText("Apellido Materno");
        lblApellidoMaterno.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblApellidoMaterno);
        lblApellidoMaterno.setBounds(340, 340, 190, 40);

        txtfApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfApellidoMaterno.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfApellidoMaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfApellidoMaterno);
        txtfApellidoMaterno.setBounds(340, 380, 360, 40);

        lblRFC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblRFC.setText("RFC");
        lblRFC.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblRFC);
        lblRFC.setBounds(740, 340, 190, 40);

        txtfRFC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfRFC.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfRFC);
        txtfRFC.setBounds(740, 380, 360, 40);

        lblCURP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCURP.setText("CURP");
        lblCURP.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblCURP);
        lblCURP.setBounds(340, 430, 190, 40);

        txtfCURP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfCURP.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfCURP);
        txtfCURP.setBounds(340, 470, 360, 40);

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTelefono.setText("Teléfono");
        lblTelefono.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(740, 430, 190, 40);

        txtfTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfTelefono.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfTelefono);
        txtfTelefono.setBounds(740, 470, 360, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Asegurados");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(940, 80, 330, 48);

        btnActualizarAsegurado.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        btnActualizarAsegurado.setText("Actualizar Asegurado");
        btnActualizarAsegurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAseguradoActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarAsegurado);
        btnActualizarAsegurado.setBounds(510, 560, 420, 60);

        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\fondo interfaces final (1).jpg")); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, -30, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VistaAsegurados vistaAsegurados = new VistaAsegurados();
        vistaAsegurados.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbIdSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbIdSucursalActionPerformed

    private void txtfNombreSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreSucursalActionPerformed

    private void txtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreActionPerformed

    private void txtfApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfApellidoMaternoActionPerformed

    private void btnActualizarAseguradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAseguradoActionPerformed
        int idSucursal;
        try {
            idSucursal= Integer.parseInt((String) cmbIdSucursal.getSelectedItem());
        } catch (Exception e) {
            idSucursal= this.getIdSucursal();
        }
        System.out.println(idSucursal);
        
        String nombre = txtfNombre.getText();
        String apellidoPaterno = txtfApellidoPaterno.getText();
        String apellidoMaterno = txtfApellidoMaterno.getText();
        String rfc = txtfRFC.getText();
        String curp = txtfCURP.getText();
        String telefono = txtfTelefono.getText();

        System.out.println(idSucursal);
        System.out.println(nombre);
        System.out.println(apellidoPaterno);
        System.out.println(apellidoMaterno);
        System.out.println(rfc);
        System.out.println(curp);
        System.out.println(telefono);

        int result = JOptionPane.showConfirmDialog(
            new JFrame(),
            "¿Estas seguro de actualizar este asegurado?",
            "Aseguradora - confirmación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if(result == JOptionPane.YES_OPTION){
            System.out.println(1);
            Asegurado asegurado = new Asegurado(idSucursal, nombre, apellidoPaterno, apellidoMaterno, rfc, curp, telefono);
            AseguradoDAO aseguradoDAO = new AseguradoDAO();

            try {
                // Ejemplo de inserción de una nuevo empleado

                aseguradoDAO.actualizarAsegurado(asegurado, this.idAsegurado);
                System.out.println("El asegurado fue actualizado exitosamente.");
                JOptionPane.showMessageDialog(null, "El asegurado fue actualizado exitosamente.", "Aseguradora", JOptionPane.INFORMATION_MESSAGE);
                VistaAsegurados vistaAsegurados = new VistaAsegurados();
                vistaAsegurados.setVisible(true);
                dispose();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Ocurrió un error al intentar actualizar al asegurado " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar actualizar al asegurado ", "Aseguradora", JOptionPane.ERROR_MESSAGE);
            }

        }else if (result == JOptionPane.NO_OPTION){
            System.out.println(2);

        }else {
            System.out.println(3);
        }

    }//GEN-LAST:event_btnActualizarAseguradoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAseguradosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAseguradosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAseguradosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAseguradosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaAseguradosActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarAsegurado;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbIdSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblCURP;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIdSucursal;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtfApellidoMaterno;
    private javax.swing.JTextField txtfApellidoPaterno;
    private javax.swing.JTextField txtfCURP;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfNombreSucursal;
    private javax.swing.JTextField txtfRFC;
    private javax.swing.JTextField txtfTelefono;
    // End of variables declaration//GEN-END:variables
}
