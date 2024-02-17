
package vista;

import control.ProductoController;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Categoria;


public class VentanaModificarInterna extends javax.swing.JFrame {

    private ProductoController productocontroller;
    private int productoId;
    
    public VentanaModificarInterna() {
        
        initComponents();
        configurarcategoria();
        vistaventan();
    }
    public void vistaventan(){
        setSize(980, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcb_categorias = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_provedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        txt_estante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_lote = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_nombreProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_cantidadUnidades = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_presentacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_anotaciones = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CATEGORIA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 85, -1, -1));

        jcb_categorias.setBackground(new java.awt.Color(238, 254, 248));
        jcb_categorias.setForeground(new java.awt.Color(0, 0, 0));
        jcb_categorias.setOpaque(true);
        jPanel1.add(jcb_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PROVEDOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 85, -1, -1));

        txt_provedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_provedor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_provedor.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_provedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 160, 30));

        jLabel5.setBackground(new java.awt.Color(238, 254, 248));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MARCA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 85, -1, -1));

        txt_marca.setBackground(new java.awt.Color(255, 255, 255));
        txt_marca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_marca.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 220, 30));

        txt_estante.setBackground(new java.awt.Color(255, 255, 255));
        txt_estante.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_estante.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_estante, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 110, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ESTANTE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 135, -1, -1));

        txt_lote.setBackground(new java.awt.Color(255, 255, 255));
        txt_lote.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_lote.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 120, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("# LOTE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 135, -1, -1));

        txt_nombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreProducto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_nombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 230, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE PRODUCTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TOTAL DE UNIDADES");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 185, -1, -1));

        txt_cantidadUnidades.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidadUnidades.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_cantidadUnidades.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_cantidadUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("PRESENTACION ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 185, 180, -1));

        txt_presentacion.setBackground(new java.awt.Color(255, 255, 255));
        txt_presentacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_presentacion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 180, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ANOTACIONES");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        txt_anotaciones.setBackground(new java.awt.Color(255, 255, 255));
        txt_anotaciones.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_anotaciones.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_anotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 540, 170));

        jLabel2.setBackground(new java.awt.Color(106, 168, 79));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MODIFICAR DATOS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        btn_cancelar.setBackground(new java.awt.Color(204, 255, 204));
        btn_cancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 170, 50));

        btn_modificar.setBackground(new java.awt.Color(204, 255, 204));
        btn_modificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 170, 50));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void modificarProducto(int id) {
        this.productocontroller=new ProductoController();
        var filasModificadas = this.productocontroller.modificar(id,txt_nombreProducto.getText(), txt_presentacion.getText()
                , String.valueOf(jcb_categorias.getSelectedItem()), txt_marca.getText(), txt_provedor.getText()
                , txt_lote.getText(), txt_anotaciones.getText(), Integer.parseInt(txt_cantidadUnidades.getText()), txt_estante.getText());
        JOptionPane.showMessageDialog(this, "Modificado con Exito");
    }

    public void configurarcategoria() {
        for (Categoria categoria : Categoria.values()) {
            jcb_categorias.addItem(categoria.getCategoriaProductos());
        }
    }
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
        if(txt_nombreProducto.getText().isBlank() || txt_presentacion.getText().isBlank() || txt_marca.getText().isBlank() || txt_provedor.getText().isBlank()
             || txt_lote.getText().isBlank() || txt_cantidadUnidades.getText().isBlank() ){
            JOptionPane.showMessageDialog(this, "Hay Campos Sin Llenar","Verificar"  ,JOptionPane.WARNING_MESSAGE);
        }else{
             modificarProducto(productoId);
             dispose();
        }
       
    }//GEN-LAST:event_btn_modificarActionPerformed

 
    
    

    public JComboBox<String> getjComboBoxCategoriaModificar() {
        return jcb_categorias;
    }

    public void setjComboBoxCategoriaModificar(JComboBox<String> jComboBoxCategoriaModificar) {
        this.jcb_categorias = jComboBoxCategoriaModificar;
    }

    public JTextField getjTextFieldAnotacionesModificar() {
        return txt_anotaciones;
    }

    public void setjTextFieldAnotacionesModificar(JTextField jTextFieldAnotacionesModificar) {
        this.txt_anotaciones = jTextFieldAnotacionesModificar;
    }

    public JTextField getjTextFieldCantidadModificar() {
        return txt_cantidadUnidades;
    }

    public void setjTextFieldCantidadModificar(JTextField jTextFieldCantidadModificar) {
        this.txt_cantidadUnidades = jTextFieldCantidadModificar;
    }

    public JTextField getjTextFieldEstanteModificar() {
        return txt_estante;
    }

    public void setjTextFieldEstanteModificar(JTextField jTextFieldEstanteModificar) {
        this.txt_estante = jTextFieldEstanteModificar;
    }

    public JTextField getjTextFieldLoteModificar() {
        return txt_lote;
    }

    public void setjTextFieldLoteModificar(JTextField jTextFieldLoteModificar) {
        this.txt_lote = jTextFieldLoteModificar;
    }

    public JTextField getjTextFieldMarcaModificar() {
        return txt_marca;
    }

    public void setjTextFieldMarcaModificar(JTextField jTextFieldMarcaModificar) {
        this.txt_marca = jTextFieldMarcaModificar;
    }

    public JTextField getjTextFieldNombreProductoModificar() {
        return txt_nombreProducto;
    }

    public void setjTextFieldNombreProductoModificar(JTextField jTextFieldNombreProductoModificar) {
        this.txt_nombreProducto = jTextFieldNombreProductoModificar;
    }

    public JTextField getjTextFieldPresentacionModificar() {
        return txt_presentacion;
    }

    public void setjTextFieldPresentacionModificar(JTextField jTextFieldPresentacionModificar) {
        this.txt_presentacion = jTextFieldPresentacionModificar;
    }

    public JTextField getjTextFieldProvedorModificar() {
        return txt_provedor;
    }

    public void setjTextFieldProvedorModificar(JTextField jTextFieldProvedorModificar) {
        this.txt_provedor = jTextFieldProvedorModificar;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcb_categorias;
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
