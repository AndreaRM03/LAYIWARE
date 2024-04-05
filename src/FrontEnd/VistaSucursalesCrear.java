/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.Sucursal;
import BackEnd.SucursalDAO;
import BackEnd.Utilidades;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author red-p
 */
public class VistaSucursalesCrear extends javax.swing.JFrame {

    /**
     * Creates new form SucursalesVistaAdmin
     */
    public VistaSucursalesCrear() {
        initComponents();
        
        Utilidades.cargarLogo(this, "logoLAYIWARE.png");
        
        List<JTextField> campos;
        campos = new ArrayList<>();
        
        campos.add(txtfNombreSucursal);
        campos.add(txtfCalle);
        campos.add(txtfNumero);
        campos.add(txtfCP);
        campos.add(txtfColonia);
        campos.add(txtfMunicipio);
        //campos.add(txtfEstado);
        //campos.add(txtfPais);
        campos.add(txtfTelefono1);

        // Agregar oyente de foco a cada JTextField
        for (JTextField campo : campos) {
            campo.addFocusListener(new FocusAdapter() {
                @Override
                public void focusLost(FocusEvent e) {
                    validarCampoVacio(campo, false, false);
                }
                @Override
                public void focusGained(FocusEvent e) {
                    campo.setForeground(Color.BLACK);
                    if (campo.getText().isEmpty() ||
                        campo.getText().equals("El campo es obligatorio")) {
                        campo.setText("");
                    }
                }
            });
        }
        
        btnLimpiarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                for (JTextField campo : campos) {
                    campo.setText("");
                }
            }
            
        });
       
        Utilidades.limitarCaracteres(txtfNombreSucursal, 20, "letras");
        Utilidades.limitarCaracteres(txtfCalle, 20, "letras");
        Utilidades.limitarCaracteres(txtfNumero, 6, "numeros");
        Utilidades.limitarCaracteres(txtfCP, 5, "numeros");
        Utilidades.limitarCaracteres(txtfColonia, 20, "letras");
        Utilidades.limitarCaracteres(txtfMunicipio, 15, "letras");
        Utilidades.limitarCaracteres(txtfEstado, 10, "letras");
        Utilidades.limitarCaracteres(txtfPais, 10, "letras");
        Utilidades.limitarCaracteres(txtfTelefono1, 10, "numeros");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigoPostal = new javax.swing.JLabel();
        lblColonia = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblCalle = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblNombreSucursal = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtfNombreSucursal = new javax.swing.JTextField();
        txtfColonia = new javax.swing.JTextField();
        txtfNumero = new javax.swing.JTextField();
        txtfMunicipio = new javax.swing.JTextField();
        txtfEstado = new javax.swing.JTextField();
        txtfPais = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtfTelefono1 = new javax.swing.JTextField();
        btnCrearSucursal = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtfCP = new javax.swing.JTextField();
        txtfCalle = new javax.swing.JTextField();
        btnLimpiarTodo = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista Sucursales Crear");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblCodigoPostal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCodigoPostal.setText("Codigo postal");
        lblCodigoPostal.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblCodigoPostal);
        lblCodigoPostal.setBounds(340, 260, 160, 40);

        lblColonia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblColonia.setText("Colonia");
        lblColonia.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblColonia);
        lblColonia.setBounds(640, 260, 130, 40);

        lblMunicipio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMunicipio.setText("Municipio");
        lblMunicipio.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblMunicipio);
        lblMunicipio.setBounds(340, 360, 130, 40);

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEstado.setText("Estado");
        lblEstado.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblEstado);
        lblEstado.setBounds(640, 360, 130, 40);

        lblPais.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPais.setText("Pais");
        lblPais.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblPais);
        lblPais.setBounds(900, 360, 130, 40);

        lblCalle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCalle.setText("Calle");
        lblCalle.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblCalle);
        lblCalle.setBounds(340, 150, 130, 40);

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNumero.setText("No. #");
        lblNumero.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblNumero);
        lblNumero.setBounds(940, 150, 130, 40);

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

        txtfNombreSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNombreSucursal.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfNombreSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNombreSucursal);
        txtfNombreSucursal.setBounds(400, 80, 490, 40);

        txtfColonia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfColonia.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfColonia);
        txtfColonia.setBounds(640, 300, 460, 40);

        txtfNumero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNumero.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfNumero);
        txtfNumero.setBounds(940, 190, 160, 40);

        txtfMunicipio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfMunicipio.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfMunicipio);
        txtfMunicipio.setBounds(340, 400, 260, 40);

        txtfEstado.setEditable(false);
        txtfEstado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfEstado.setText("Jalisco");
        txtfEstado.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfEstado);
        txtfEstado.setBounds(640, 400, 220, 40);

        txtfPais.setEditable(false);
        txtfPais.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfPais.setText("México");
        txtfPais.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfPais);
        txtfPais.setBounds(900, 400, 200, 40);

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTelefono.setText("Teléfono");
        lblTelefono.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(190, 480, 120, 40);

        txtfTelefono1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfTelefono1.setPreferredSize(new java.awt.Dimension(300, 100));
        getContentPane().add(txtfTelefono1);
        txtfTelefono1.setBounds(340, 480, 260, 40);

        btnCrearSucursal.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        btnCrearSucursal.setText("Crear Sucursal");
        btnCrearSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearSucursal);
        btnCrearSucursal.setBounds(460, 570, 370, 60);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(1160, 30, 90, 90);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Sucursales");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(940, 70, 330, 48);

        txtfCP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfCP.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCPActionPerformed(evt);
            }
        });
        getContentPane().add(txtfCP);
        txtfCP.setBounds(340, 300, 260, 40);

        txtfCalle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfCalle.setPreferredSize(new java.awt.Dimension(300, 100));
        txtfCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCalleActionPerformed(evt);
            }
        });
        getContentPane().add(txtfCalle);
        txtfCalle.setBounds(340, 190, 550, 40);

        btnLimpiarTodo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLimpiarTodo.setText("Borrar campos");
        btnLimpiarTodo.setIconTextGap(0);
        getContentPane().add(btnLimpiarTodo);
        btnLimpiarTodo.setBounds(900, 480, 200, 40);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, -30, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfNombreSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreSucursalActionPerformed

    private void btnCrearSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearSucursalActionPerformed
        
        if(
            validarCampoVacio(txtfNombreSucursal, false, false) &&
            validarCampoVacio(txtfCalle, false, false) &&
            validarCampoVacio(txtfNumero, false, true) &&
            validarCampoVacio(txtfCP, false, true) &&
            validarCampoVacio(txtfColonia, false, false) &&
            validarCampoVacio(txtfMunicipio, false, false) &&
            //validarCampoVacio(txtfEstado, false, false) &&
            //validarCampoVacio(txtfPais, false, false) &&
            validarCampoVacio(txtfTelefono1, false, true) 
        ){
            
        }else{
            JOptionPane.showMessageDialog(null, "Verifica los campos", "Aseguradora", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Verifica los campos");
        }
        
        String nombreSucursal = txtfNombreSucursal.getText();
        String calle = txtfCalle.getText();
        int numero = Integer.valueOf(txtfNumero.getText());
        int cp = Integer.valueOf(txtfCP.getText());
        String colonia = txtfColonia.getText();
        String municipio = txtfMunicipio.getText();
        String estado = txtfEstado.getText();
        String pais = txtfPais.getText();
        String telefono1 = txtfTelefono1.getText();
        
        System.out.println(nombreSucursal);
        System.out.println(calle);
        System.out.println(numero);
        System.out.println(cp);
        System.out.println(colonia);
        System.out.println(municipio);
        System.out.println(estado);
        System.out.println(pais);
        System.out.println(telefono1);

        
        int result = JOptionPane.showConfirmDialog(
                new JFrame(),
                "¿Estas seguro de crear esta sucursal?", 
                "Aseguradora - confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

        if(result == JOptionPane.YES_OPTION){
            System.out.println(1);
            Sucursal sucursal = new Sucursal(nombreSucursal, calle, numero , cp, colonia, municipio, estado, pais,telefono1);
            SucursalDAO sucursalDAO = new SucursalDAO();


            try {
                // Ejemplo de inserción de una nueva sucursal

                sucursalDAO.insertarSucursal(sucursal);
                System.out.println("La sucursal fue creada exitosamente.");
                JOptionPane.showMessageDialog(null, "La sucursal fue creada exitosamente.", "Aseguradora", JOptionPane.INFORMATION_MESSAGE);
                VistaSucursales vistaSucursales = new VistaSucursales();
                vistaSucursales.setVisible(true);
                dispose();

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Ocurrió un error al intentar crear la sucursal " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar crear la sucursal ", "Aseguradora", JOptionPane.ERROR_MESSAGE);
            }
           
        }else if (result == JOptionPane.NO_OPTION){
            System.out.println(2);
           
        }else {
            System.out.println(3);
        }
    }//GEN-LAST:event_btnCrearSucursalActionPerformed

    
    public boolean validarCampoVacio(JTextField campo, boolean esFecha, boolean esNumerico) {
        boolean valido = false;
        String FORMATO_FECHA = "\\d{4}-\\d{2}-\\d{2}";
        
        String textoCampo = campo.getText().trim();
        if (textoCampo.isEmpty() || textoCampo.equals("El campo es obligatorio")) {
            campo.setForeground(Color.RED);
            campo.setText("El campo es obligatorio");
            valido = false;
        }
        else{
            campo.setForeground(Color.BLACK);
            valido = true;
        }
        
        // Si el campo es una fecha
        if(esFecha){
            Pattern pattern = Pattern.compile(FORMATO_FECHA);
            Matcher matcher = pattern.matcher(textoCampo);
           
            String regex = "^(20[1-9][5-9]|[2-9][0-9]{3})-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]|(0[1-9]|1\\d|2[0-8]))|((20[1-9][5-9]|[2-9][0-9]{3})(0[48]|[2468][048]|[13579][26])-02-29|((20[1-9][5-9]|[2-9][0-9]{3})-02-(0[1-9]|1\\d|2[0-8])))$";
            
            // Si no es un formato de fecha pone el borde en rojo
            if(!matcher.matches()){
                campo.setBorder(BorderFactory.createLineBorder(Color.RED));
                valido = false;
            }else{
                
                // Si es un formato de fecha valido, validara si la fecha es una fecha valida
                if(Pattern.matches(regex, textoCampo)){
                   campo.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                   valido = true;
                }else{
                    campo.setBorder(BorderFactory.createLineBorder(Color.RED));
                    valido = false;
                }
                
            }
        }
        
        // Si el campo debe ser numerico
        if(esNumerico){
            try {
                Double.parseDouble(textoCampo);
                // Si la conversión es exitosa, el contenido es numérico
                campo.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                valido = true;
            } catch (NumberFormatException ex) {
                // Si ocurre una excepción, el contenido no es numérico
                campo.setBorder(BorderFactory.createLineBorder(Color.RED));
                valido = false;
            }
        }
        return valido;
    }
    
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VistaSucursales vistaSucursales = new VistaSucursales();
        vistaSucursales.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtfCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfCPActionPerformed

    private void txtfCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfCalleActionPerformed

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
            java.util.logging.Logger.getLogger(VistaSucursalesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSucursalesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSucursalesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSucursalesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new VistaSucursalesCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearSucursal;
    private javax.swing.JButton btnLimpiarTodo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombreSucursal;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtfCP;
    private javax.swing.JTextField txtfCalle;
    private javax.swing.JTextField txtfColonia;
    private javax.swing.JTextField txtfEstado;
    private javax.swing.JTextField txtfMunicipio;
    private javax.swing.JTextField txtfNombreSucursal;
    private javax.swing.JTextField txtfNumero;
    private javax.swing.JTextField txtfPais;
    private javax.swing.JTextField txtfTelefono1;
    // End of variables declaration//GEN-END:variables
}
