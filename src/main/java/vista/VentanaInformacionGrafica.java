
package vista;

import control.RegistroProductosSacadosController;
import java.time.LocalDate;
import java.util.Optional;
import javax.swing.JOptionPane;
import modelo.Tabla;


public class VentanaInformacionGrafica extends javax.swing.JFrame {

    private VentanaPantallaPrincipal ventanaprincipal;
    private VentanaGrafico ventanagrafico;
    private Tabla tabla=new Tabla(); 
    private LocalDate fechaActual= LocalDate.now();
    private LocalDate fechaHaceUnaSemana=LocalDate.now().minusWeeks(1);
    private LocalDate fechaHaceDosSemanas=LocalDate.now().minusWeeks(2);
    private LocalDate fechaHaceTresSemanas=LocalDate.now().minusWeeks(3);
    private LocalDate fechaHaceCuatroSemanas=LocalDate.now().minusWeeks(4);
    private RegistroProductosSacadosController registroproductosacadocontroller ;
    int semana1=0;
    int semana2=0;
    int semana3=0;
    int semana4=0;
    
    public VentanaInformacionGrafica() {
        initComponents();
        vistaventan();
        tabla.mostarTabla(jTableGrafica);
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
        btn_ver = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGrafica = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\icons8-business-presentation-100 (1).png")); // NOI18N
        jLabel12.setText("<html><center>INFORMACION GRAFICA <p>DEL PRODUCTO<html>");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 190, 190));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE DEL PRODUCTO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 139, -1, 30));

        txt_nombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreProducto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txt_nombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 380, 30));

        btn_ver.setBackground(new java.awt.Color(204, 255, 204));
        btn_ver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_ver.setForeground(new java.awt.Color(0, 0, 0));
        btn_ver.setText("VER");
        btn_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 790, 170, 50));

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

        jTableGrafica.setBackground(new java.awt.Color(255, 255, 255));
        jTableGrafica.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableGrafica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "PRESENTACION", "CATEGORIA", "MARCA", "PROVEDOR", "#LOTE", "DESCRIPCION", "CANTIDAD", "ESTANTE"
            }
        ));
        jScrollPane1.setViewportView(jTableGrafica);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 980, 530));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\josem\\OneDrive\\Documentos\\NetBeansProjects\\stockBarn\\src\\main\\java\\vista\\imagenes\\DIseñoPantallaPrincipal (2).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
       ventanaprincipal=new VentanaPantallaPrincipal();
        dispose();
       ventanaprincipal.setVisible(true);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verActionPerformed
        graficarProducto();
    }//GEN-LAST:event_btn_verActionPerformed

    private void txt_nombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreProductoKeyTyped
        if (txt_nombreProducto.getText().isBlank()) {

            tabla.limpiarTabla();
            tabla.mostarTabla(jTableGrafica);

        } else {

            tabla.limpiarTabla();
            tabla.buscarProducto(jTableGrafica, txt_nombreProducto);

        }
    }//GEN-LAST:event_txt_nombreProductoKeyTyped

    
    public void graficarProducto(){

        
        registroproductosacadocontroller = new RegistroProductosSacadosController();
        if (filaElegida()) {
            JOptionPane.showMessageDialog(this, "Por favor, elije un item");
            return;
        }

        Optional.ofNullable(tabla.getModelo().getValueAt(jTableGrafica.getSelectedRow(), jTableGrafica.getSelectedColumn()))
                .ifPresentOrElse(fila -> {
                    this.ventanagrafico = new VentanaGrafico();
                    Integer id = Integer.valueOf(tabla.getModelo().getValueAt(jTableGrafica.getSelectedRow(), 0).toString());
                    String nombreProducto = (String) tabla.getModelo().getValueAt(jTableGrafica.getSelectedRow(), 1);
                    
                    for (int i = 0; i < 4; i++) {
                     
                        switch (i) {
                             
                            case 0:
                                semana1 = registroproductosacadocontroller.cantidadProductoSacadoPorSemana(id, fechaHaceCuatroSemanas, fechaHaceTresSemanas);
                                break;
                            case 1:
                                semana2 = registroproductosacadocontroller.cantidadProductoSacadoPorSemana(id, fechaHaceTresSemanas, fechaHaceDosSemanas);
                                break;
                            case 2:
                                semana3 = registroproductosacadocontroller.cantidadProductoSacadoPorSemana(id, fechaHaceDosSemanas, fechaHaceUnaSemana);
                                break;
                            case 3:
                                semana4 = registroproductosacadocontroller.cantidadProductoSacadoPorSemana(id, fechaHaceUnaSemana, fechaActual);
                                break;
                        }
                        
                    }
                    ventanagrafico.graficar(semana1, semana2, semana3, semana4, nombreProducto);

                }, () -> JOptionPane.showMessageDialog(this, "Por favor, elije un item"));
        
    }
    
    public boolean filaElegida(){
        return jTableGrafica.getSelectedRowCount()==0 || jTableGrafica.getSelectedColumnCount()==0;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_ver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGrafica;
    private javax.swing.JTextField txt_nombreProducto;
    // End of variables declaration//GEN-END:variables
}
