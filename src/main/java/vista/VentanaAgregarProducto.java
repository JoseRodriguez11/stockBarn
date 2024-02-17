
package vista;

import com.sun.source.tree.*;
import control.InventarioController;

import control.ProductoController;
import control.UsuarioController;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Inventario;
import modelo.Producto;
import modelo.Usuario;


public class VentanaAgregarProducto extends javax.swing.JFrame {
    
    private ProductoController productocontroller;
    private VentanaPantallaPrincipal ventanaprincipal;
    private InventarioController inventariocontroller;
    private UsuarioController usuariocontroller;
    private Usuario usuario;
    
    public VentanaAgregarProducto() {
       
        initComponents();
        vistaventan();
        
    }
    
    public void vistaventan(){
        setSize(1455, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
    }
    public void configurarcategoria(){
        for(Categoria categoria: Categoria.values()  ){
            jcb_categoria.addItem(categoria.getCategoriaProductos());
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelEncabezado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelEncabezado1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_nombreProducto = new javax.swing.JTextField();
        txt_provedor = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        txt_lote = new javax.swing.JTextField();
        txt_estante = new javax.swing.JTextField();
        txt_cantidadUnidades = new javax.swing.JTextField();
        txt_presentacion = new javax.swing.JTextField();
        txt_anotaciones = new javax.swing.JTextField();
        jcb_categoria = new javax.swing.JComboBox<>();
        btn_agregar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEncabezado.setBackground(new java.awt.Color(106, 168, 79));
        jLabelEncabezado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelEncabezado.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEncabezado.setText("DATOS GENERALES");
        jLabelEncabezado.setOpaque(true);
        jPanel1.add(jLabelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 990, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE PRODUCTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 185, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CATEGORIA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 95, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PROVEDOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 95, -1, -1));

        jLabel5.setBackground(new java.awt.Color(238, 254, 248));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MARCA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 95, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("# LOTE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 185, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ESTANTE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 185, -1, -1));

        jLabelEncabezado1.setBackground(new java.awt.Color(106, 168, 79));
        jLabelEncabezado1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelEncabezado1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEncabezado1.setText("DESCRIPCIÓN ");
        jLabelEncabezado1.setOpaque(true);
        jPanel1.add(jLabelEncabezado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 990, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TOTAL DE UNIDADES");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 395, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("PRESENTACION ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 395, 180, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ANOTACIONES");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-add-100 (3).png")); // NOI18N
        jLabel12.setText("<html><center>AGREGAR <p>PRODUCTO<html>");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 200, 190));

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("-Todos lo datos deben estar llenos para realizar correctamente el registro del producto.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, -1, -1));

        txt_nombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreProducto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_nombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 230, 30));

        txt_provedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_provedor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_provedor.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_provedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 160, 30));

        txt_marca.setBackground(new java.awt.Color(255, 255, 255));
        txt_marca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_marca.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 90, 220, 30));

        txt_lote.setBackground(new java.awt.Color(255, 255, 255));
        txt_lote.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_lote.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 180, 120, 30));

        txt_estante.setBackground(new java.awt.Color(255, 255, 255));
        txt_estante.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_estante.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_estante, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 180, 110, 30));

        txt_cantidadUnidades.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidadUnidades.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_cantidadUnidades.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_cantidadUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 200, 30));

        txt_presentacion.setBackground(new java.awt.Color(255, 255, 255));
        txt_presentacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_presentacion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 180, 30));

        txt_anotaciones.setBackground(new java.awt.Color(255, 255, 255));
        txt_anotaciones.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_anotaciones.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_anotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 540, 170));

        jcb_categoria.setBackground(new java.awt.Color(238, 254, 248));
        jcb_categoria.setForeground(new java.awt.Color(0, 0, 0));
        jcb_categoria.setOpaque(true);
        jPanel1.add(jcb_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 190, 30));

        btn_agregar.setBackground(new java.awt.Color(204, 255, 204));
        btn_agregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(0, 0, 0));
        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 790, 170, 50));

        btn_cancelar.setBackground(new java.awt.Color(204, 255, 204));
        btn_cancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 790, 170, 50));

        btn_atras.setBackground(new java.awt.Color(204, 255, 204));
        btn_atras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(0, 0, 0));
        btn_atras.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-return-20.png")); // NOI18N
        btn_atras.setText("  ATRAS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 790, 170, 50));

        jLabelFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\DIseñoPantallaPrincipal (2).png")); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        guardarRegistro();
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        int confirmacion=JOptionPane.showConfirmDialog(this, "¿ESTA SEGURO QUE DESEA CANCELAR EL REGISTRO?","CANCELAR REGISTRO",JOptionPane.YES_NO_OPTION);
        if (confirmacion==JOptionPane.YES_OPTION){
            limpiarFormulario();
        }
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        //this.usuariocontroller=new UsuarioController();
        ventanaprincipal=new VentanaPantallaPrincipal();
       
        if(txt_provedor.getText().isBlank() || txt_marca.getText().isBlank() || txt_nombreProducto.getText().isBlank() || txt_lote.getText().isBlank()
            || txt_estante.getText().isBlank() || txt_presentacion.getText().isBlank()){
            dispose();
            ventanaprincipal.setVisible(true);
            
        }else{
            int confirmacion=JOptionPane.showConfirmDialog(this, "¿DESEA SALIR SIN AGREGAR PRODUCTO? ","SALIR",JOptionPane.YES_NO_OPTION);
            if (confirmacion==JOptionPane.YES_OPTION){
                dispose();
                
                ventanaprincipal.setVisible(true);  
            }
        }
       
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        configurarcategoria();
    }//GEN-LAST:event_formWindowOpened

    private void  guardarRegistro(){
        this.productocontroller =new ProductoController();
        this.inventariocontroller=new InventarioController();
        var categoria= jcb_categoria.getSelectedItem();
        if( txt_provedor.getText().isBlank() || txt_marca.getText().isBlank() || txt_nombreProducto.getText().isBlank() || txt_lote.getText().isBlank()
            || txt_estante.getText().isBlank() || txt_presentacion.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS VERIFICA E INTENTA DE NUEVO.");
            return;
        }
        int cantidadInt;
        try{
            cantidadInt=Integer.parseInt(txt_cantidadUnidades.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, String.format("EL CAMPO CANTIDAD DEBE SER UN VALOR ENTERO NUMERICO DEL RANGO %d y %d", 0,Integer.MAX_VALUE));
            return;
        }
        
        var producto=new Producto(txt_nombreProducto.getText(),txt_presentacion.getText(),String.valueOf(categoria),txt_marca.getText(),txt_provedor.getText(),txt_lote.getText(),txt_anotaciones.getText());
        var inventario=new Inventario(txt_estante.getText(),cantidadInt);
        
        if(productocontroller.verificarRegistro(producto)==true){
            JOptionPane.showMessageDialog(this, "PRODUCTO YA EXISTE EN EL INVENTARIO","NO SE AGREGO EL PRODUCTO",  JOptionPane.WARNING_MESSAGE);
        }else{
            this.productocontroller.guardarRegistro(producto, String.valueOf(categoria));

            this.inventariocontroller.guardarInventario(inventario, this.productocontroller.getIdGenerado());
            JOptionPane.showMessageDialog(this, "PRODUCTO REGISTRADO CON EXITO.");
            limpiarFormulario();
        }
        
    }
    
    public void limpiarFormulario(){
        this.txt_nombreProducto.setText("");
        this.txt_anotaciones.setText("");
        this.txt_cantidadUnidades.setText("");
        this.txt_estante.setText("");
        this.txt_lote.setText("");
        this.txt_marca.setText("");
        this.txt_presentacion.setText("");
        this.txt_provedor.setText("");
        this.jcb_categoria.setSelectedIndex(0);
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEncabezado;
    private javax.swing.JLabel jLabelEncabezado1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcb_categoria;
    private javax.swing.JTextField txt_anotaciones;
    private javax.swing.JTextField txt_cantidadUnidades;
    private javax.swing.JTextField txt_estante;
    private javax.swing.JTextField txt_lote;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_nombreProducto;
    private javax.swing.JTextField txt_presentacion;
    private javax.swing.JTextField txt_provedor;
    // End of variables declaration//GEN-END:variables
}
