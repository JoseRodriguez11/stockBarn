
package vista;

import control.InventarioController;
import java.util.Optional;
import javax.swing.JOptionPane;
import modelo.Tabla;


public class VentanaSacarProducto extends javax.swing.JFrame {
    
    private Tabla tabla=new Tabla();
    private InventarioController inventariocontroller;
     private VentanaPantallaPrincipal ventanaprincipal=new VentanaPantallaPrincipal();
    public VentanaSacarProducto() {
        initComponents();
        vistaventan();
        tabla.mostarTabla(jTableSacarProducto);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombreProducto = new javax.swing.JTextField();
        txt_cantidadSacar = new javax.swing.JTextField();
        btn_sacar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSacarProducto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-product-100 (1).png")); // NOI18N
        jLabel12.setText("<html><center>SACAR <p>PRODUCTO<html>");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 150, 190));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE DEL PRODUCTO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 139, 270, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CANTIDAD A SACAR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 710, -1, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("-Digitar un numero entero a sacar para realizar de manera correcta el proceso");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 740, -1, -1));

        txt_nombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreProducto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_nombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 410, 30));

        txt_cantidadSacar.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidadSacar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_cantidadSacar.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_cantidadSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 710, 100, -1));

        btn_sacar.setBackground(new java.awt.Color(255, 204, 204));
        btn_sacar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_sacar.setForeground(new java.awt.Color(0, 0, 0));
        btn_sacar.setText("SACAR PRODUCTO");
        btn_sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sacarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 790, 170, 50));

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

        jTableSacarProducto.setBackground(new java.awt.Color(255, 255, 255));
        jTableSacarProducto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableSacarProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "PRESENTACION", "CATEGORIA", "MARCA", "PROVEDOR", "#LOTE", "DESCRIPCION", "CANTIDAD", "ESTANTE"
            }
        ));
        jScrollPane1.setViewportView(jTableSacarProducto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 980, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\DIseñoPantallaPrincipal (2).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreProductoKeyTyped
        if (txt_nombreProducto.getText().isBlank()) {

            tabla.limpiarTabla();
            tabla.mostarTabla(jTableSacarProducto);

        } else {

            tabla.limpiarTabla();
            tabla.buscarProducto(jTableSacarProducto, txt_nombreProducto);

        }
    }//GEN-LAST:event_txt_nombreProductoKeyTyped

    private void btn_sacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sacarActionPerformed
        this.inventariocontroller =new InventarioController();
        if (filaElegida()) {
            JOptionPane.showMessageDialog(this, "Por favor, elije un item ");
            return;
        } else if (txt_cantidadSacar.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Por favor, Ingrese una valor a sacar", "INGRESAR VALOR", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Optional.ofNullable(tabla.getModelo().getValueAt(jTableSacarProducto.getSelectedRow(), jTableSacarProducto.getSelectedColumn()))
                .ifPresentOrElse(fila -> {
                    Integer id = Integer.valueOf(tabla.getModelo().getValueAt(jTableSacarProducto.getSelectedRow(), 0).toString());
                    String nombreproducto = (String) tabla.getModelo().getValueAt(jTableSacarProducto.getSelectedRow(), 1).toString();
                    
                    Integer cantidadSacar = Integer.parseInt(txt_cantidadSacar.getText());
                    if (inventariocontroller.sacarProductos(id, cantidadSacar)==true) {
                         JOptionPane.showMessageDialog(this, String.format("%d Unidades de %s sacadas con exito ",cantidadSacar,nombreproducto));
                         txt_cantidadSacar.setText("");
                    }else{
                        JOptionPane.showMessageDialog(this, "NO hay sificientes unidades para sacar", "UNIDADES INSUFICIENTES", JOptionPane.ERROR_MESSAGE);
                        txt_cantidadSacar.setText("");     
                    }

                    tabla.getModelo().fireTableDataChanged();

                }, () -> JOptionPane.showMessageDialog(this, "Por favor, elije un item"));
    }//GEN-LAST:event_btn_sacarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
       dispose();
       ventanaprincipal.setVisible(true);
    }//GEN-LAST:event_btn_atrasActionPerformed

    public boolean filaElegida(){
        return jTableSacarProducto.getSelectedRowCount()==0 || jTableSacarProducto.getSelectedColumnCount()==0;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_sacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSacarProducto;
    private javax.swing.JTextField txt_cantidadSacar;
    private javax.swing.JTextField txt_nombreProducto;
    // End of variables declaration//GEN-END:variables
}
