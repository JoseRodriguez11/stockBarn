/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import control.ProductoController;
import modelo.Usuario;

/**
 *
 * @author josem
 */
public class VentanaPantallaPrincipal extends javax.swing.JFrame {

    private VentanaAgregarProducto ventanaagregar;
    private VentanaBuscarProducto ventabuscar;
    private VentanaEliminarProducto ventaeliminar;
    private VentanaInformacionGrafica ventanagrafica;
    private VentanaModificar ventanamodificar;
    private VentanaSacarProducto ventanasacar;
    private ProductoController productocontroller;
    private VentanaLogin login;
    private String rol;
    
    
    public VentanaPantallaPrincipal() {
        initComponents();
        vistaventan();
        
    }
    
    public VentanaPantallaPrincipal(String rol) {
        this.rol=rol;
        initComponents();
        vistaventan();
        if(rol.equalsIgnoreCase("administrador")){
            
        }else if(rol.equalsIgnoreCase("empleado")){
            btn_eliminar.setEnabled(false);
            btn_estadisticas.setEnabled(false);
            btn_modificar.setEnabled(false);
        }
    }
    
    
    
    public void vistaventan(){
        setSize(1455, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_sacar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_estadisticas = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_eliminar.setBackground(new java.awt.Color(31, 101, 196));
        btn_eliminar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-delete-95 (1).png")); // NOI18N
        btn_eliminar.setText("<html><center>ELIMINAR <p> PRODUCTO<html>");
        btn_eliminar.setBorder(null);
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_eliminar.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-delete-100.png")); // NOI18N
        btn_eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, 180, 180));

        btn_registrar.setBackground(new java.awt.Color(31, 101, 196));
        btn_registrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-add-95 (1).png")); // NOI18N
        btn_registrar.setText("<html><center>AGREGAR <p> PRODUCTO<html>");
        btn_registrar.setBorder(null);
        btn_registrar.setContentAreaFilled(false);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_registrar.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-add-100 (2).png")); // NOI18N
        btn_registrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 180, 180));

        btn_modificar.setBackground(new java.awt.Color(31, 101, 196));
        btn_modificar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-edit-property-95 (1).png")); // NOI18N
        btn_modificar.setText("<html><center>MODIFICAR <p> PRODUCTO<html>");
        btn_modificar.setBorder(null);
        btn_modificar.setContentAreaFilled(false);
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_modificar.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-edit-property-100.png")); // NOI18N
        btn_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 230, 180, 180));

        btn_sacar.setBackground(new java.awt.Color(31, 101, 196));
        btn_sacar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_sacar.setForeground(new java.awt.Color(0, 0, 0));
        btn_sacar.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-product-95.png")); // NOI18N
        btn_sacar.setText("<html><center>SALIDA DE <p> PRODUCTO<html>");
        btn_sacar.setBorder(null);
        btn_sacar.setContentAreaFilled(false);
        btn_sacar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sacar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sacar.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-product-95.png")); // NOI18N
        btn_sacar.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-product-100.png")); // NOI18N
        btn_sacar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sacarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 180, 180));

        btn_buscar.setBackground(new java.awt.Color(31, 101, 196));
        btn_buscar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-search-95.png")); // NOI18N
        btn_buscar.setText("<html><center>BUSCAR <p> PRODUCTO<html>");
        btn_buscar.setBorder(null);
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-search-95.png")); // NOI18N
        btn_buscar.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-search-100.png")); // NOI18N
        btn_buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, 180, 180));

        btn_estadisticas.setBackground(new java.awt.Color(31, 101, 196));
        btn_estadisticas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_estadisticas.setForeground(new java.awt.Color(0, 0, 0));
        btn_estadisticas.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-business-presentation-95.png")); // NOI18N
        btn_estadisticas.setText("<html><center>INFORMACION <p> GRAFICA<html>");
        btn_estadisticas.setBorder(null);
        btn_estadisticas.setContentAreaFilled(false);
        btn_estadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_estadisticas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_estadisticas.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-business-presentation-95.png")); // NOI18N
        btn_estadisticas.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-business-presentation-100.png")); // NOI18N
        btn_estadisticas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadisticasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 480, 180, 180));

        btn_salir.setBackground(new java.awt.Color(31, 101, 196));
        btn_salir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-exit-25.png")); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setBorder(null);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_salir.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-exit-30.png")); // NOI18N
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 40, 100, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\DIseñoPantallaPrincipal (1).png")); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        ventanaagregar=new VentanaAgregarProducto();
        ventanaagregar.setVisible(true);
       dispose();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       ventaeliminar=new VentanaEliminarProducto();
        ventaeliminar.setVisible(true);
       dispose();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        ventanamodificar=new VentanaModificar();
        ventanamodificar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_sacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sacarActionPerformed
        ventanasacar=new VentanaSacarProducto();
        ventanasacar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_sacarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        ventabuscar=new VentanaBuscarProducto();
        ventabuscar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadisticasActionPerformed
        ventanagrafica=new VentanaInformacionGrafica();
        ventanagrafica.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_estadisticasActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       productocontroller=new ProductoController();
       login=new VentanaLogin();
       productocontroller.cerrarConexion();
       dispose();
       login.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_estadisticas;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_sacar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
