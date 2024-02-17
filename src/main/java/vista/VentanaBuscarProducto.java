
package vista;

import modelo.Tabla;


public class VentanaBuscarProducto extends javax.swing.JFrame {
    
    private Tabla tabla=new Tabla();
    private VentanaPantallaPrincipal ventanaprincipal=new VentanaPantallaPrincipal();
    
    
    public VentanaBuscarProducto() {
        initComponents();
        vistaventan();
        tabla.mostarTabla(jTableBuscar);
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
        txt_nombreProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuscar = new javax.swing.JTable();
        btn_atras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-search-100 (1).png")); // NOI18N
        jLabel12.setText("<html><center>BUSCAR <p>PRODUCTO<html>");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 150, 190));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE DEL PRODUCTO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 135, -1, -1));

        txt_nombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreProducto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_nombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreProductoActionPerformed(evt);
            }
        });
        txt_nombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 460, 30));

        jTableBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jTableBuscar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "PRESENTACION", "CATEGORIA", "MARCA", "PROVEDOR", "#LOTE", "DESCRIPCION", "CANTIDAD", "ESTANTE"
            }
        ));
        jScrollPane1.setViewportView(jTableBuscar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 980, 530));

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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\DIseñoPantallaPrincipal (2).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 890));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\DIseñoPantallaPrincipal (2).png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreProductoKeyTyped
        if(txt_nombreProducto.getText().isBlank()){
            
            tabla.limpiarTabla();
            tabla.mostarTabla(jTableBuscar);
          
        }else{
            
            tabla.limpiarTabla();
            tabla.buscarProducto(jTableBuscar, txt_nombreProducto);
            
        }
        
    }//GEN-LAST:event_txt_nombreProductoKeyTyped

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed

        dispose();
        ventanaprincipal.setVisible(true);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void txt_nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProductoActionPerformed
        
    }//GEN-LAST:event_txt_nombreProductoActionPerformed

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBuscar;
    private javax.swing.JTextField txt_nombreProducto;
    // End of variables declaration//GEN-END:variables
}
