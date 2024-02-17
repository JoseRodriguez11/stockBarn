
package vista;

import control.UsuarioController;
import javax.swing.JOptionPane;
import modelo.Usuario;




public class VentanaLogin extends javax.swing.JFrame {

   private Usuario usuario;
   
    public VentanaLogin() {
        initComponents();
        vistaventan();
        
    }
    public void vistaventan(){
        setSize(415, 540);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnelPrincipal = new javax.swing.JPanel();
        txt_password_entrada = new javax.swing.JPasswordField();
        txt_correo_ingreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        FondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPnelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_password_entrada.setBackground(new java.awt.Color(238, 254, 248));
        txt_password_entrada.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPnelPrincipal.add(txt_password_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 220, 25));

        txt_correo_ingreso.setBackground(new java.awt.Color(238, 254, 248));
        txt_correo_ingreso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_correo_ingreso.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPnelPrincipal.add(txt_correo_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 220, 25));
        txt_correo_ingreso.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icono-email-30.png")); // NOI18N
        jPnelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 245, 30, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icono-password-30.png")); // NOI18N
        jPnelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 285, -1, 30));

        btn_ingresar.setBackground(new java.awt.Color(204, 255, 204));
        btn_ingresar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(51, 51, 51));
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        jPnelPrincipal.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 110, 30));

        btn_registrar.setBackground(new java.awt.Color(204, 255, 204));
        btn_registrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(51, 51, 51));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPnelPrincipal.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 110, 30));

        FondoLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\DiseñoLogin.png")); // NOI18N
        jPnelPrincipal.add(FondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPnelPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
       validarIngreso();
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        VentanaRegistro ventanaRegistro = new VentanaRegistro();
        ventanaRegistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_registrarActionPerformed

  
    private void validarIngreso() {
        String correo = txt_correo_ingreso.getText().trim();
        String password = txt_password_entrada.getText().trim();

        if (correo.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
            return;
        }

        UsuarioController usuarioController = new UsuarioController();

        if (usuarioController.validarUsuario(correo, password)) {
            
            String rol=usuarioController.buscarRol(correo);
     
            VentanaPantallaPrincipal ventanaPantallaPrincipal = new VentanaPantallaPrincipal(rol);
            ventanaPantallaPrincipal.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "El correo o la contraseña estan incorrectas");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoLogin;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPnelPrincipal;
    private javax.swing.JTextField txt_correo_ingreso;
    private javax.swing.JPasswordField txt_password_entrada;
    // End of variables declaration//GEN-END:variables
}
