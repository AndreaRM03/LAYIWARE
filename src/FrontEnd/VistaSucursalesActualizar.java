/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.Sucursal;
import BackEnd.SucursalDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author red-p
 */
public class VistaSucursalesActualizar extends javax.swing.JFrame {

    /**
     * Creates new form SucursalesVistaAdmin
     */
    private int idSucursal;

    // Getters and Setters
    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    public VistaSucursalesActualizar() {
        initComponents();
    }
    
    
    public VistaSucursalesActualizar(int idSucursal) {
        this.idSucursal = idSucursal;
        initComponents();
        
        SucursalDAO sucursalDAO = new SucursalDAO();
        Sucursal sucursal = sucursalDAO.obtenerSucursalPorId(idSucursal);
        
        txtfIdSucursal.setText(Integer.toString(idSucursal));
        txtfNombreSucursal.setText(sucursal.getNombreSucursal());
        txtfCalle.setText(sucursal.getCalle());
        txtfNumero.setText(Integer.toString(sucursal.getNumero()));
        txtfCP.setText(Integer.toString(sucursal.getCodigoPostal()));
        txtfColonia.setText(sucursal.getColonia());
        txtfMunicipio.setText(sucursal.getCiudad());
        txtfEstado.setText(sucursal.getEstado());
        txtfPais.setText(sucursal.getPais());
        txtfTelefono1.setText(sucursal.getTelefono());
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
        lblDireccion = new javax.swing.JLabel();
        txtfCalle = new javax.swing.JTextField();
        txtfCP = new javax.swing.JTextField();
        txtfColonia = new javax.swing.JTextField();
        txtfNumero = new javax.swing.JTextField();
        txtfMunicipio = new javax.swing.JTextField();
        txtfEstado = new javax.swing.JTextField();
        txtfPais = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtfTelefono1 = new javax.swing.JTextField();
        btnActualizarSucursal = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtfNombreSucursal = new javax.swing.JTextField();
        lblIdSucursal = new javax.swing.JLabel();
        txtfIdSucursal = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista Sucursales Actualizar");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblNombreSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNombreSucursal.setText("Nombre Sucursal");
        lblNombreSucursal.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblNombreSucursal);
        lblNombreSucursal.setBounds(190, 70, 240, 60);

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDireccion.setText("Dirección");
        lblDireccion.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(190, 190, 130, 40);

        txtfCalle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfCalle.setText("Calle:");
        txtfCalle.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCalleActionPerformed(evt);
            }
        });
        getContentPane().add(txtfCalle);
        txtfCalle.setBounds(340, 190, 550, 40);

        txtfCP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfCP.setText("CP");
        txtfCP.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCPActionPerformed(evt);
            }
        });
        getContentPane().add(txtfCP);
        txtfCP.setBounds(340, 270, 260, 40);

        txtfColonia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfColonia.setText("Colonia");
        txtfColonia.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfColonia);
        txtfColonia.setBounds(640, 270, 460, 40);

        txtfNumero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNumero.setText("No.");
        txtfNumero.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfNumero);
        txtfNumero.setBounds(940, 190, 160, 40);

        txtfMunicipio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfMunicipio.setText("Municipio");
        txtfMunicipio.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfMunicipio);
        txtfMunicipio.setBounds(340, 370, 260, 40);

        txtfEstado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfEstado.setText("Estado");
        txtfEstado.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfEstado);
        txtfEstado.setBounds(640, 370, 220, 40);

        txtfPais.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfPais.setText("País");
        txtfPais.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfPais);
        txtfPais.setBounds(900, 370, 200, 40);

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTelefono.setText("Teléfonos");
        lblTelefono.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(190, 480, 120, 40);

        txtfTelefono1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfTelefono1.setText("Teléfono 1");
        txtfTelefono1.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfTelefono1);
        txtfTelefono1.setBounds(340, 480, 260, 40);

        btnActualizarSucursal.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        btnActualizarSucursal.setText("Actualizar Sucursal");
        btnActualizarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarSucursal);
        btnActualizarSucursal.setBounds(460, 570, 410, 60);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(1160, 30, 90, 90);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Sucursales");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(940, 80, 330, 48);

        txtfNombreSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNombreSucursal.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfNombreSucursal);
        txtfNombreSucursal.setBounds(390, 80, 270, 40);

        lblIdSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIdSucursal.setText("Id Sucursal");
        lblIdSucursal.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblIdSucursal);
        lblIdSucursal.setBounds(680, 480, 130, 40);

        txtfIdSucursal.setEditable(false);
        txtfIdSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfIdSucursal.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfIdSucursal);
        txtfIdSucursal.setBounds(820, 480, 130, 40);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, -30, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfCalleActionPerformed

    private void txtfCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfCPActionPerformed

    private void btnActualizarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarSucursalActionPerformed
        String nombreSucursal = txtfNombreSucursal.getText();
        String calle = txtfCalle.getText();
        int numero = Integer.valueOf(txtfNumero.getText());
        int codigoPostal = Integer.valueOf(txtfCP.getText());
        String colonia = txtfColonia.getText();
        String municipio = txtfMunicipio.getText();
        String estado = txtfEstado.getText();
        String pais = txtfPais.getText();
        String telefono1 = txtfTelefono1.getText();
        System.out.println(nombreSucursal);
        System.out.println(calle);
        System.out.println(numero);
        System.out.println(codigoPostal);
        System.out.println(colonia);
        System.out.println(municipio);
        System.out.println(estado);
        System.out.println(pais);
        System.out.println(telefono1);
        
        
        
        
        int result = JOptionPane.showConfirmDialog(
                new JFrame(),
                "¿Estas seguro de actualizar esta sucursal?", 
                "Aseguradora - confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

        if(result == JOptionPane.YES_OPTION){
            System.out.println(1);
            Sucursal sucursal = new Sucursal(nombreSucursal, calle, numero, codigoPostal, colonia, municipio,
      estado, pais, telefono1);
                
            SucursalDAO sucursalDAO = new SucursalDAO();
            int id = sucursalDAO.actualizarSucursal(sucursal, this.getIdSucursal());
            
                if (id != 0){
                    JOptionPane.showMessageDialog(null, "Se actualizo la sucursal exitosamente", "Aseguradora", JOptionPane.INFORMATION_MESSAGE);
                    VistaSucursales vistaSucursales = new VistaSucursales();
                    vistaSucursales.setVisible(true);
                    dispose();
                }
           
        }else if (result == JOptionPane.NO_OPTION){
            System.out.println(2);
           
        }else {
            System.out.println(3);
        }
    }//GEN-LAST:event_btnActualizarSucursalActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VistaSucursales vistaSucursales = new VistaSucursales();
        vistaSucursales.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaSucursalesActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSucursalesActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSucursalesActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSucursalesActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaSucursalesActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarSucursal;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIdSucursal;
    private javax.swing.JLabel lblNombreSucursal;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtfCP;
    private javax.swing.JTextField txtfCalle;
    private javax.swing.JTextField txtfColonia;
    private javax.swing.JTextField txtfEstado;
    private javax.swing.JTextField txtfIdSucursal;
    private javax.swing.JTextField txtfMunicipio;
    private javax.swing.JTextField txtfNombreSucursal;
    private javax.swing.JTextField txtfNumero;
    private javax.swing.JTextField txtfPais;
    private javax.swing.JTextField txtfTelefono1;
    // End of variables declaration//GEN-END:variables
}
