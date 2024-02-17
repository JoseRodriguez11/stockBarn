
package vista;

import control.UsuarioController;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Usuario;


public class VentanaRegistro extends javax.swing.JFrame {

    
    public VentanaRegistro() {
        initComponents();
        vistaventan();
    }
    
    public void vistaventan(){
        setSize(415, 640);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jLabelCompania = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jdc_fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_nombre_compania = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jcb_rol = new javax.swing.JComboBox<>();
        txt_password_confirmada = new javax.swing.JPasswordField();
        txt_password = new javax.swing.JPasswordField();
        btn_cancelar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        labelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCorreo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCorreo.setText("Correo");
        jPanel1.add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 60, 20));

        jLabelApellido.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(51, 51, 51));
        jLabelApellido.setText("Apellidos");
        jPanel1.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 100, -1));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setText("Nombres");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 20));

        jLabelFechaNacimiento.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelFechaNacimiento.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFechaNacimiento.setText("Fecha Nacimiento");
        jPanel1.add(jLabelFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabelCompania.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelCompania.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCompania.setText("Nombre Compañia");
        jPanel1.add(jLabelCompania, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, -1));

        jLabelContrasena.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelContrasena.setForeground(new java.awt.Color(51, 51, 51));
        jLabelContrasena.setText("Cotraseña");
        jPanel1.add(jLabelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabelDireccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDireccion.setText("Direccion");
        jPanel1.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Rol");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Confirmar Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, 20));

        jdc_fecha_nacimiento.setBackground(new java.awt.Color(238, 254, 248));
        jdc_fecha_nacimiento.setForeground(new java.awt.Color(51, 51, 51));
        jdc_fecha_nacimiento.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(jdc_fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 150, 25));

        txt_nombres.setBackground(new java.awt.Color(238, 254, 248));
        txt_nombres.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 25));

        txt_apellidos.setBackground(new java.awt.Color(238, 254, 248));
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 190, 25));

        txt_correo.setBackground(new java.awt.Color(238, 254, 248));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 230, 25));

        txt_nombre_compania.setBackground(new java.awt.Color(238, 254, 248));
        jPanel1.add(txt_nombre_compania, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 230, 25));

        txt_direccion.setBackground(new java.awt.Color(238, 254, 248));
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 230, 25));

        jcb_rol.setBackground(new java.awt.Color(238, 254, 248));
        jcb_rol.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcb_rol.setForeground(new java.awt.Color(51, 51, 51));
        jcb_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));
        jPanel1.add(jcb_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 150, -1));

        txt_password_confirmada.setBackground(new java.awt.Color(238, 254, 248));
        txt_password_confirmada.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_password_confirmada.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txt_password_confirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 180, 25));

        txt_password.setBackground(new java.awt.Color(238, 254, 248));
        txt_password.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_password.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 180, 25));

        btn_cancelar.setBackground(new java.awt.Color(204, 255, 204));
        btn_cancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 110, 30));

        btn_registrar.setBackground(new java.awt.Color(204, 255, 204));
        btn_registrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(51, 51, 51));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 110, 30));

        labelfondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\Registro2.png")); // NOI18N
        jPanel1.add(labelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        registrarUsuario();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        VentanaLogin ventanaLogin = new VentanaLogin();
        ventanaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void registrarUsuario() {
        String nombres = txt_nombres.getText();
        String apellidos = txt_apellidos.getText();
        String direccion = txt_direccion.getText();
        Date fecha_nacimiento = jdc_fecha_nacimiento.getDate();
        String compania = txt_nombre_compania.getText();
        String rol = jcb_rol.getSelectedItem().toString();
        String correo = txt_correo.getText();
        
        if (!txt_password.getText().trim().equals(txt_password_confirmada.getText().trim())) {
            JOptionPane.showMessageDialog(this, "La contraseñas no son iguales", "CONFIRMACION INCORRECTA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String password = txt_password.getText();
        
        if (nombres.isBlank() || apellidos.isBlank() || direccion.isBlank() || fecha_nacimiento==null || compania.isBlank() || rol.isBlank() || correo.isBlank() || password.isBlank()) {
            JOptionPane.showMessageDialog(this, "Por Favor,Llene todos los campos");
            return;
        }
        
        
        UsuarioController usuarioController = new UsuarioController();
        Usuario usuario = new Usuario(nombres, apellidos, direccion, fecha_nacimiento, compania, rol, correo, password);

        if (usuarioController.verificarRegistro(usuario)) {
            JOptionPane.showMessageDialog(this, "El correo ya esta registrado con otra cuenta");
        } else {
            usuarioController.guardarRegistro(usuario);
            JOptionPane.showMessageDialog(this, "Registrado con exito", "Registro", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            VentanaPantallaPrincipal ventanaprincipal=new VentanaPantallaPrincipal(rol);
            ventanaprincipal.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCompania;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcb_rol;
    private com.toedter.calendar.JDateChooser jdc_fecha_nacimiento;
    private javax.swing.JLabel labelfondo;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre_compania;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password_confirmada;
    // End of variables declaration//GEN-END:variables
}
