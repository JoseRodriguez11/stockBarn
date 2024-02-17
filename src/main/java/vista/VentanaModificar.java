
package vista;


import java.util.Optional;
import javax.swing.JOptionPane;
import modelo.Tabla;


public class VentanaModificar extends javax.swing.JFrame {

    private Tabla tabla=new Tabla();
    private VentanaModificarInterna ventanainterna;
     private VentanaPantallaPrincipal ventanaprincipal;
   
    
    public VentanaModificar() {
        initComponents();
        vistaventan();
        tabla.mostarTabla(jTableModificar);
        
       
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
        jLabel12 = new javax.swing.JLabel();
        txt_nombreProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableModificar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-edit-property-100 (1).png")); // NOI18N
        jLabel12.setText("<html><center>MODIFICAR <p>PRODUCTO<html>");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 150, 190));

        txt_nombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreProducto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_nombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 460, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE DEL PRODUCTO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 129, 190, 30));

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

        btn_modificar.setBackground(new java.awt.Color(204, 255, 204));
        btn_modificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 790, 170, 50));

        jTableModificar.setBackground(new java.awt.Color(255, 255, 255));
        jTableModificar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "PRESENTACION", "CATEGORIA", "MARCA", "PROVEDOR", "#LOTE", "DESCRIPCION", "CANTIDAD", "ESTANTE"
            }
        ));
        jScrollPane1.setViewportView(jTableModificar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 980, 530));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\DIseñoPantallaPrincipal (2).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void txt_nombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreProductoKeyTyped
        if(txt_nombreProducto.getText().isBlank()){
            
            tabla.limpiarTabla();
            tabla.mostarTabla(jTableModificar);
          
        }else{
            
            tabla.limpiarTabla();
            tabla.buscarProducto(jTableModificar, txt_nombreProducto);
            
        }
    }//GEN-LAST:event_txt_nombreProductoKeyTyped

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
        if (filaElegida()) {
            JOptionPane.showMessageDialog(this, "Por favor, elije un item");
            return;
        }
        
        
        Optional.ofNullable(tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), jTableModificar.getSelectedColumn()))
                .ifPresentOrElse(fila -> {
                        ventanainterna=new VentanaModificarInterna();
                        Integer id = Integer.valueOf(tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), 0).toString());
                        String nombreProducto=(String) tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), 1);
                        String presentacion=(String) tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), 2);
                        String categoria=(String) tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), 3);
                        String marca=(String) tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), 4);
                        String provedor=(String) tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), 5);
                        String lote=(String) tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), 6);
                        String descripcion=(String) tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), 7);
                        Integer cantidad = Integer.valueOf(tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), 8).toString());
                        String estante=(String) tabla.getModelo().getValueAt(jTableModificar.getSelectedRow(), 9);
                        
                        
                        mostraDatosEnPantallaInterna(nombreProducto, presentacion, categoria, marca, provedor, lote, descripcion, cantidad, estante,id);
        
                        tabla.getModelo().fireTableDataChanged();

                }, () -> JOptionPane.showMessageDialog(this, "Por favor, elije un item"));
        
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        ventanaprincipal=new VentanaPantallaPrincipal();
        dispose();
        ventanaprincipal.setVisible(true);
    }//GEN-LAST:event_btn_atrasActionPerformed

     public boolean filaElegida(){
        return jTableModificar.getSelectedRowCount()==0 || jTableModificar.getSelectedColumnCount()==0;
    }
    
     public void mostraDatosEnPantallaInterna(String nombreProducto, String presentacion, String categoria, String marca, String provedor, String lote, String descripcion, int cantidad, String estante,int id) {
        ventanainterna.getjTextFieldNombreProductoModificar().setText(nombreProducto);
        ventanainterna.getjTextFieldPresentacionModificar().setText(presentacion);
        ventanainterna.getjComboBoxCategoriaModificar().setSelectedItem(categoria);
        ventanainterna.getjTextFieldMarcaModificar().setText(marca);
        ventanainterna.getjTextFieldProvedorModificar().setText(provedor);
        ventanainterna.getjTextFieldLoteModificar().setText(lote);
        ventanainterna.getjTextFieldAnotacionesModificar().setText(descripcion);
        ventanainterna.getjTextFieldCantidadModificar().setText(String.valueOf(cantidad));
        ventanainterna.getjTextFieldEstanteModificar().setText(estante);
        ventanainterna.setProductoId(id);
        ventanainterna.show();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableModificar;
    private javax.swing.JTextField txt_nombreProducto;
    // End of variables declaration//GEN-END:variables
}
