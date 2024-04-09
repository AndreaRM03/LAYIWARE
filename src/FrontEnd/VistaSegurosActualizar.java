/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.Asegurado;
import BackEnd.AseguradoDAO;
import BackEnd.Empleado;
import BackEnd.EmpleadoDAO;
import BackEnd.Seguro;
import BackEnd.SeguroDAO;
import BackEnd.Sucursal;
import BackEnd.SucursalDAO;
import BackEnd.Utilidades;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author red-p
 */
public class VistaSegurosActualizar extends javax.swing.JFrame {

    /**
     * Creates new form SucursalesVistaAdmin
     */
    
    //Atributos
    private int idSeguro;
    private int idAsegurado;
    
    
    public int getIdAsegurado() {
        return idAsegurado;
    }

    public void setIdAsegurado(int idAsegurado) {
        this.idAsegurado = idAsegurado;
    }

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }
    
    
    
    public VistaSegurosActualizar(){
        initComponents();
    }
    
    public VistaSegurosActualizar(int idSeguro, int idAsegurado) {
        initComponents();
        this.idSeguro = idSeguro;
        this.idAsegurado = idAsegurado;
        
        Utilidades.cargarLogo(this, "logoLAYIWARE.png");
        
        AseguradoDAO aseguradoDAO = new AseguradoDAO();
        List<Asegurado> asegurados = aseguradoDAO.obtenerAsegurados();
        System.out.println(asegurados);
        
        for(Asegurado asegurado : asegurados){
            cmbIdAsegurado.addItem(String.valueOf(asegurado.getIdAsegurado()));
        }
        
        
        Asegurado asegurado = aseguradoDAO.obtenerAseguradoPorId(idAsegurado);
        
        cmbIdAsegurado.setSelectedItem(this.getIdAsegurado());
        txtfNombreAsegurado.setText(asegurado.getNombre() + " " + asegurado.getApellidoPaterno() + " " + asegurado.getApellidoMaterno());
        
        
        SeguroDAO seguroDAO = new SeguroDAO();
        Seguro seguro = seguroDAO.obtenerSeguroPorId(idSeguro);
        
        txtfCantidadAsegurada.setText(String.valueOf(seguro.getCantidadAsegurada()));
        txtfFolio.setText(seguro.getFolio());
        txtfVigencia.setText(seguro.getVigencia());
        txtfFechaRecepcion.setText(seguro.getFechaRecepcion());
        txtfTelefono.setText(seguro.getTelefono());
        cmbTipoSeguro.setSelectedItem(seguro.getTipoSeguro());
        
        
        
        cmbIdAsegurado.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {

                        String id = (String) cmbIdAsegurado.getSelectedItem();
                        System.out.println(id);
                        Asegurado asegurado = aseguradoDAO.obtenerAseguradoPorId(Integer.valueOf(id));
                        txtfNombreAsegurado.setText(asegurado.getNombre() +  " " + asegurado.getApellidoPaterno() + " " + asegurado.getApellidoMaterno());
                        
                    }
                }
            });
        
        //cmbIdAsegurado.setSelectedIndex(-1);
        //cmbIdAsegurado.setSelectedIndex(0);
        
        Utilidades.limitarCaracteres(txtfCantidadAsegurada, 10, "numeros");
        Utilidades.limitarCaracteres(txtfVigencia, 10, "fecha");
        Utilidades.limitarCaracteres(txtfFechaRecepcion, 10, "fecha");
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

        txtfCantidadAsegurada = new javax.swing.JTextField();
        cmbIdAsegurado = new javax.swing.JComboBox<>();
        txtfNombreAsegurado = new javax.swing.JTextField();
        txtfFolio = new javax.swing.JTextField();
        txtfVigencia = new javax.swing.JTextField();
        txtfFechaRecepcion = new javax.swing.JTextField();
        txtfTelefono = new javax.swing.JTextField();
        cmbTipoSeguro = new javax.swing.JComboBox<>();
        lblAsegurado = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        btnActualizarSeguro = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblTipoSeguro = new javax.swing.JLabel();
        lblCantidadAsegurada = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        lblVigencia = new javax.swing.JLabel();
        lblFechaRecepcion = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista Seguros Actualizar");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        txtfCantidadAsegurada.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfCantidadAsegurada.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfCantidadAsegurada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCantidadAseguradaActionPerformed(evt);
            }
        });
        getContentPane().add(txtfCantidadAsegurada);
        txtfCantidadAsegurada.setBounds(280, 280, 350, 40);

        cmbIdAsegurado.setEditable(true);
        cmbIdAsegurado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(cmbIdAsegurado);
        cmbIdAsegurado.setBounds(440, 180, 190, 40);

        txtfNombreAsegurado.setEditable(false);
        txtfNombreAsegurado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNombreAsegurado.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfNombreAsegurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreAseguradoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNombreAsegurado);
        txtfNombreAsegurado.setBounds(670, 180, 350, 40);

        txtfFolio.setEditable(false);
        txtfFolio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfFolio.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfFolio);
        txtfFolio.setBounds(670, 280, 350, 40);

        txtfVigencia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfVigencia.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfVigenciaActionPerformed(evt);
            }
        });
        getContentPane().add(txtfVigencia);
        txtfVigencia.setBounds(280, 380, 350, 40);

        txtfFechaRecepcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfFechaRecepcion.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfFechaRecepcion);
        txtfFechaRecepcion.setBounds(670, 380, 350, 40);

        txtfTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfTelefono.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfTelefono);
        txtfTelefono.setBounds(280, 480, 350, 40);

        cmbTipoSeguro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbTipoSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automóvil", "Vida", "Desempleo" }));
        cmbTipoSeguro.setPreferredSize(new java.awt.Dimension(300, 100));
        cmbTipoSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoSeguroActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoSeguro);
        cmbTipoSeguro.setBounds(670, 480, 350, 40);

        lblAsegurado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAsegurado.setText("Id Asegurado");
        lblAsegurado.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblAsegurado);
        lblAsegurado.setBounds(280, 170, 160, 60);

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTelefono.setText("Teléfono");
        lblTelefono.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(280, 440, 190, 40);

        btnActualizarSeguro.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        btnActualizarSeguro.setText("Actualizar Seguro");
        btnActualizarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarSeguroActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarSeguro);
        btnActualizarSeguro.setBounds(460, 570, 370, 60);

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

        lblTipoSeguro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTipoSeguro.setText("Tipo de Seguro");
        lblTipoSeguro.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblTipoSeguro);
        lblTipoSeguro.setBounds(670, 440, 190, 40);

        lblCantidadAsegurada.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCantidadAsegurada.setText("Cantidad asegurada");
        lblCantidadAsegurada.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblCantidadAsegurada);
        lblCantidadAsegurada.setBounds(280, 240, 350, 40);

        lblFolio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFolio.setText("Folio");
        lblFolio.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblFolio);
        lblFolio.setBounds(670, 240, 190, 40);

        lblVigencia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblVigencia.setText("Vigencia");
        lblVigencia.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblVigencia);
        lblVigencia.setBounds(280, 340, 190, 40);

        lblFechaRecepcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFechaRecepcion.setText("Fecha recepción");
        lblFechaRecepcion.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblFechaRecepcion);
        lblFechaRecepcion.setBounds(670, 340, 190, 40);

        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\fondo interfaces final (1).jpg")); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarSeguroActionPerformed
       int idAsegurado;
        try {
            idAsegurado= Integer.parseInt((String) cmbIdAsegurado.getSelectedItem());
        } catch (Exception e) {
            idAsegurado = this.getIdAsegurado();
        }
        
       
       double cantidadAsegurada = Double.valueOf(txtfCantidadAsegurada.getText());
       System.out.println(cantidadAsegurada);
        
       String folio = txtfFolio.getText();
       System.out.println(folio);
       
       String vigencia = txtfVigencia.getText();
       System.out.println(vigencia);
       
       String fechaRecepcion = txtfFechaRecepcion.getText();
       System.out.println(fechaRecepcion);
       
       String telefono = txtfTelefono.getText();
       System.out.println(telefono);
       
       String tipoSeguro = String.valueOf(cmbTipoSeguro.getSelectedItem());
       System.out.println(tipoSeguro);
        
        int result = JOptionPane.showConfirmDialog(
                new JFrame(),
                "¿Estas seguro de actualizar este seguro?", 
                "Aseguradora - confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

        if(result == JOptionPane.YES_OPTION){
            System.out.println(1);
            Seguro seguro = new Seguro(idAsegurado, cantidadAsegurada, folio, vigencia, fechaRecepcion, telefono, tipoSeguro);
            SeguroDAO seguroDAO = new SeguroDAO();


            try {
                
                seguroDAO.actualizarSeguro(seguro, idSeguro);
                System.out.println("El seguro fue actualizado exitosamente.");
                JOptionPane.showMessageDialog(null, "El seguro fue actualizado exitosamente.", "Aseguradora", JOptionPane.INFORMATION_MESSAGE);
                VistaSeguros vistaSeguros = new VistaSeguros();
                vistaSeguros.setVisible(true);
                dispose();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Ocurrió un error al intentar actualizar el seguro " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar actualizar el seguro ", "Aseguradora", JOptionPane.ERROR_MESSAGE);
            }
           
        }else if (result == JOptionPane.NO_OPTION){
            System.out.println(2);
           
        }else {
            System.out.println(3);
        }
        
    }//GEN-LAST:event_btnActualizarSeguroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VistaSeguros vistaSeguros = new VistaSeguros();
        vistaSeguros.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtfCantidadAseguradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCantidadAseguradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfCantidadAseguradaActionPerformed

    private void txtfVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfVigenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfVigenciaActionPerformed

    private void cmbTipoSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoSeguroActionPerformed

    private void txtfNombreAseguradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreAseguradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreAseguradoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaSegurosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSegurosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSegurosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSegurosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaSegurosActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarSeguro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbIdAsegurado;
    private javax.swing.JComboBox<String> cmbTipoSeguro;
    private javax.swing.JLabel lblAsegurado;
    private javax.swing.JLabel lblCantidadAsegurada;
    private javax.swing.JLabel lblFechaRecepcion;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoSeguro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVigencia;
    private javax.swing.JTextField txtfCantidadAsegurada;
    private javax.swing.JTextField txtfFechaRecepcion;
    private javax.swing.JTextField txtfFolio;
    private javax.swing.JTextField txtfNombreAsegurado;
    private javax.swing.JTextField txtfTelefono;
    private javax.swing.JTextField txtfVigencia;
    // End of variables declaration//GEN-END:variables
}
